package com.tudormatei.ebay.shopping;

import com.tudormatei.ebay.shopping.api.ShoppingApi;
import com.tudormatei.ebay.shopping.mock.MockShoppingApi;
import com.tudormatei.ebay.shopping.request.*;
import com.tudormatei.ebay.shopping.response.*;
import com.tudormatei.ebay.shopping.type.AckEnumType;
import com.tudormatei.ebay.shopping.type.ShippingDetailsType;
import com.tudormatei.ebay.shopping.type.SimpleItemResponseType;
import org.hamcrest.Matchers;
import org.junit.*;
import retrofit.MockRestAdapter;
import retrofit.RestAdapter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class EbayShoppingClientTest {

    @Test
    public void canCreateWithAppId() {
        EbayShoppingClient esc = new EbayShoppingClient("TEST-APP-ID");
        assertThat(esc, instanceOf(EbayShoppingClient.class));
    }

    @Test
    public void canCreateWithAppIdAndProductionFlag() {
        EbayShoppingClient esc = new EbayShoppingClient("TEST-APP-ID", true);
        assertThat(esc, instanceOf(EbayShoppingClient.class));
    }

    @Test
    public void canCreateWithAppIdProductionFlagAndLogLevel() {
        EbayShoppingClient esc = new EbayShoppingClient("TEST-APP-ID", true, RestAdapter.LogLevel.NONE);
        assertThat(esc, instanceOf(EbayShoppingClient.class));
    }

    @Test
    public void canCreateWithAllProperties() {
        EbayShoppingClient esc = new EbayShoppingClient("TEST-APP-ID", true, EbayShoppingClient.DEFAULT_VERSION,
                EbayShoppingClient.DEFAULT_SITE_ID, RestAdapter.LogLevel.NONE, true);
        assertThat(esc, instanceOf(EbayShoppingClient.class));
    }

    @Test
    public void canGetShoppingApi() {
        EbayShoppingClient esc = new EbayShoppingClient("TEST-APP-ID");
        assertThat(esc.getShoppingApi(), instanceOf(ShoppingApi.class));
    }

    @Test
    public void findHalfProducts() {

        // set up the request
        FindHalfProductsRequest request = new FindHalfProductsRequest();
        request.setMessageID("findHalfProductsTest");
        request.setMaxEntries(10);
        request.setQueryKeywords("watch");
        request.setAvailableItemsOnly(true);

        // get the response
        ShoppingApi shopping = getShoppingApi();
        FindHalfProductsResponse response = shopping.findHalfProducts(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getProducts().getProduct(), Matchers.hasSize(request.getMaxEntries()));
    }

    @Test
    public void findPopularItems() {

        // set up the request
        FindPopularItemsRequest request = new FindPopularItemsRequest();
        request.setMessageID("findPopularItemsTest");
        request.setMaxEntries(10);
        request.setQueryKeywords("watch");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        FindPopularItemsResponse response = shopping.findPopularItems(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getItemArray().getItem(), hasSize(lessThanOrEqualTo(request.getMaxEntries())));
    }

    @Test
    public void findPopularSearches() {

        // set up the request
        FindPopularSearchesRequest request = new FindPopularSearchesRequest();
        request.setMessageID("findPopularSearchesTest");
        request.setQueryKeywords("watch");
        request.setMaxResultsPerPage(10);

        // get the response
        ShoppingApi shopping = getShoppingApi();
        FindPopularSearchesResponse response = shopping.findPopularSearches(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getPopularSearchResult(), hasSize(lessThanOrEqualTo(request.getMaxResultsPerPage())));
    }

    @Test
    public void findProducts() {

        // set up the request
        FindProductsRequest request = new FindProductsRequest();
        request.setMessageID("findProductsTest");
        request.setQueryKeywords("watch");
        request.setMaxEntries(10);

        // get the response
        ShoppingApi shopping = getShoppingApi();
        FindProductsResponse response = shopping.findProducts(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getProduct(), hasSize(lessThanOrEqualTo(request.getMaxEntries())));
    }

    @Test
    public void findReviewsAndGuides() {

        // set up the request
        FindReviewsAndGuidesRequest request = new FindReviewsAndGuidesRequest();
        request.setMessageID("findReviewsAndGuidesTest");
        request.setMaxResultsPerPage(10);

        // get the response
        ShoppingApi shopping = getShoppingApi();
        FindReviewsAndGuidesResponse response = shopping.findReviewsAndGuides(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getBuyingGuideDetails().getBuyingGuide(), hasSize(lessThanOrEqualTo(request.getMaxResultsPerPage())));
    }

    @Test
    public void getCategoryInfo() {

        // set up the request
        GetCategoryInfoRequest request = new GetCategoryInfoRequest();
        request.setMessageID("getCategoryInfoTest");
        request.setCategoryID("14324");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetCategoryInfoResponse response = shopping.getCategoryInfo(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getCategoryArray().getCategory(), hasSize(greaterThanOrEqualTo(1)));
    }

    @Test
    public void geteBayTime() {

        // set up the request
        GeteBayTimeRequest request = new GeteBayTimeRequest();
        request.setMessageID("geteBayTimeTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GeteBayTimeResponse response = shopping.geteBayTime(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertNotNull(response.getTimestamp());
    }

    @Test
    public void getItemStatus() {

        // set up the request
        GetItemStatusRequest request = new GetItemStatusRequest();
        request.setItemID(Arrays.asList("310793437641"));
        request.setMessageID("getItemStatusTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetItemStatusResponse response = shopping.getItemStatus(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getItem().get(0), instanceOf(SimpleItemResponseType.class));
    }

    @Test
    public void getMultipleItems() {

        // set up the request
        GetMultipleItemsRequest request = new GetMultipleItemsRequest();
        request.setItemID(Arrays.asList("310793437641", "221291285284"));
        request.setMessageID("getMultipleItemsTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetMultipleItemsResponse response = shopping.getMultipleItems(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
        assertThat(response.getItem(), hasSize(request.getItemID().size()));
    }

    @Test
    public void getShippingCosts() {

        // set up the request
        GetShippingCostsRequest request = new GetShippingCostsRequest();
        request.setItemID("310793437641");
        request.setDestinationPostalCode("90210");
        request.setMessageID("getShippingCostsTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetShippingCostsResponse response = shopping.getShippingCosts(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
    }

    @Test
    public void getSingleItemResponse() {

        // set up the request
        GetSingleItemRequest request = new GetSingleItemRequest();
        request.setItemID("310793437641");
        request.setMessageID("getSingleItemTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetSingleItemResponse response = shopping.getSingleItem(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
    }

    @Test
    public void getUserProfile() {

        // set up the request
        GetUserProfileRequest request = new GetUserProfileRequest();
        request.setUserID("yhtak");
        request.setMessageID("getUserProfileTest");

        // get the response
        ShoppingApi shopping = getShoppingApi();
        GetUserProfileResponse response = shopping.getUserProfile(request.toMap());

        // assertions
        assertNotNull(response);
        assertEquals(request.getMessageID(), response.getCorrelationID());
        assertEquals(AckEnumType.SUCCESS, response.getAck());
    }

    protected Properties getProperties() {
        Properties prop = new Properties();
        try {
            prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            return prop;
        } catch (IOException e) {
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }
    protected ShoppingApi getShoppingApi() {

        Properties prop = getProperties();

        boolean mock = true;
        String appId = "TEST-APP-ID";

        if (prop != null) {
            mock = prop.getProperty("ebay.mock") == null || Boolean.parseBoolean(prop.getProperty("ebay.mock"));
            appId = prop.getProperty("ebay.appId") != null ? prop.getProperty("ebay.appId") : appId;
        }

        EbayShoppingClient esc = new EbayShoppingClient(appId, true, RestAdapter.LogLevel.NONE);

        ShoppingApi api;
        if (mock) {
            MockRestAdapter mockRestAdapter = MockRestAdapter.from(esc.getRestAdapter());
            api = mockRestAdapter.create(ShoppingApi.class, new MockShoppingApi(esc.getConverter()));
        } else {
            api = esc.getShoppingApi();
        }

        return api;
    }

}
