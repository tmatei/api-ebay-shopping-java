package com.tudormatei.ebay.shopping.type;

public enum ListingStatusEnumType {

    ACTIVE("Active"),
    ENDED("Ended"),
    COMPLETED("Completed"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private ListingStatusEnumType(final String text) {
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
