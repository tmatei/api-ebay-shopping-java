package com.tudormatei.ebay.shopping.type;

public class PopularSearchesType {

    protected String CategoryID;

    protected String CategoryParentID;

    protected String QueryKeywords;

    protected String AlternativeSearches;

    protected String RelatedSearches;

    protected String CategoryName;

    protected String CategoryParentName;

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryParentID() {
        return CategoryParentID;
    }

    public void setCategoryParentID(String categoryParentID) {
        CategoryParentID = categoryParentID;
    }

    public String getQueryKeywords() {
        return QueryKeywords;
    }

    public void setQueryKeywords(String queryKeywords) {
        QueryKeywords = queryKeywords;
    }

    public String getAlternativeSearches() {
        return AlternativeSearches;
    }

    public void setAlternativeSearches(String alternativeSearches) {
        AlternativeSearches = alternativeSearches;
    }

    public String getRelatedSearches() {
        return RelatedSearches;
    }

    public void setRelatedSearches(String relatedSearches) {
        RelatedSearches = relatedSearches;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryParentName() {
        return CategoryParentName;
    }

    public void setCategoryParentName(String categoryParentName) {
        CategoryParentName = categoryParentName;
    }
}
