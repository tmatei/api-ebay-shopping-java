package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class GetMultipleItemsRequest extends AbstractRequest {

    protected List<String> ItemID;

    protected String IncludeSelector;

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }

    public List<String> getItemID() {
         return ItemID;
    }
}
