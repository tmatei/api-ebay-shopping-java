package com.tudormatei.ebay.shopping.mock;

import com.tudormatei.ebay.shopping.api.ShoppingApi;
import com.tudormatei.ebay.shopping.response.*;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.http.QueryMap;
import retrofit.mime.TypedFile;

import java.io.File;
import java.net.URL;
import java.util.Map;

public class MockShoppingApi implements ShoppingApi {

    protected final Converter converter;

    public MockShoppingApi(Converter converter) {
        this.converter = converter;
    }

    protected <T extends AbstractResponse> T getResponse(String fileName, Class<T> type) {
        try {
            URL url = this.getClass().getResource(fileName);
            TypedFile typedFile = new TypedFile("text/json", new File(url.getFile()));
            return (T) converter.fromBody(typedFile, type);
        } catch (ConversionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public FindHalfProductsResponse findHalfProducts(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/FindHalfProductsResponse.json", FindHalfProductsResponse.class);
    }

    @Override
    public FindPopularItemsResponse findPopularItems(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/FindPopularItemsResponse.json", FindPopularItemsResponse.class);
    }

    @Override
    public FindPopularSearchesResponse findPopularSearches(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/FindPopularSearchesResponse.json", FindPopularSearchesResponse.class);
    }

    @Override
    public FindProductsResponse findProducts(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/FindProductsResponse.json", FindProductsResponse.class);
    }

    @Override
    public FindReviewsAndGuidesResponse findReviewsAndGuides(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/FindReviewsAndGuidesResponse.json", FindReviewsAndGuidesResponse.class);
    }

    @Override
    public GetCategoryInfoResponse getCategoryInfo(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetCategoryInfoResponse.json", GetCategoryInfoResponse.class);
    }

    @Override
    public GeteBayTimeResponse geteBayTime(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GeteBayTimeResponse.json", GeteBayTimeResponse.class);
    }

    @Override
    public GetItemStatusResponse getItemStatus(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetItemStatusResponse.json", GetItemStatusResponse.class);
    }

    @Override
    public GetMultipleItemsResponse getMultipleItems(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetMultipleItemsResponse.json", GetMultipleItemsResponse.class);
    }

    @Override
    public GetShippingCostsResponse getShippingCosts(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetShippingCostsResponse.json", GetShippingCostsResponse.class);
    }

    @Override
    public GetSingleItemResponse getSingleItem(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetSingleItemResponse.json", GetSingleItemResponse.class);
    }

    @Override
    public GetUserProfileResponse getUserProfile(@QueryMap(encodeNames = false) Map<String, String> request) {
        return getResponse("/json/GetUserProfileResponse.json", GetUserProfileResponse.class);
    }
}
