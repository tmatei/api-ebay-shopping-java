package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class FeedbackHistoryType {

    protected List<FeedbackPeriodType> BidRetractionFeedbackPeriods;

    protected List<FeedbackPeriodType> NegativeFeedbackPeriods;

    protected List<FeedbackPeriodType> NeutralFeedbackPeriods;

    protected List<FeedbackPeriodType> PositiveFeedbackPeriods;

    protected List<FeedbackPeriodType> TotalFeedbackPeriods;

    protected long UniqueNegativeFeedbackCount;

    protected long UniquePositiveFeedbackCount;

    protected List<AverageRatingDetailsType> AverageRatingDetails;

    protected long NeutralCommentCountFromSuspendedUsers;

    protected long UniqueNeutralFeedbackCount;

    public List<FeedbackPeriodType> getBidRetractionFeedbackPeriods() {
        return BidRetractionFeedbackPeriods;
    }

    public void setBidRetractionFeedbackPeriods(List<FeedbackPeriodType> bidRetractionFeedbackPeriods) {
        BidRetractionFeedbackPeriods = bidRetractionFeedbackPeriods;
    }

    public List<FeedbackPeriodType> getNegativeFeedbackPeriods() {
        return NegativeFeedbackPeriods;
    }

    public void setNegativeFeedbackPeriods(List<FeedbackPeriodType> negativeFeedbackPeriods) {
        NegativeFeedbackPeriods = negativeFeedbackPeriods;
    }

    public List<FeedbackPeriodType> getNeutralFeedbackPeriods() {
        return NeutralFeedbackPeriods;
    }

    public void setNeutralFeedbackPeriods(List<FeedbackPeriodType> neutralFeedbackPeriods) {
        NeutralFeedbackPeriods = neutralFeedbackPeriods;
    }

    public List<FeedbackPeriodType> getPositiveFeedbackPeriods() {
        return PositiveFeedbackPeriods;
    }

    public void setPositiveFeedbackPeriods(List<FeedbackPeriodType> positiveFeedbackPeriods) {
        PositiveFeedbackPeriods = positiveFeedbackPeriods;
    }

    public List<FeedbackPeriodType> getTotalFeedbackPeriods() {
        return TotalFeedbackPeriods;
    }

    public void setTotalFeedbackPeriods(List<FeedbackPeriodType> totalFeedbackPeriods) {
        TotalFeedbackPeriods = totalFeedbackPeriods;
    }

    public long getUniqueNegativeFeedbackCount() {
        return UniqueNegativeFeedbackCount;
    }

    public void setUniqueNegativeFeedbackCount(long uniqueNegativeFeedbackCount) {
        UniqueNegativeFeedbackCount = uniqueNegativeFeedbackCount;
    }

    public long getUniquePositiveFeedbackCount() {
        return UniquePositiveFeedbackCount;
    }

    public void setUniquePositiveFeedbackCount(long uniquePositiveFeedbackCount) {
        UniquePositiveFeedbackCount = uniquePositiveFeedbackCount;
    }

    public List<AverageRatingDetailsType> getAverageRatingDetails() {
        return AverageRatingDetails;
    }

    public void setAverageRatingDetails(List<AverageRatingDetailsType> averageRatingDetails) {
        AverageRatingDetails = averageRatingDetails;
    }

    public long getNeutralCommentCountFromSuspendedUsers() {
        return NeutralCommentCountFromSuspendedUsers;
    }

    public void setNeutralCommentCountFromSuspendedUsers(long neutralCommentCountFromSuspendedUsers) {
        NeutralCommentCountFromSuspendedUsers = neutralCommentCountFromSuspendedUsers;
    }

    public long getUniqueNeutralFeedbackCount() {
        return UniqueNeutralFeedbackCount;
    }

    public void setUniqueNeutralFeedbackCount(long uniqueNeutralFeedbackCount) {
        UniqueNeutralFeedbackCount = uniqueNeutralFeedbackCount;
    }
}
