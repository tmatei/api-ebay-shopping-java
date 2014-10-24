package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class HalfCatalogProductType {

    protected String Title;

    protected String DetailsURL;

    protected String StockPhotoURL;

    protected ShippingCostSummaryType ShippingCostSummary;

    protected boolean DisplayStockPhotos;

    protected int ItemCount;

    protected List<ProductIDType> ProductID;

    protected String DomainName;

    protected NameValueListArrayType ItemSpecifics;

    protected SimpleItemArrayType ItemArray;

    protected int ReviewCount;

    protected AmountType MinPrice;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDetailsURL() {
        return DetailsURL;
    }

    public void setDetailsURL(String detailsURL) {
        DetailsURL = detailsURL;
    }

    public String getStockPhotoURL() {
        return StockPhotoURL;
    }

    public void setStockPhotoURL(String stockPhotoURL) {
        StockPhotoURL = stockPhotoURL;
    }

    public ShippingCostSummaryType getShippingCostSummary() {
        return ShippingCostSummary;
    }

    public void setShippingCostSummary(ShippingCostSummaryType shippingCostSummary) {
        ShippingCostSummary = shippingCostSummary;
    }

    public boolean getDisplayStockPhotos() {
        return DisplayStockPhotos;
    }

    public void setDisplayStockPhotos(boolean displayStockPhotos) {
        DisplayStockPhotos = displayStockPhotos;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public List<ProductIDType> getProductID() {
        return ProductID;
    }

    public void setProductID(List<ProductIDType> productID) {
        ProductID = productID;
    }

    public String getDomainName() {
        return DomainName;
    }

    public void setDomainName(String domainName) {
        DomainName = domainName;
    }

    public NameValueListArrayType getItemSpecifics() {
        return ItemSpecifics;
    }

    public void setItemSpecifics(NameValueListArrayType itemSpecifics) {
        ItemSpecifics = itemSpecifics;
    }

    public SimpleItemArrayType getItemArray() {
        return ItemArray;
    }

    public void setItemArray(SimpleItemArrayType itemArray) {
        ItemArray = itemArray;
    }

    public int getReviewCount() {
        return ReviewCount;
    }

    public void setReviewCount(int reviewCount) {
        ReviewCount = reviewCount;
    }

    public AmountType getMinPrice() {
        return MinPrice;
    }

    public void setMinPrice(AmountType minPrice) {
        MinPrice = minPrice;
    }
}
