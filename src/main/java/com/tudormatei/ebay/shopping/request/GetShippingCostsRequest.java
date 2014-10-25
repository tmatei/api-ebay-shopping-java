package com.tudormatei.ebay.shopping.request;

public class GetShippingCostsRequest extends AbstractRequest {

    protected String ItemID;

    protected Integer QuantitySold;

    protected String DestinationPostalCode;

    protected String DestinationCountryCode;

    protected Boolean IncludeDetails;

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public Integer getQuantitySold() {
        return QuantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        QuantitySold = quantitySold;
    }

    public String getDestinationPostalCode() {
        return DestinationPostalCode;
    }

    public void setDestinationPostalCode(String destinationPostalCode) {
        DestinationPostalCode = destinationPostalCode;
    }

    public String getDestinationCountryCode() {
        return DestinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        DestinationCountryCode = destinationCountryCode;
    }

    public Boolean getIncludeDetails() {
        return IncludeDetails;
    }

    public void setIncludeDetails(boolean includeDetails) {
        IncludeDetails = includeDetails;
    }
}
