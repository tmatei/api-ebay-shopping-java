package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.DomainHistogramType;
import com.tudormatei.ebay.shopping.type.HalfProductsType;

public class FindHalfProductsResponse extends AbstractResponse {

    protected DomainHistogramType DomainHistogram;

    protected int PageNumber;

    protected int ApproximatePages;

    protected boolean MoreResults;

    protected int TotalProducts;

    protected HalfProductsType Products;

    protected String ProductSearchURL;

    public DomainHistogramType getDomainHistogram() {
        return DomainHistogram;
    }

    public void setDomainHistogram(DomainHistogramType domainHistogram) {
        DomainHistogram = domainHistogram;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public int getApproximatePages() {
        return ApproximatePages;
    }

    public void setApproximatePages(int approximatePages) {
        ApproximatePages = approximatePages;
    }

    public boolean getMoreResults() {
        return MoreResults;
    }

    public void setMoreResults(boolean moreResults) {
        MoreResults = moreResults;
    }

    public int getTotalProducts() {
        return TotalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        TotalProducts = totalProducts;
    }

    public HalfProductsType getProducts() {
        return Products;
    }

    public void setProducts(HalfProductsType products) {
        Products = products;
    }

    public String getProductSearchURL() {
        return ProductSearchURL;
    }

    public void setProductSearchURL(String productSearchURL) {
        ProductSearchURL = productSearchURL;
    }
}
