package com.tudormatei.ebay.shopping.request;

import com.tudormatei.ebay.shopping.type.NameValueListArrayType;

public class GetSingleItemRequest extends AbstractRequest {

    protected String ItemID;

    protected String VariationSKU;

    protected NameValueListArrayType VariationSpecifics;

    protected String IncludeSelector;

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public String getVariationSKU() {
        return VariationSKU;
    }

    public void setVariationSKU(String variationSKU) {
        VariationSKU = variationSKU;
    }

    public NameValueListArrayType getVariationSpecifics() {
        return VariationSpecifics;
    }

    public void setVariationSpecifics(NameValueListArrayType variationSpecifics) {
        VariationSpecifics = variationSpecifics;
    }

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }
}
