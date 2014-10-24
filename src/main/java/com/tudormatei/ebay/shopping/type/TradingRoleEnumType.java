package com.tudormatei.ebay.shopping.type;

public enum TradingRoleEnumType {

    BUYER("Buyer"),
    SELLER("Seller"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private TradingRoleEnumType(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
}
