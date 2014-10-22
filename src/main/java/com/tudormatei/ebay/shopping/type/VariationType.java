package com.tudormatei.ebay.shopping.type;

public class VariationType {

    protected String SKU;

    protected AmountType StartPrice;

    protected int Quantity;

    protected NameValueListArrayType VariationSpecifics;

    protected int QuantitySold;

    protected SellingStatusType SellingStatus;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public AmountType getStartPrice() {
        return StartPrice;
    }

    public void setStartPrice(AmountType startPrice) {
        StartPrice = startPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public NameValueListArrayType getVariationSpecifics() {
        return VariationSpecifics;
    }

    public void setVariationSpecifics(NameValueListArrayType variationSpecifics) {
        VariationSpecifics = variationSpecifics;
    }

    public int getQuantitySold() {
        return QuantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        QuantitySold = quantitySold;
    }

    public SellingStatusType getSellingStatus() {
        return SellingStatus;
    }

    public void setSellingStatus(SellingStatusType sellingStatus) {
        SellingStatus = sellingStatus;
    }
}
