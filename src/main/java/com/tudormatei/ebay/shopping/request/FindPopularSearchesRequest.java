package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class FindPopularSearchesRequest extends AbstractRequest {

    protected List<String> CategoryID;

    protected String QueryKeywords;

    protected int MaxKeywords;

    protected int MaxResultsPerPage;

    protected int PageNumber;

    protected boolean IncludeChildCategories;

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

    public int getMaxKeywords() {
        return MaxKeywords;
    }

    public void setMaxKeywords(int maxKeywords) {
        MaxKeywords = maxKeywords;
    }

    public int getMaxResultsPerPage() {
        return MaxResultsPerPage;
    }

    public void setMaxResultsPerPage(int maxResultsPerPage) {
        MaxResultsPerPage = maxResultsPerPage;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public boolean getIncludeChildCategories() {
        return IncludeChildCategories;
    }

    public void setIncludeChildCategories(boolean includeChildCategories) {
        IncludeChildCategories = includeChildCategories;
    }
}
