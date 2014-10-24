package com.tudormatei.ebay.shopping.type;

import java.util.Date;

public class FeedbackDetailType {

    protected String CommentingUser;

    protected int CommentingUserScore;

    protected String CommentText;

    protected Date CommentTime;

    protected CommentTypeEnumType CommentType;

    protected String FeedbackResponse;

    protected String FollowUp;

    protected String ItemID;

    protected TradingRoleEnumType Role;

    protected String ItemTitle;

    protected AmountType ItemPrice;

    protected String FeedbackID;

    protected String TransactionID;

    protected boolean CommentReplaced;

    protected boolean ResponseReplaced;

    protected boolean FollowUpReplaced;

    protected boolean Countable;

    public String getCommentingUser() {
        return CommentingUser;
    }

    public void setCommentingUser(String commentingUser) {
        CommentingUser = commentingUser;
    }

    public int getCommentingUserScore() {
        return CommentingUserScore;
    }

    public void setCommentingUserScore(int commentingUserScore) {
        CommentingUserScore = commentingUserScore;
    }

    public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String commentText) {
        CommentText = commentText;
    }

    public Date getCommentTime() {
        return CommentTime;
    }

    public void setCommentTime(Date commentTime) {
        CommentTime = commentTime;
    }

    public CommentTypeEnumType getCommentType() {
        return CommentType;
    }

    public void setCommentType(CommentTypeEnumType commentType) {
        CommentType = commentType;
    }

    public String getFeedbackResponse() {
        return FeedbackResponse;
    }

    public void setFeedbackResponse(String feedbackResponse) {
        FeedbackResponse = feedbackResponse;
    }

    public String getFollowUp() {
        return FollowUp;
    }

    public void setFollowUp(String followUp) {
        FollowUp = followUp;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public TradingRoleEnumType getRole() {
        return Role;
    }

    public void setRole(TradingRoleEnumType role) {
        Role = role;
    }

    public String getItemTitle() {
        return ItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        ItemTitle = itemTitle;
    }

    public AmountType getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(AmountType itemPrice) {
        ItemPrice = itemPrice;
    }

    public String getFeedbackID() {
        return FeedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        FeedbackID = feedbackID;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }

    public boolean isCommentReplaced() {
        return CommentReplaced;
    }

    public void setCommentReplaced(boolean commentReplaced) {
        CommentReplaced = commentReplaced;
    }

    public boolean isResponseReplaced() {
        return ResponseReplaced;
    }

    public void setResponseReplaced(boolean responseReplaced) {
        ResponseReplaced = responseReplaced;
    }

    public boolean isFollowUpReplaced() {
        return FollowUpReplaced;
    }

    public void setFollowUpReplaced(boolean followUpReplaced) {
        FollowUpReplaced = followUpReplaced;
    }

    public boolean isCountable() {
        return Countable;
    }

    public void setCountable(boolean countable) {
        Countable = countable;
    }
}
