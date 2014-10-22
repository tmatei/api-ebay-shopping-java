package com.tudormatei.ebay.shopping.type;

public enum ErrorClassificationEnumType {

    REQUEST_ERROR("RequestError"),
    SYSTEM_ERROR("SystemError"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private ErrorClassificationEnumType(final String text) {
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
