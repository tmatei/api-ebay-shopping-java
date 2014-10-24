package com.tudormatei.ebay.shopping.type;

public class AverageRatingDetailsType {

    protected FeedbackRatingDetailEnumType RatingDetail;

    protected double Rating;

    protected long RatingCount;

    public FeedbackRatingDetailEnumType getRatingDetail() {
        return RatingDetail;
    }

    public void setRatingDetail(FeedbackRatingDetailEnumType ratingDetail) {
        RatingDetail = ratingDetail;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    public long getRatingCount() {
        return RatingCount;
    }

    public void setRatingCount(long ratingCount) {
        RatingCount = ratingCount;
    }
}
