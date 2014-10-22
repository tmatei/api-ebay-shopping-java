package com.tudormatei.ebay.shopping.type;

public class VATDetailsType {

    protected boolean BusinessSeller;

    protected boolean RestrictedToBusiness;

    protected float VATPercent;

    protected String VATSite;

    protected String VATID;

    public boolean getBusinessSeller() {
        return BusinessSeller;
    }

    public void setBusinessSeller(boolean businessSeller) {
        BusinessSeller = businessSeller;
    }

    public boolean getRestrictedToBusiness() {
        return RestrictedToBusiness;
    }

    public void setRestrictedToBusiness(boolean restrictedToBusiness) {
        RestrictedToBusiness = restrictedToBusiness;
    }

    public float getVATPercent() {
        return VATPercent;
    }

    public void setVATPercent(float VATPercent) {
        this.VATPercent = VATPercent;
    }

    public String getVATSite() {
        return VATSite;
    }

    public void setVATSite(String VATSite) {
        this.VATSite = VATSite;
    }

    public String getVATID() {
        return VATID;
    }

    public void setVATID(String VATID) {
        this.VATID = VATID;
    }
}
