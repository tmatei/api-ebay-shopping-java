package com.tudormatei.ebay.shopping.type;

public class TaxJurisdictionType {

    protected String JurisdictionID;

    protected float SalesTaxPercent;

    protected boolean ShippingIncludedInTax;

    public String getJurisdictionID() {
        return JurisdictionID;
    }

    public void setJurisdictionID(String jurisdictionID) {
        JurisdictionID = jurisdictionID;
    }

    public float getSalesTaxPercent() {
        return SalesTaxPercent;
    }

    public void setSalesTaxPercent(float salesTaxPercent) {
        SalesTaxPercent = salesTaxPercent;
    }

    public boolean isShippingIncludedInTax() {
        return ShippingIncludedInTax;
    }

    public void setShippingIncludedInTax(boolean shippingIncludedInTax) {
        ShippingIncludedInTax = shippingIncludedInTax;
    }
}
