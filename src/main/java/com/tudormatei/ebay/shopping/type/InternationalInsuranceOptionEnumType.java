package com.tudormatei.ebay.shopping.type;

public enum InternationalInsuranceOptionEnumType {

    OPTIONAL("Optional"),
    REQUIRED("Required"),
    NOT_OFFERED("NotOffered"),
    INCLUDED_IN_SHIPPING_HANDLING("IncludedInShippingHandling"),
    NOT_OFFERED_ON_SITE("NotOfferedOnSite"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private InternationalInsuranceOptionEnumType(final String text) {
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
