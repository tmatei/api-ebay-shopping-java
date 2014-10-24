package com.tudormatei.ebay.shopping.request;

import com.tudormatei.ebay.shopping.type.NameValueListArrayType;

public class GetUserProfileRequest extends AbstractRequest {

    protected String UserID;

    protected String IncludeSelector;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getIncludeSelector() {
        return IncludeSelector;
    }

    public void setIncludeSelector(String includeSelector) {
        IncludeSelector = includeSelector;
    }
}
