package com.tudormatei.ebay.shopping.type;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class ItemResponseType {

    protected boolean BestOfferEnabled;

    protected AmountType BuyItNowPrice;

    protected String Description;

    protected String ItemID;

    protected boolean BuyItNowAvailable;

    protected AmountType ConvertedBuyItNowPrice;

    protected Date StartTime;

    protected Date EndTime;

    protected String ViewItemURLForNaturalSearch;

    protected String ListingType;

    protected String Location;

    protected List<String> PaymentMethods;

    protected String GalleryURL;

    protected List<String> PictureURL;

    protected String PostalCode;

    protected String PrimaryCategoryID;

    protected String PrimaryCategoryName;

    protected int Quantity;

    protected UserType Seller;

    protected int BidCount;

    protected AmountType ConvertedCurrentPrice;

    protected AmountType CurrentPrice;

    protected UserType HighBidder;

    protected ListingStatusEnumType ListingStatus;

    protected int QuantitySold;

    protected boolean ReserveMet;

    protected List<String> ShipToLocations;

    protected String Site;

    protected Duration TimeLeft;

    protected String Title;

    protected ShippingCostSummaryType ShippingCostSummary;

    protected NameValueListArrayType ItemSpecifics;

    protected long HitCount;

    protected String Subtitle;

    protected String PrimaryCategoryIDPath;

    protected String SecondaryCategoryID;

    protected String SecondaryCategoryName;

    protected String SecondaryCategoryIDPath;

    protected String Charity;

    protected boolean GermanMotorsSearchable;

    protected boolean GetItFast;

    protected boolean Gift;

    protected boolean PictureExists;

    protected boolean RecentListing;

    protected StorefrontType Storefront;

    protected DistanceType DistanceFromBuyer;

    protected String Country;

    protected int WatchCount;

    protected String HalfItemCondition;

    protected String SellerComments;

    protected ReturnPolicyType ReturnPolicy;

    protected AmountType MinimumToBid;

    protected ProductType ProductID;

    protected int ItemCount;

    protected boolean AutoPay;

    protected BusinessSellerDetailsType BusinessSellerDetails;

    protected List<String> PaymentAllowedSite;

    protected boolean IntegratedMerchantCreditCardEnabled;

    protected VariationsType Variations;

    protected int HandlingTime;

    protected int LotSize;

    protected int ConditionID;

    protected String ConditionDisplayName;

    protected String QuantityAvailableHint;

    protected int QuantityThreshold;

    protected DiscountPriceInfoType DiscountPriceInfo;

    protected String ExcludeShipToLocation;

    protected boolean TopRatedListing;

    protected String VhrUrl;

    protected boolean VhrAvailable;

    protected QuantityInfoType QuantityInfo;

    protected UnitInfoType UnitInfo;

    protected boolean GlobalShipping;

    protected String ConditionDescription;

    protected int ItemCompatibilityCount;

    protected ItemCompatibilityListType ItemCompatibilityList;

    protected int QuantitySoldByPickupInStore;

    protected String SKU;

    protected boolean NewBestOffer;

    protected boolean eBayNowEligible;

    protected boolean eBayNowAvailable;

    protected boolean IgnoreQuantity;

    protected boolean AvailableForPickupDropOff;

    protected boolean EligibleForPickupDropOff;

    public boolean getBestOfferEnabled() {
        return BestOfferEnabled;
    }

    public void setBestOfferEnabled(boolean bestOfferEnabled) {
        BestOfferEnabled = bestOfferEnabled;
    }

    public AmountType getBuyItNowPrice() {
        return BuyItNowPrice;
    }

    public void setBuyItNowPrice(AmountType buyItNowPrice) {
        BuyItNowPrice = buyItNowPrice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public boolean getBuyItNowAvailable() {
        return BuyItNowAvailable;
    }

    public void setBuyItNowAvailable(boolean buyItNowAvailable) {
        BuyItNowAvailable = buyItNowAvailable;
    }

    public AmountType getConvertedBuyItNowPrice() {
        return ConvertedBuyItNowPrice;
    }

    public void setConvertedBuyItNowPrice(AmountType convertedBuyItNowPrice) {
        ConvertedBuyItNowPrice = convertedBuyItNowPrice;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public String getViewItemURLForNaturalSearch() {
        return ViewItemURLForNaturalSearch;
    }

    public void setViewItemURLForNaturalSearch(String viewItemURLForNaturalSearch) {
        ViewItemURLForNaturalSearch = viewItemURLForNaturalSearch;
    }

    public String getListingType() {
        return ListingType;
    }

    public void setListingType(String listingType) {
        ListingType = listingType;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<String> getPaymentMethods() {
        return PaymentMethods;
    }

    public void setPaymentMethods(List<String> paymentMethods) {
        PaymentMethods = paymentMethods;
    }

    public String getGalleryURL() {
        return GalleryURL;
    }

    public void setGalleryURL(String galleryURL) {
        GalleryURL = galleryURL;
    }

    public List<String> getPictureURL() {
        return PictureURL;
    }

    public void setPictureURL(List<String> pictureURL) {
        PictureURL = pictureURL;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getPrimaryCategoryID() {
        return PrimaryCategoryID;
    }

    public void setPrimaryCategoryID(String primaryCategoryID) {
        PrimaryCategoryID = primaryCategoryID;
    }

    public String getPrimaryCategoryName() {
        return PrimaryCategoryName;
    }

    public void setPrimaryCategoryName(String primaryCategoryName) {
        PrimaryCategoryName = primaryCategoryName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public UserType getSeller() {
        return Seller;
    }

    public void setSeller(UserType seller) {
        Seller = seller;
    }

    public int getBidCount() {
        return BidCount;
    }

    public void setBidCount(int bidCount) {
        BidCount = bidCount;
    }

    public AmountType getConvertedCurrentPrice() {
        return ConvertedCurrentPrice;
    }

    public void setConvertedCurrentPrice(AmountType convertedCurrentPrice) {
        ConvertedCurrentPrice = convertedCurrentPrice;
    }

    public AmountType getCurrentPrice() {
        return CurrentPrice;
    }

    public void setCurrentPrice(AmountType currentPrice) {
        CurrentPrice = currentPrice;
    }

    public UserType getHighBidder() {
        return HighBidder;
    }

    public void setHighBidder(UserType highBidder) {
        HighBidder = highBidder;
    }

    public ListingStatusEnumType getListingStatus() {
        return ListingStatus;
    }

    public void setListingStatus(ListingStatusEnumType listingStatus) {
        ListingStatus = listingStatus;
    }

    public int getQuantitySold() {
        return QuantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        QuantitySold = quantitySold;
    }

    public boolean getReserveMet() {
        return ReserveMet;
    }

    public void setReserveMet(boolean reserveMet) {
        ReserveMet = reserveMet;
    }

    public List<String> getShipToLocations() {
        return ShipToLocations;
    }

    public void setShipToLocations(List<String> shipToLocations) {
        ShipToLocations = shipToLocations;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public Duration getTimeLeft() {
        return TimeLeft;
    }

    public void setTimeLeft(Duration timeLeft) {
        TimeLeft = timeLeft;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ShippingCostSummaryType getShippingCostSummary() {
        return ShippingCostSummary;
    }

    public void setShippingCostSummary(ShippingCostSummaryType shippingCostSummary) {
        ShippingCostSummary = shippingCostSummary;
    }

    public NameValueListArrayType getItemSpecifics() {
        return ItemSpecifics;
    }

    public void setItemSpecifics(NameValueListArrayType itemSpecifics) {
        ItemSpecifics = itemSpecifics;
    }

    public long getHitCount() {
        return HitCount;
    }

    public void setHitCount(long hitCount) {
        HitCount = hitCount;
    }

    public String getSubtitle() {
        return Subtitle;
    }

    public void setSubtitle(String subtitle) {
        Subtitle = subtitle;
    }

    public String getPrimaryCategoryIDPath() {
        return PrimaryCategoryIDPath;
    }

    public void setPrimaryCategoryIDPath(String primaryCategoryIDPath) {
        PrimaryCategoryIDPath = primaryCategoryIDPath;
    }

    public String getSecondaryCategoryID() {
        return SecondaryCategoryID;
    }

    public void setSecondaryCategoryID(String secondaryCategoryID) {
        SecondaryCategoryID = secondaryCategoryID;
    }

    public String getSecondaryCategoryName() {
        return SecondaryCategoryName;
    }

    public void setSecondaryCategoryName(String secondaryCategoryName) {
        SecondaryCategoryName = secondaryCategoryName;
    }

    public String getSecondaryCategoryIDPath() {
        return SecondaryCategoryIDPath;
    }

    public void setSecondaryCategoryIDPath(String secondaryCategoryIDPath) {
        SecondaryCategoryIDPath = secondaryCategoryIDPath;
    }

    public String getCharity() {
        return Charity;
    }

    public void setCharity(String charity) {
        Charity = charity;
    }

    public boolean getGermanMotorsSearchable() {
        return GermanMotorsSearchable;
    }

    public void setGermanMotorsSearchable(boolean germanMotorsSearchable) {
        GermanMotorsSearchable = germanMotorsSearchable;
    }

    public boolean getGetItFast() {
        return GetItFast;
    }

    public void setGetItFast(boolean getItFast) {
        GetItFast = getItFast;
    }

    public boolean getGift() {
        return Gift;
    }

    public void setGift(boolean gift) {
        Gift = gift;
    }

    public boolean getPictureExists() {
        return PictureExists;
    }

    public void setPictureExists(boolean pictureExists) {
        PictureExists = pictureExists;
    }

    public boolean getRecentListing() {
        return RecentListing;
    }

    public void setRecentListing(boolean recentListing) {
        RecentListing = recentListing;
    }

    public StorefrontType getStorefront() {
        return Storefront;
    }

    public void setStorefront(StorefrontType storefront) {
        Storefront = storefront;
    }

    public DistanceType getDistanceFromBuyer() {
        return DistanceFromBuyer;
    }

    public void setDistanceFromBuyer(DistanceType distanceFromBuyer) {
        DistanceFromBuyer = distanceFromBuyer;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getWatchCount() {
        return WatchCount;
    }

    public void setWatchCount(int watchCount) {
        WatchCount = watchCount;
    }

    public String getHalfItemCondition() {
        return HalfItemCondition;
    }

    public void setHalfItemCondition(String halfItemCondition) {
        HalfItemCondition = halfItemCondition;
    }

    public String getSellerComments() {
        return SellerComments;
    }

    public void setSellerComments(String sellerComments) {
        SellerComments = sellerComments;
    }

    public ReturnPolicyType getReturnPolicy() {
        return ReturnPolicy;
    }

    public void setReturnPolicy(ReturnPolicyType returnPolicy) {
        ReturnPolicy = returnPolicy;
    }

    public AmountType getMinimumToBid() {
        return MinimumToBid;
    }

    public void setMinimumToBid(AmountType minimumToBid) {
        MinimumToBid = minimumToBid;
    }

    public ProductType getProductID() {
        return ProductID;
    }

    public void setProductID(ProductType productID) {
        ProductID = productID;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public boolean getAutoPay() {
        return AutoPay;
    }

    public void setAutoPay(boolean autoPay) {
        AutoPay = autoPay;
    }

    public BusinessSellerDetailsType getBusinessSellerDetails() {
        return BusinessSellerDetails;
    }

    public void setBusinessSellerDetails(BusinessSellerDetailsType businessSellerDetails) {
        BusinessSellerDetails = businessSellerDetails;
    }

    public List<String> getPaymentAllowedSite() {
        return PaymentAllowedSite;
    }

    public void setPaymentAllowedSite(List<String> paymentAllowedSite) {
        PaymentAllowedSite = paymentAllowedSite;
    }

    public boolean getIntegratedMerchantCreditCardEnabled() {
        return IntegratedMerchantCreditCardEnabled;
    }

    public void setIntegratedMerchantCreditCardEnabled(boolean integratedMerchantCreditCardEnabled) {
        IntegratedMerchantCreditCardEnabled = integratedMerchantCreditCardEnabled;
    }

    public VariationsType getVariations() {
        return Variations;
    }

    public void setVariations(VariationsType variations) {
        Variations = variations;
    }

    public int getHandlingTime() {
        return HandlingTime;
    }

    public void setHandlingTime(int handlingTime) {
        HandlingTime = handlingTime;
    }

    public int getLotSize() {
        return LotSize;
    }

    public void setLotSize(int lotSize) {
        LotSize = lotSize;
    }

    public int getConditionID() {
        return ConditionID;
    }

    public void setConditionID(int conditionID) {
        ConditionID = conditionID;
    }

    public String getConditionDisplayName() {
        return ConditionDisplayName;
    }

    public void setConditionDisplayName(String conditionDisplayName) {
        ConditionDisplayName = conditionDisplayName;
    }

    public String getQuantityAvailableHint() {
        return QuantityAvailableHint;
    }

    public void setQuantityAvailableHint(String quantityAvailableHint) {
        QuantityAvailableHint = quantityAvailableHint;
    }

    public int getQuantityThreshold() {
        return QuantityThreshold;
    }

    public void setQuantityThreshold(int quantityThreshold) {
        QuantityThreshold = quantityThreshold;
    }

    public DiscountPriceInfoType getDiscountPriceInfo() {
        return DiscountPriceInfo;
    }

    public void setDiscountPriceInfo(DiscountPriceInfoType discountPriceInfo) {
        DiscountPriceInfo = discountPriceInfo;
    }

    public String getExcludeShipToLocation() {
        return ExcludeShipToLocation;
    }

    public void setExcludeShipToLocation(String excludeShipToLocation) {
        ExcludeShipToLocation = excludeShipToLocation;
    }

    public boolean getTopRatedListing() {
        return TopRatedListing;
    }

    public void setTopRatedListing(boolean topRatedListing) {
        TopRatedListing = topRatedListing;
    }

    public String getVhrUrl() {
        return VhrUrl;
    }

    public void setVhrUrl(String vhrUrl) {
        VhrUrl = vhrUrl;
    }

    public boolean getVhrAvailable() {
        return VhrAvailable;
    }

    public void setVhrAvailable(boolean vhrAvailable) {
        VhrAvailable = vhrAvailable;
    }

    public QuantityInfoType getQuantityInfo() {
        return QuantityInfo;
    }

    public void setQuantityInfo(QuantityInfoType quantityInfo) {
        QuantityInfo = quantityInfo;
    }

    public UnitInfoType getUnitInfo() {
        return UnitInfo;
    }

    public void setUnitInfo(UnitInfoType unitInfo) {
        UnitInfo = unitInfo;
    }

    public boolean getGlobalShipping() {
        return GlobalShipping;
    }

    public void setGlobalShipping(boolean globalShipping) {
        GlobalShipping = globalShipping;
    }

    public String getConditionDescription() {
        return ConditionDescription;
    }

    public void setConditionDescription(String conditionDescription) {
        ConditionDescription = conditionDescription;
    }

    public int getItemCompatibilityCount() {
        return ItemCompatibilityCount;
    }

    public void setItemCompatibilityCount(int itemCompatibilityCount) {
        ItemCompatibilityCount = itemCompatibilityCount;
    }

    public ItemCompatibilityListType getItemCompatibilityList() {
        return ItemCompatibilityList;
    }

    public void setItemCompatibilityList(ItemCompatibilityListType itemCompatibilityList) {
        ItemCompatibilityList = itemCompatibilityList;
    }

    public int getQuantitySoldByPickupInStore() {
        return QuantitySoldByPickupInStore;
    }

    public void setQuantitySoldByPickupInStore(int quantitySoldByPickupInStore) {
        QuantitySoldByPickupInStore = quantitySoldByPickupInStore;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public boolean getNewBestOffer() {
        return NewBestOffer;
    }

    public void setNewBestOffer(boolean newBestOffer) {
        NewBestOffer = newBestOffer;
    }

    public boolean geteBayNowEligible() {
        return eBayNowEligible;
    }

    public void seteBayNowEligible(boolean eBayNowEligible) {
        this.eBayNowEligible = eBayNowEligible;
    }

    public boolean geteBayNowAvailable() {
        return eBayNowAvailable;
    }

    public void seteBayNowAvailable(boolean eBayNowAvailable) {
        this.eBayNowAvailable = eBayNowAvailable;
    }

    public boolean getIgnoreQuantity() {
        return IgnoreQuantity;
    }

    public void setIgnoreQuantity(boolean ignoreQuantity) {
        IgnoreQuantity = ignoreQuantity;
    }

    public boolean getAvailableForPickupDropOff() {
        return AvailableForPickupDropOff;
    }

    public void setAvailableForPickupDropOff(boolean availableForPickupDropOff) {
        AvailableForPickupDropOff = availableForPickupDropOff;
    }

    public boolean getEligibleForPickupDropOff() {
        return EligibleForPickupDropOff;
    }

    public void setEligibleForPickupDropOff(boolean eligibleForPickupDropOff) {
        EligibleForPickupDropOff = eligibleForPickupDropOff;
    }
}
