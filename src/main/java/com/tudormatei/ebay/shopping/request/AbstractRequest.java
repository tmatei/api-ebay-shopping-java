package com.tudormatei.ebay.shopping.request;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public abstract class AbstractRequest {

    protected String MessageID;

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

    public Map<String, String> toMap() {
        return toMap(this, null);
    }

    protected Map<String, String> toMap(AbstractRequest request, final String prefix) {

        Map<String, String> map = new LinkedHashMap<String, String>();
        Class cls = getClass();

        while(!cls.equals(AbstractRequest.class)) {
            for (Field field : cls.getDeclaredFields()) {
                try {
                    boolean inaccessible = false;
                    if(!Modifier.isPublic(field.getModifiers())){
                        field.setAccessible(true);
                        inaccessible = true;
                    }
                    Object fieldValue = field.get(request);
                    if(fieldValue != null){
                        String key = field.getName();
                        if(fieldValue instanceof List) {
                            int i = 0;
                            for (Object value : (List) fieldValue) {
                                map.put(key + "(" + String.valueOf(i) + ")", String.valueOf(value));
                                i++;
                            }
                        }
                        else if(fieldValue instanceof AbstractRequest) {
                            map.putAll(toMap((AbstractRequest) fieldValue, key));
                        } else if(fieldValue instanceof Date) {
                            map.put(key, dateToString((Date) fieldValue));
                        } else{
                            map.put(key, String.valueOf(fieldValue));
                        }
                    }
                    if(inaccessible){
                        field.setAccessible(false);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            cls = cls.getSuperclass();
        }

        return map;
    }

    protected String dateToString(Date date){
        return String.valueOf(date.getTime() / 1000);
    }

}
