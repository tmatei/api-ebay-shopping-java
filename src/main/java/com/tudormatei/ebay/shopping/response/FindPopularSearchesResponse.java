package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.PopularSearchesType;

import java.util.List;

public class FindPopularSearchesResponse extends AbstractResponse {

    protected List<PopularSearchesType> PopularSearchResult;

    protected int PageNumber;

    protected int TotalPages;

    public List<PopularSearchesType> getPopularSearchResult() {
        return PopularSearchResult;
    }

    public void setPopularSearchResult(List<PopularSearchesType> popularSearchResult) {
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
