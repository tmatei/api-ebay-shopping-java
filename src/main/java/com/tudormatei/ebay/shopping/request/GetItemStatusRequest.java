package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class GetItemStatusRequest extends AbstractRequest {

    protected List<String> ItemID;

    public List<String> getItemID() {
        return ItemID;
    }

    public void setItemID(List<String> itemID) {
        ItemID = itemID;
    }
}
