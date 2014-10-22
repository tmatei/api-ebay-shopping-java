package com.tudormatei.ebay.shopping.api;

import com.tudormatei.ebay.shopping.response.GetMultipleItemsResponse;
import retrofit.http.GET;
import retrofit.http.QueryMap;

import java.util.Map;

public interface ShoppingApi {

    @GET("/shopping?callname=FindHalfProducts")
    FindHalfProductsResponse findHalfProducts(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=FindPopularItems")
    FindPopularItemsResponse findPopularItems(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=FindPopularSearches")
    FindPopularSearchesResponse findPopularSearches(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=FindProducts")
    FindProductsResponse findProducts(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=FindReviewsAndGuides")
    FindReviewsAndGuidesResponse findReviewsAndGuides(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetCategoryInfo")
    GetCategoryInfoResponse getCategoryInfo(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetCategoryInfo")
    GetCategoryInfoResponse getCategoryInfo(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GeteBayTime")
    GeteBayTimeResponse geteBayTime(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetItemStatus")
    GetItemStatusResponse getItemStatus(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetMultipleItems")
    GetMultipleItemsResponse getMultipleItems(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetShippingCosts")
    GetShippingCostsResponse getShippingCosts(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetSingleItem")
    GetSingleItemResponse getSingleItem(@QueryMap(encodeNames=false) Map<String, String> request);

    @GET("/shopping?callname=GetUserProfile")
    GetUserProfileResponse getUserProfile(@QueryMap(encodeNames=false) Map<String, String> request);
}
