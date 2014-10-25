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
import retrofit.RestAdapter.LogLevel;
import retrofit.converter.Converter;
import retrofit.converter.JacksonConverter;

import java.time.Duration;


public class EbayShoppingClient {

    public final static String DEFAULT_VERSION = "885";
    public final static int DEFAULT_SITE_ID = 0;

    protected final String appId;
    protected final String version;
    protected final String uri;
    protected final int siteId;
    protected final boolean failOnUnknownProperties;

    protected final RestAdapter restAdapter;

    public EbayShoppingClient(final String appId) {
        this(appId, true, DEFAULT_VERSION, DEFAULT_SITE_ID, LogLevel.NONE, true);
    }

    public EbayShoppingClient(final String appId, final boolean isProduction) {
        this(appId, isProduction, DEFAULT_VERSION, DEFAULT_SITE_ID, LogLevel.NONE, true);
    }


    public EbayShoppingClient(final String appId, final boolean isProduction, LogLevel logLevel) {
        this(appId, isProduction, DEFAULT_VERSION, DEFAULT_SITE_ID, logLevel, true);
    }

    public EbayShoppingClient(final String appId, final boolean isProduction, final String version, final int siteId,
                              final LogLevel logLevel, final boolean failOnUnknownProperties) {

        // set the variables
        this.appId = appId;
        this.version = version;
        this.siteId = siteId;
        this.uri = isProduction ? "http://open.api.ebay.com" : "http://open.api.sandbox.ebay.com";
        this.failOnUnknownProperties = failOnUnknownProperties;

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

        // Build the Retrofit REST adaptor pointing to the URL specified
        restAdapter = new RestAdapter.Builder()
                .setLogLevel(logLevel)
                .setRequestInterceptor(requestInterceptor)
                .setConverter(getConverter())
                .setEndpoint(uri)
                .build();

    }

    public Converter getConverter() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyNamingStrategy(new PropertyNamingStrategy.PascalCaseStrategy());
        mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, failOnUnknownProperties);

        // add the Duration deserializer
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Duration.class, new DurationDeserializer());
        mapper.registerModule(module);

        return new JacksonConverter(mapper);
    }

    public RestAdapter getRestAdapter() {
        return restAdapter;
    }

    public ShoppingApi getShoppingApi() {
        return restAdapter.create(ShoppingApi.class);
    }
}
