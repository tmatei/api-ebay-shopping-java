package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.SimpleItemResponseType;

public class GetSingleItemResponse extends AbstractResponse {

    protected SimpleItemResponseType Item;

    public SimpleItemResponseType getItem() {
        return Item;
    }

    public void setItem(SimpleItemResponseType item) {
        Item = item;
    }
}
