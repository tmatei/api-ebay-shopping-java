package com.tudormatei.ebay.shopping.request;

import com.tudormatei.ebay.shopping.type.ProductIDType;
import com.tudormatei.ebay.shopping.type.ProductSortEnumType;
import com.tudormatei.ebay.shopping.type.SortOrderEnumType;

import java.util.List;

public class FindHalfProductsRequest extends AbstractRequest {

    protected String IncludeSelector;

    protected Boolean AvailableItemsOnly;

    protected List<String> DomainName;

    protected ProductIDType ProductID;

    protected String QueryKeywords;

    protected String SellerID;

    protected List<ProductSortEnumType> ProductSort;

    protected List<SortOrderEnumType> SortOrder;

    protected Integer MaxEntries;

    protected Integer PageNumber;

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }

    public Boolean getAvailableItemsOnly() {
        return AvailableItemsOnly;
    }

    public void setAvailableItemsOnly(boolean availableItemsOnly) {
        AvailableItemsOnly = availableItemsOnly;
    }

    public List<String> getDomainName() {
        return DomainName;
    }

    public void setDomainName(List<String> domainName) {
        DomainName = domainName;
    }

    public ProductIDType getProductID() {
        return ProductID;
    }

    public void setProductID(ProductIDType productID) {
        ProductID = productID;
    }

    public String getQueryKeywords() {
        return QueryKeywords;
    }

    public void setQueryKeywords(String queryKeywords) {
        QueryKeywords = queryKeywords;
    }

    public String getSellerID() {
        return SellerID;
    }

    public void setSellerID(String sellerID) {
        SellerID = sellerID;
    }

    public List<ProductSortEnumType> getProductSort() {
        return ProductSort;
    }

    public void setProductSort(List<ProductSortEnumType> productSort) {
        ProductSort = productSort;
    }

    public List<SortOrderEnumType> getSortOrder() {
        return SortOrder;
    }

    public void setSortOrder(List<SortOrderEnumType> sortOrder) {
        SortOrder = sortOrder;
    }

    public Integer getMaxEntries() {
        return MaxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        MaxEntries = maxEntries;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }
}
