package com.tudormatei.ebay.shopping.type;

public enum FeedbackRatingDetailEnumType {

    ITEM_AS_DESCRIBED("ItemAsDescribed"),
    COMMUNICATIN("Communication"),
    SHIPPING_TIME("ShippingTime"),
    SHIPPING_AND_HANDLING_CHARGES("ShippingAndHandlingCharges"),
    CUSTOM_CODE("CustomCode")
    ;

    private final String text;

    /**
     * @param text enum string
     */
    private FeedbackRatingDetailEnumType(final String text) {
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
