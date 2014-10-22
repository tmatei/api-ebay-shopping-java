package com.tudormatei.ebay.shopping.type;

public class DiscountPriceInfoType {

    protected AmountType OriginalRetailPrice;

    protected AmountType MinimumAdvertisedPrice;

    protected String MinimumAdvertisedPriceExposure;

    protected String PricingTreatment;

    protected boolean SoldOneBay;

    protected boolean SoldOffeBay;

    public AmountType getOriginalRetailPrice() {
        return OriginalRetailPrice;
    }

    public void setOriginalRetailPrice(AmountType originalRetailPrice) {
        OriginalRetailPrice = originalRetailPrice;
    }

    public AmountType getMinimumAdvertisedPrice() {
        return MinimumAdvertisedPrice;
    }

    public void setMinimumAdvertisedPrice(AmountType minimumAdvertisedPrice) {
        MinimumAdvertisedPrice = minimumAdvertisedPrice;
    }

    public String getMinimumAdvertisedPriceExposure() {
        return MinimumAdvertisedPriceExposure;
    }

    public void setMinimumAdvertisedPriceExposure(String minimumAdvertisedPriceExposure) {
        MinimumAdvertisedPriceExposure = minimumAdvertisedPriceExposure;
    }

    public String getPricingTreatment() {
        return PricingTreatment;
    }

    public void setPricingTreatment(String pricingTreatment) {
        PricingTreatment = pricingTreatment;
    }

    public boolean getSoldOneBay() {
        return SoldOneBay;
    }

    public void setSoldOneBay(boolean soldOneBay) {
        SoldOneBay = soldOneBay;
    }

    public boolean getSoldOffeBay() {
        return SoldOffeBay;
    }

    public void setSoldOffeBay(boolean soldOffeBay) {
        SoldOffeBay = soldOffeBay;
    }
}
