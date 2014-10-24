package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.PopularSearchesType;

public class FindPopularSearchesResponse extends AbstractResponse {

    protected PopularSearchesType PopularSearchResult;

    protected int PageNumber;

    protected int TotalPages;

    public PopularSearchesType getPopularSearchResult() {
        return PopularSearchResult;
    }

    public void setPopularSearchResult(PopularSearchesType popularSearchResult) {
        PopularSearchResult = popularSearchResult;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public int getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(int totalPages) {
        TotalPages = totalPages;
    }
}
