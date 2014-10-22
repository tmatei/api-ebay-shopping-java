package com.tudormatei.ebay.shopping.type;

public class ShippingCostSummaryType {

    protected String ShippingServiceName;

    protected AmountType ShippingServiceCost;

    protected AmountType InsuranceCost;

    protected String ShippingType;

    protected boolean LocalPickup;

    protected String InsuranceOption;

    protected AmountType ListedShippingServiceCost;

    protected AmountType ImportCharge;

    protected String LogisticPlanType;

    public String getShippingServiceName() {
        return ShippingServiceName;
    }

    public void setShippingServiceName(String shippingServiceName) {
        ShippingServiceName = shippingServiceName;
    }

    public AmountType getShippingServiceCost() {
        return ShippingServiceCost;
    }

    public void setShippingServiceCost(AmountType shippingServiceCost) {
        ShippingServiceCost = shippingServiceCost;
    }

    public AmountType getInsuranceCost() {
        return InsuranceCost;
    }

    public void setInsuranceCost(AmountType insuranceCost) {
        InsuranceCost = insuranceCost;
    }

    public String getShippingType() {
        return ShippingType;
    }

    public void setShippingType(String shippingType) {
        ShippingType = shippingType;
    }

    public boolean getLocalPickup() {
        return LocalPickup;
    }

    public void setLocalPickup(boolean localPickup) {
        LocalPickup = localPickup;
    }

    public String getInsuranceOption() {
        return InsuranceOption;
    }

    public void setInsuranceOption(String insuranceOption) {
        InsuranceOption = insuranceOption;
    }

    public AmountType getListedShippingServiceCost() {
        return ListedShippingServiceCost;
    }

    public void setListedShippingServiceCost(AmountType listedShippingServiceCost) {
        ListedShippingServiceCost = listedShippingServiceCost;
    }

    public AmountType getImportCharge() {
        return ImportCharge;
    }

    public void setImportCharge(AmountType importCharge) {
        ImportCharge = importCharge;
    }

    public String getLogisticPlanType() {
        return LogisticPlanType;
    }

    public void setLogisticPlanType(String logisticPlanType) {
        LogisticPlanType = logisticPlanType;
    }
}
