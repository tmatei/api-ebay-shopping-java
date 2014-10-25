package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.*;

public class FindReviewsAndGuidesResponse extends AbstractResponse {

    protected int ReviewCount;

    protected int BuyingGuideCount;

    protected int ReviewerRank;

    protected int TotalHelpfulnessVotes;

    protected ProductIDType ProductID;

    protected String ReviewsAndGuidesURL;

    protected int PageNumber;

    protected int TotalProducts;

    protected int TotalPages;

    protected BuyingGuideDetailsType BuyingGuideDetails;

    protected ReviewDetailsType ReviewDetails;

    protected int PositiveHelpfulnessVotes;

    public int getReviewCount() {
        return ReviewCount;
    }

    public void setReviewCount(int reviewCount) {
        ReviewCount = reviewCount;
    }

    public int getBuyingGuideCount() {
        return BuyingGuideCount;
    }

    public void setBuyingGuideCount(int buyingGuideCount) {
        BuyingGuideCount = buyingGuideCount;
    }

    public int getReviewerRank() {
        return ReviewerRank;
    }

    public void setReviewerRank(int reviewerRank) {
        ReviewerRank = reviewerRank;
    }

    public int getTotalHelpfulnessVotes() {
        return TotalHelpfulnessVotes;
    }

    public void setTotalHelpfulnessVotes(int totalHelpfulnessVotes) {
        TotalHelpfulnessVotes = totalHelpfulnessVotes;
    }

    public ProductIDType getProductID() {
        return ProductID;
    }

    public void setProductID(ProductIDType productID) {
        ProductID = productID;
    }

    public String getReviewsAndGuidesURL() {
        return ReviewsAndGuidesURL;
    }

    public void setReviewsAndGuidesURL(String reviewsAndGuidesURL) {
        ReviewsAndGuidesURL = reviewsAndGuidesURL;
    }

    public int getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(int pageNumber) {
        PageNumber = pageNumber;
    }

    public int getTotalProducts() {
        return TotalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        TotalProducts = totalProducts;
    }

    public int getTotalPages() {
        return TotalPages;
    }

    public void setTotalPages(int totalPages) {
        TotalPages = totalPages;
    }

    public BuyingGuideDetailsType getBuyingGuideDetails() {
        return BuyingGuideDetails;
    }

    public void setBuyingGuideDetails(BuyingGuideDetailsType buyingGuideDetails) {
        BuyingGuideDetails = buyingGuideDetails;
    }

    public ReviewDetailsType getReviewDetails() {
        return ReviewDetails;
    }

    public void setReviewDetails(ReviewDetailsType reviewDetails) {
        ReviewDetails = reviewDetails;
    }

    public int getPositiveHelpfulnessVotes() {
        return PositiveHelpfulnessVotes;
    }

    public void setPositiveHelpfulnessVotes(int positiveHelpfulnessVotes) {
        PositiveHelpfulnessVotes = positiveHelpfulnessVotes;
    }
}
