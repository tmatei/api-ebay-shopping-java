package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.PickUpInStoreDetailsType;
import com.tudormatei.ebay.shopping.type.ShippingCostSummaryType;
import com.tudormatei.ebay.shopping.type.ShippingDetailsType;

public class GetShippingCostsResponse extends AbstractResponse {

    protected ShippingDetailsType ShippingDetails;

    protected ShippingCostSummaryType ShippingCostSummary;

    protected PickUpInStoreDetailsType PickUpInStoreDetails;

    public ShippingDetailsType getShippingDetails() {
        return ShippingDetails;
    }

    public void setShippingDetails(ShippingDetailsType shippingDetails) {
        ShippingDetails = shippingDetails;
    }

    public ShippingCostSummaryType getShippingCostSummary() {
        return ShippingCostSummary;
    }

    public void setShippingCostSummary(ShippingCostSummaryType shippingCostSummary) {
        ShippingCostSummary = shippingCostSummary;
    }

    public PickUpInStoreDetailsType getPickUpInStoreDetails() {
        return PickUpInStoreDetails;
    }

    public void setPickUpInStoreDetails(PickUpInStoreDetailsType pickUpInStoreDetails) {
        PickUpInStoreDetails = pickUpInStoreDetails;
    }
}
