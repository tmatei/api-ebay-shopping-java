package com.tudormatei.ebay.shopping.type;

public class CategoryType {

    protected String CategoryID;

    protected int CategoryLevel;

    protected String CategoryName;

    protected String CategoryParentID;

    protected String CategoryParentName;

    protected int ItemCount;

    protected String CategoryNamePath;

    protected String CategoryIDPath;

    protected boolean LeafCategory;

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public int getCategoryLevel() {
        return CategoryLevel;
    }

    public void setCategoryLevel(int categoryLevel) {
        CategoryLevel = categoryLevel;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryParentID() {
        return CategoryParentID;
    }

    public void setCategoryParentID(String categoryParentID) {
        CategoryParentID = categoryParentID;
    }

    public String getCategoryParentName() {
        return CategoryParentName;
    }

    public void setCategoryParentName(String categoryParentName) {
        CategoryParentName = categoryParentName;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public String getCategoryNamePath() {
        return CategoryNamePath;
    }

    public void setCategoryNamePath(String categoryNamePath) {
        CategoryNamePath = categoryNamePath;
    }

    public String getCategoryIDPath() {
        return CategoryIDPath;
    }

    public void setCategoryIDPath(String categoryIDPath) {
        CategoryIDPath = categoryIDPath;
    }

    public boolean isLeafCategory() {
        return LeafCategory;
    }

    public void setLeafCategory(boolean leafCategory) {
        LeafCategory = leafCategory;
    }
}
