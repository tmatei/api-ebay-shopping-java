package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class FindPopularItemsRequest extends AbstractRequest {

    protected List<String> CategoryID;

    protected String QueryKeywords;

    protected List<String> CategoryIDExclude;

    protected Integer MaxEntries;

    protected String MessageID;

    public String getMessageID() {
        return MessageID;
    }

    public void setMessageID(String messageID) {
        MessageID = messageID;
    }

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

    public Integer getMaxEntries() {
        return MaxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        MaxEntries = maxEntries;
    }
}
