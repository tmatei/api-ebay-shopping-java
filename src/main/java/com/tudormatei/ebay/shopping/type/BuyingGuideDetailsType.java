package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class BuyingGuideDetailsType {

    protected List<BuyingGuideType> BuyingGuide;

    protected String BuyingGuideHub;

    public List<BuyingGuideType> getBuyingGuide() {
        return BuyingGuide;
    }

    public void setBuyingGuide(List<BuyingGuideType> buyingGuide) {
        BuyingGuide = buyingGuide;
    }

    public String getBuyingGuideHub() {
        return BuyingGuideHub;
    }

    public void setBuyingGuideHub(String buyingGuideHub) {
        BuyingGuideHub = buyingGuideHub;
    }
}
