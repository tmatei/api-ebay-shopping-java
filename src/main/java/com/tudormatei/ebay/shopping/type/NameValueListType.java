package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class NameValueListType {

    protected String Name;

    protected List<String> Value;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getValue() {
        return Value;
    }

    public void setValue(List<String> value) {
        Value = value;
    }
}
