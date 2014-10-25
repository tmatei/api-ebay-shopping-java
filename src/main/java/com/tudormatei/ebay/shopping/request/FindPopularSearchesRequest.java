package com.tudormatei.ebay.shopping.request;

import java.util.List;

public class FindPopularSearchesRequest extends AbstractRequest {

    protected List<String> CategoryID;

    protected String QueryKeywords;

    protected Integer MaxKeywords;

    protected Integer MaxResultsPerPage;

    protected Integer PageNumber;

    protected Boolean IncludeChildCategories;

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

    public Integer getMaxKeywords() {
        return MaxKeywords;
    }

    public void setMaxKeywords(int maxKeywords) {
        MaxKeywords = maxKeywords;
    }

    public Integer getMaxResultsPerPage() {
        return MaxResultsPerPage;
    }

    public void setMaxResultsPerPage(int maxResultsPerPage) {
        MaxResultsPerPage = maxResultsPerPage;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public Boolean getIncludeChildCategories() {
        return IncludeChildCategories;
    }

    public void setIncludeChildCategories(boolean includeChildCategories) {
        IncludeChildCategories = includeChildCategories;
    }
}
