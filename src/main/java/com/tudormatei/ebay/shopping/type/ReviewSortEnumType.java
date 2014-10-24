package com.tudormatei.ebay.shopping.type;

public enum ReviewSortEnumType {

    CREATION_TIME("CreationTime"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private ReviewSortEnumType(final String text) {
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
