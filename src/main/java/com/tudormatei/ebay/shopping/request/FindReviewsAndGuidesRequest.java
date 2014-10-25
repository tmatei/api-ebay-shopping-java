package com.tudormatei.ebay.shopping.request;

import com.tudormatei.ebay.shopping.type.ProductIDType;
import com.tudormatei.ebay.shopping.type.ReviewSortEnumType;
import com.tudormatei.ebay.shopping.type.SortOrderEnumType;

import java.util.List;

public class FindReviewsAndGuidesRequest extends AbstractRequest {

    protected ProductIDType ProductID;

    protected String UserID;

    protected String CategoryID;

    protected Integer MaxResultsPerPage;

    protected Integer PageNumber;

    protected List<ReviewSortEnumType> ReviewSort;

    protected List<SortOrderEnumType> SortOrder;

    public ProductIDType getProductID() {
        return ProductID;
    }

    public void setProductID(ProductIDType productID) {
        ProductID = productID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
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

    public List<ReviewSortEnumType> getReviewSort() {
        return ReviewSort;
    }

    public void setReviewSort(List<ReviewSortEnumType> reviewSort) {
        ReviewSort = reviewSort;
    }

    public List<SortOrderEnumType> getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(List<SortOrderEnumType> sortOrder) {
        SortOrder = sortOrder;
    }
}
