package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.SimpleItemResponseType;

import java.util.List;

public class GetItemStatusResponse extends AbstractResponse {

    protected List<SimpleItemResponseType> Item;

    public List<SimpleItemResponseType> getItem() {
        return Item;
    }

    public void setItem(List<SimpleItemResponseType> item) {
        Item = item;
    }
}
