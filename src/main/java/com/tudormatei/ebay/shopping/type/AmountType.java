package com.tudormatei.ebay.shopping.type;

public class AmountType {

    protected String CurrencyID;

    protected Double Value;

    public String getCurrencyID() {
        return CurrencyID;
    }

    public void setCurrencyID(String currencyID) {
        CurrencyID = currencyID;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }
}
