package com.tudormatei.ebay.shopping.request;

public class GetCategoryInfoRequest extends AbstractRequest {

    protected String CategoryID;

    protected String IncludeSelector;

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }
}
