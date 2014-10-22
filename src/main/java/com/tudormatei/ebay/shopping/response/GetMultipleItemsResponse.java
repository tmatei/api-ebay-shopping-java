package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.ItemResponseType;

import java.util.ArrayList;
import java.util.List;

/*
@JsonIgnoreProperties(ignoreUnknown = true)
*/
public class GetMultipleItemsResponse extends AbstractResponse {

    protected List<ItemResponseType> Item;

    public List<ItemResponseType> getItem() {
        return Item;
    }

    public void setItem(List<ItemResponseType> item) {
        Item = item;
    }
}
