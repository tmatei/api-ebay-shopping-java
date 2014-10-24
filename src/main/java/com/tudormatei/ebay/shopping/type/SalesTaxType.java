package com.tudormatei.ebay.shopping.type;

public class SalesTaxType {

    protected float SalesTaxPercent;

    protected String SalesTaxState;

    protected boolean ShippingIncludedInTax;

    protected AmountType SalesTaxAmount;

    public float getSalesTaxPercent() {
        return SalesTaxPercent;
    }

    public void setSalesTaxPercent(float salesTaxPercent) {
        SalesTaxPercent = salesTaxPercent;
    }

    public String getSalesTaxState() {
        return SalesTaxState;
    }

    public void setSalesTaxState(String salesTaxState) {
        SalesTaxState = salesTaxState;
    }

    public boolean isShippingIncludedInTax() {
        return ShippingIncludedInTax;
    }

    public void setShippingIncludedInTax(boolean shippingIncludedInTax) {
        ShippingIncludedInTax = shippingIncludedInTax;
    }

    public AmountType getSalesTaxAmount() {
        return SalesTaxAmount;
    }

    public void setSalesTaxAmount(AmountType salesTaxAmount) {
        SalesTaxAmount = salesTaxAmount;
    }
}
