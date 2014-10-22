package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class FindPopularItemsRequest extends AbstractRequest {

    protected List<String> CategoryID;

    protected String QueryKeywords;

    protected List<String> CategoryIDExclude;

    protected int MaxEntries;

    public List<String> getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(List<String> categoryID) {
        CategoryID = categoryID;
    }

    public String getQueryKeywords() {
        return QueryKeywords;
    }

    public void setQueryKeywords(String queryKeywords) {
        QueryKeywords = queryKeywords;
    }

    public List<String> getCategoryIDExclude() {
        return CategoryIDExclude;
    }

    public void setCategoryIDExclude(List<String> categoryIDExclude) {
        CategoryIDExclude = categoryIDExclude;
    }

    public int getMaxEntries() {
        return MaxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        MaxEntries = maxEntries;
    }
}
