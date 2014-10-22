package com.tudormatei.ebay.shopping.type;

public enum AckEnumType {

    SUCCESS("Success"),
    FAILURE("Failure"),
    WARNING("Warning"),
    PARTIAL_FAILURE("PartialFailure"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private AckEnumType(final String text) {
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
