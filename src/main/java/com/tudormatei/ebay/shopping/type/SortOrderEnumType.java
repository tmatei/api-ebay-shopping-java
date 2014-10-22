package com.tudormatei.ebay.shopping.type;

public enum SortOrderEnumType {

    ASCENDING("Ascending"),
    DESCENDING("Descending"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private SortOrderEnumType(final String text) {
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