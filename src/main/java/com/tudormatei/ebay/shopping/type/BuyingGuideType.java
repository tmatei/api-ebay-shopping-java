package com.tudormatei.ebay.shopping.type;

import java.util.Date;

public class BuyingGuideType {

    protected String Name;

    protected String URL;

    protected String CategoryID;

    protected String Title;

    protected String Text;

    protected Date CreationTime;

    protected String UserID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }
}
