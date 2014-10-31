api-ebay-shopping-java
===============


A Java client library for [Ebay Shopping](http://developer.ebay.com/devzone/shopping/docs/CallRef/index.html)'s API.

## Usage
### Maven dependency
```xml
<dependency>
    <groupId>com.tudormatei.ebay</groupId>
    <artifactId>shopping-api</artifactId>
    <version>1.0.1</version>
</dependency>
```

### Making API Calls
#### Initialize the client object
```java
EbayShoppingClient esc = new EbayShoppingClient("your-api-key")
```

#### Find Products call
```java
// set up the request
FindProductsRequest request = new FindProductsRequest();
request.setQueryKeywords("watch");
request.setMaxEntries(10);

// get the response
ShoppingApi shopping = esc.getShoppingApi();
FindProductsResponse response = shopping.findProducts(request.toMap());
```
