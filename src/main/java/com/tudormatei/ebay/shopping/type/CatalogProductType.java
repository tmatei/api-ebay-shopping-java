package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class CatalogProductType {

    protected String DomainName;

    protected String DetailsURL;

    protected boolean DisplayStockPhotos;

    protected List<ProductIDType> ProductID;

    protected int ItemCount;

    protected NameValueListArrayType ItemSpecifics;

    protected int ReviewCount;

    protected String StockPhotoURL;

    protected String Title;

    protected ProductStateEnumType ProductState;

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String domainName) {
        DomainName = domainName;
    }

    public String getDetailsURL() {
        return DetailsURL;
    }

    public void setDetailsURL(String detailsURL) {
        DetailsURL = detailsURL;
    }

    public boolean isDisplayStockPhotos() {
        return DisplayStockPhotos;
    }

    public void setDisplayStockPhotos(boolean displayStockPhotos) {
        DisplayStockPhotos = displayStockPhotos;
    }

    public List<ProductIDType> getProductID() {
        return ProductID;
    }

    public void setProductID(List<ProductIDType> productID) {
        ProductID = productID;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public NameValueListArrayType getItemSpecifics() {
        return ItemSpecifics;
    }

    public void setItemSpecifics(NameValueListArrayType itemSpecifics) {
        ItemSpecifics = itemSpecifics;
    }

    public int getReviewCount() {
        return ReviewCount;
    }

    public void setReviewCount(int reviewCount) {
        ReviewCount = reviewCount;
    }

    public String getStockPhotoURL() {
        return StockPhotoURL;
    }

    public void setStockPhotoURL(String stockPhotoURL) {
        StockPhotoURL = stockPhotoURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ProductStateEnumType getProductState() {
        return ProductState;
    }

    public void setProductState(ProductStateEnumType productState) {
        ProductState = productState;
    }
}
