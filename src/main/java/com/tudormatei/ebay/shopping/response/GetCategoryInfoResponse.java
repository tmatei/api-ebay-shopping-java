package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.CategoryArrayType;
import java.util.Date;

public class GetCategoryInfoResponse extends AbstractResponse {

    protected CategoryArrayType CategoryArray;

    protected int CategoryCount;

    protected Date UpdateTime;

    protected String CategoryVersion;

    public CategoryArrayType getCategoryArray() {
        return CategoryArray;
    }

    public void setCategoryArray(CategoryArrayType categoryArray) {
        CategoryArray = categoryArray;
    }

    public int getCategoryCount() {
        return CategoryCount;
    }

    public void setCategoryCount(int categoryCount) {
        CategoryCount = categoryCount;
    }

    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }

    public String getCategoryVersion() {
        return CategoryVersion;
    }

    public void setCategoryVersion(String categoryVersion) {
        CategoryVersion = categoryVersion;
    }
}
