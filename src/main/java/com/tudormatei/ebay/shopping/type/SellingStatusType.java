package com.tudormatei.ebay.shopping.type;

public class SellingStatusType {

    protected AmountType ConvertedCurrentPrice;

    protected AmountType CurrentPrice;

    protected int QuantitySold;

    protected int QuantitySoldByPickupInStore;

    public AmountType getConvertedCurrentPrice() {
        return ConvertedCurrentPrice;
    }

    public AmountType getCurrentPrice() {
        return CurrentPrice;
    }

    public int getQuantitySold() {
        return QuantitySold;
    }

    public int getQuantitySoldByPickupInStore() {
        return QuantitySoldByPickupInStore;
    }
}
