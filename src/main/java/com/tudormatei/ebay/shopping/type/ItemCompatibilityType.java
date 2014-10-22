package com.tudormatei.ebay.shopping.type;

public class ItemCompatibilityType {

    protected NameValueListType NameValueList;

    protected String CompatibilityNotes;

    public NameValueListType getNameValueList() {
        return NameValueList;
    }

    public void setNameValueList(NameValueListType nameValueList) {
        NameValueList = nameValueList;
    }

    public String getCompatibilityNotes() {
        return CompatibilityNotes;
    }

    public void setCompatibilityNotes(String compatibilityNotes) {
        CompatibilityNotes = compatibilityNotes;
    }
}
