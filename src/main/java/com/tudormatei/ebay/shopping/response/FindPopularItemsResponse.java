package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.SimpleItemArrayType;

public class FindPopularItemsResponse extends AbstractResponse {

    protected SimpleItemArrayType ItemArray;

    public SimpleItemArrayType getItemArray() {
        return ItemArray;
    }

    public void setItemArray(SimpleItemArrayType itemArray) {
        ItemArray = itemArray;
    }
}
