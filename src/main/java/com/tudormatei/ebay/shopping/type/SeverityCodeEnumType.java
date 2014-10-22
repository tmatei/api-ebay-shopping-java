package com.tudormatei.ebay.shopping.type;

public enum SeverityCodeEnumType {

    WARNING("Warning"),
    ERROR("Error"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private SeverityCodeEnumType(final String text) {
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
