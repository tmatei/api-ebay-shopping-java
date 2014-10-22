package com.tudormatei.ebay.shopping.type;

public class BusinessSellerDetailsType {

    protected AddressType Address;

    protected String Fax;

    protected String Email;

    protected String AdditionalContactInformation;

    protected String TradeRegistrationNumber;

    protected boolean LegalInvoice;

    protected String TermsAndConditions;

    protected VATDetailsType VATDetails;

    public AddressType getAddress() {
        return Address;
    }

    public void setAddress(AddressType address) {
        Address = address;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdditionalContactInformation() {
        return AdditionalContactInformation;
    }

    public void setAdditionalContactInformation(String additionalContactInformation) {
        AdditionalContactInformation = additionalContactInformation;
    }

    public String getTradeRegistrationNumber() {
        return TradeRegistrationNumber;
    }

    public void setTradeRegistrationNumber(String tradeRegistrationNumber) {
        TradeRegistrationNumber = tradeRegistrationNumber;
    }

    public boolean getLegalInvoice() {
        return LegalInvoice;
    }

    public void setLegalInvoice(boolean legalInvoice) {
        LegalInvoice = legalInvoice;
    }

    public String getTermsAndConditions() {
        return TermsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        TermsAndConditions = termsAndConditions;
    }

    public VATDetailsType getVATDetails() {
        return VATDetails;
    }

    public void setVATDetails(VATDetailsType VATDetails) {
        this.VATDetails = VATDetails;
    }
}
