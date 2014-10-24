package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class ReviewDetailsType {

    protected float AverageRating;

    protected List<ReviewType> Review;

    public float getAverageRating() {
        return AverageRating;
    }

    public void setAverageRating(float averageRating) {
        AverageRating = averageRating;
    }

    public List<ReviewType> getReview() {
        return Review;
    }

    public void setReview(List<ReviewType> review) {
        Review = review;
    }
}
