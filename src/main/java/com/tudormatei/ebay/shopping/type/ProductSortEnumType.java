package com.tudormatei.ebay.shopping.type;

public enum ProductSortEnumType {

    POPULARITY("Popularity"),
    RATING("Rating"),
    REVIEW_COUNT("ReviewCount"),
    TITLE("Title"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private ProductSortEnumType(final String text) {
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