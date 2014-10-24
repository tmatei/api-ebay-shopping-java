package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class SimpleItemArrayType {

    protected List<SimpleItemResponseType> Item;

    public List<SimpleItemResponseType> getItem() {
        return Item;
    }

    public void setItem(List<SimpleItemResponseType> item) {
        Item = item;
    }
}
