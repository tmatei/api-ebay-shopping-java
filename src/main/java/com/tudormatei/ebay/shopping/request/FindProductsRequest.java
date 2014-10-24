package com.tudormatei.ebay.shopping.request;

import com.tudormatei.ebay.shopping.type.ProductIDType;
import com.tudormatei.ebay.shopping.type.ProductSortEnumType;
import com.tudormatei.ebay.shopping.type.SortOrderEnumType;

import java.util.List;

public class FindProductsRequest extends AbstractRequest {

    protected String IncludeSelector;

    protected boolean AvailableItemsOnly;

    protected List<String> DomainName;

    protected ProductIDType ProductID;

    protected String QueryKeywords;

    protected List<ProductSortEnumType> ProductSort;

    protected List<SortOrderEnumType> SortOrder;

    protected int MaxEntries;

    protected int PageNumber;

    protected String CategoryID;

    protected boolean HideDuplicateItems;

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }

    public boolean getAvailableItemsOnly() {
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

    public int getMaxEntries() {
        return MaxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        MaxEntries = maxEntries;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public boolean getHideDuplicateItems() {
        return HideDuplicateItems;
    }

    public void setHideDuplicateItems(boolean hideDuplicateItems) {
        HideDuplicateItems = hideDuplicateItems;
    }
}
