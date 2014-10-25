package com.tudormatei.ebay.shopping.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ReviewType {

    @JsonProperty("URL")
    protected String Url;

    protected String Title;

    protected int Rating;

    protected String Text;

    protected String UserID;

    protected Date CreationTime;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }
}
