package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class ShippingDetailsType {

    protected boolean GetItFast;

    protected AmountType InsuranceCost;

    protected InsuranceOptionEnumType InsuranceOption;

    protected List<InternationalShippingServiceOptionType> InternationalShippingServiceOption;

    protected SalesTaxType SalesTax;

    protected String ShippingRateErrorMessage;

    protected List<ShippingServiceOptionType> ShippingServiceOption;

    protected TaxTableType TaxTable;

    protected AmountType InternationalInsuranceCost;

    protected InternationalInsuranceOptionEnumType InternationalInsuranceOption;

    protected AmountType CODCost;

    protected List<String> ExcludeShipToLocation;

    public boolean isGetItFast() {
        return GetItFast;
    }

    public void setGetItFast(boolean getItFast) {
        GetItFast = getItFast;
    }

    public AmountType getInsuranceCost() {
        return InsuranceCost;
    }

    public void setInsuranceCost(AmountType insuranceCost) {
        InsuranceCost = insuranceCost;
    }

    public InsuranceOptionEnumType getInsuranceOption() {
        return InsuranceOption;
    }

    public void setInsuranceOption(InsuranceOptionEnumType insuranceOption) {
        InsuranceOption = insuranceOption;
    }

    public List<InternationalShippingServiceOptionType> getInternationalShippingServiceOption() {
        return InternationalShippingServiceOption;
    }

    public void setInternationalShippingServiceOption(List<InternationalShippingServiceOptionType> internationalShippingServiceOption) {
        InternationalShippingServiceOption = internationalShippingServiceOption;
    }

    public SalesTaxType getSalesTax() {
        return SalesTax;
    }

    public void setSalesTax(SalesTaxType salesTax) {
        SalesTax = salesTax;
    }

    public String getShippingRateErrorMessage() {
        return ShippingRateErrorMessage;
    }

    public void setShippingRateErrorMessage(String shippingRateErrorMessage) {
        ShippingRateErrorMessage = shippingRateErrorMessage;
    }

    public List<ShippingServiceOptionType> getShippingServiceOption() {
        return ShippingServiceOption;
    }

    public void setShippingServiceOption(List<ShippingServiceOptionType> shippingServiceOption) {
        ShippingServiceOption = shippingServiceOption;
    }

    public TaxTableType getTaxTable() {
        return TaxTable;
    }

    public void setTaxTable(TaxTableType taxTable) {
        TaxTable = taxTable;
    }

    public AmountType getInternationalInsuranceCost() {
        return InternationalInsuranceCost;
    }

    public void setInternationalInsuranceCost(AmountType internationalInsuranceCost) {
        InternationalInsuranceCost = internationalInsuranceCost;
    }

    public InternationalInsuranceOptionEnumType getInternationalInsuranceOption() {
        return InternationalInsuranceOption;
    }

    public void setInternationalInsuranceOption(InternationalInsuranceOptionEnumType internationalInsuranceOption) {
        InternationalInsuranceOption = internationalInsuranceOption;
    }

    public AmountType getCODCost() {
        return CODCost;
    }

    public void setCODCost(AmountType CODCost) {
        this.CODCost = CODCost;
    }

    public List<String> getExcludeShipToLocation() {
        return ExcludeShipToLocation;
    }

    public void setExcludeShipToLocation(List<String> excludeShipToLocation) {
        ExcludeShipToLocation = excludeShipToLocation;
    }
}
