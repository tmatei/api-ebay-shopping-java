package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class TaxTableType {

    protected List<TaxJurisdictionType> TaxJurisdiction;

    public List<TaxJurisdictionType> getTaxJurisdiction() {
        return TaxJurisdiction;
    }

    public void setTaxJurisdiction(List<TaxJurisdictionType> taxJurisdiction) {
        TaxJurisdiction = taxJurisdiction;
    }
}
