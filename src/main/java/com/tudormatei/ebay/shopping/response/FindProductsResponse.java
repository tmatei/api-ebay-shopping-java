package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.CatalogProductType;
import com.tudormatei.ebay.shopping.type.DomainHistogramType;
import com.tudormatei.ebay.shopping.type.SimpleItemArrayType;

import java.util.List;

public class FindProductsResponse extends AbstractResponse {

    protected int ApproximatePages;

    protected boolean MoreResults;

    protected DomainHistogramType DomainHistogram;

    protected SimpleItemArrayType ItemArray;

    protected int PageNumber;

    protected List<CatalogProductType> Product;

    protected int TotalProducts;

    protected boolean DuplicateItems;

    public int getApproximatePages() {
        return ApproximatePages;
    }

    public void setApproximatePages(int approximatePages) {
        ApproximatePages = approximatePages;
    }

    public boolean isMoreResults() {
        return MoreResults;
    }

    public void setMoreResults(boolean moreResults) {
        MoreResults = moreResults;
    }

    public DomainHistogramType getDomainHistogram() {
        return DomainHistogram;
    }

    public void setDomainHistogram(DomainHistogramType domainHistogram) {
        DomainHistogram = domainHistogram;
    }

    public SimpleItemArrayType getItemArray() {
        return ItemArray;
    }

    public void setItemArray(SimpleItemArrayType itemArray) {
        ItemArray = itemArray;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public List<CatalogProductType> getProduct() {
        return Product;
    }

    public void setProduct(List<CatalogProductType> product) {
        Product = product;
    }

    public int getTotalProducts() {
        return TotalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        TotalProducts = totalProducts;
    }

    public boolean isDuplicateItems() {
        return DuplicateItems;
    }

    public void setDuplicateItems(boolean duplicateItems) {
        DuplicateItems = duplicateItems;
    }
}
