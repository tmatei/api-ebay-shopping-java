package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.FeedbackDetailType;
import com.tudormatei.ebay.shopping.type.FeedbackHistoryType;
import com.tudormatei.ebay.shopping.type.SimpleUserType;

import java.util.List;

public class GetUserProfileResponse extends AbstractResponse {

    protected SimpleUserType User;

    protected FeedbackHistoryType FeedbackHistory;

    protected List<FeedbackDetailType> FeedbackDetails;

    public SimpleUserType getUser() {
        return User;
    }

    public void setUser(SimpleUserType user) {
        User = user;
    }

    public FeedbackHistoryType getFeedbackHistory() {
        return FeedbackHistory;
    }

    public void setFeedbackHistory(FeedbackHistoryType feedbackHistory) {
        FeedbackHistory = feedbackHistory;
    }

    public List<FeedbackDetailType> getFeedbackDetails() {
        return FeedbackDetails;
    }

    public void setFeedbackDetails(List<FeedbackDetailType> feedbackDetails) {
        FeedbackDetails = feedbackDetails;
    }
}
