package com.tudormatei.ebay.shopping.type;

public enum CommentTypeEnumType {

    POSITIVE("Positive"),
    NEUTRAL("Neutral"),
    NEGATIVE("Negative"),
    WITHDRAWN("Withdrawn"),
    INDEPENDENTLY_WITHDRAWN("IndependentlyWithdrawn"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private CommentTypeEnumType(final String text) {
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
