package com.tudormatei.ebay.shopping.type;

public enum ProductStateEnumType {

    UPDATE("Update"),
    UPDATE_MAJOR("UpdateMajor"),
    UPDATE_NO_DETAILS("UpdateNoDetails"),
    MERGE("Merge"),
    DELETE("Delete"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private ProductStateEnumType(final String text) {
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
