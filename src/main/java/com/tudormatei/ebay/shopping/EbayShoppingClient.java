package com.tudormatei.ebay.shopping;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.tudormatei.ebay.shopping.api.ShoppingApi;
import com.tudormatei.ebay.shopping.deserializer.DurationDeserializer;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;

import java.time.Duration;


public class EbayShoppingClient {

    public final static String DEFAULT_VERSION = "885";
    public final static int DEFAULT_SITE_ID = 0;

    protected final String appId;
    protected final String version;
    protected final int siteId;

    RestAdapter restAdapter;

    public EbayShoppingClient(final String appId) {
        this(appId, true, DEFAULT_VERSION, DEFAULT_SITE_ID, true);
    }

    public EbayShoppingClient(final String appId, final boolean production) {
        this(appId, production, DEFAULT_VERSION, DEFAULT_SITE_ID, true);
    }

    public EbayShoppingClient(final String appId, final boolean production, final String version, final int siteId,
                              final boolean failOnUnknownProperties) {

        // set the variables
        this.appId = appId;
        this.version = version;
        this.siteId = siteId;

        // set the uri
        String uri = production ? "http://open.api.ebay.com" : "http://open.api.sandbox.ebay.com";

        // set up the request interceptor to add headers to all requests
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader("X-EBAY-API-APP-ID", appId);
                request.addHeader("X-EBAY-API-SITE-ID", Integer.toString(siteId));
                request.addHeader("X-EBAY-API-VERSION", version);
                request.addHeader("X-EBAY-API-REQUEST-ENCODING", "NV");
                request.addHeader("X-EBAY-API-RESPONSE-ENCODING", "JSON");
            }
        };

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy());
        mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, failOnUnknownProperties);

        // add the Duration deserializer
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Duration.class, new DurationDeserializer());
        mapper.registerModule(module);

        // Build the Retrofit REST adaptor pointing to the URL specified
        restAdapter = new RestAdapter.Builder()
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setRequestInterceptor(requestInterceptor)
            .setConverter(new JacksonConverter(mapper))
            .setEndpoint(uri)
            .build();

    }

    public RestAdapter getRestAdapter() {
        return restAdapter;
    }

    public ShoppingApi getShoppingApi() {
        return restAdapter.create(ShoppingApi.class);
    }
}
