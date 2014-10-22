package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class PicturesType {

    protected String VariationSpecificName;

    protected List<VariationSpecificPictureSetType> VariationSpecificPictureSet;

    public String getVariationSpecificName() {
        return VariationSpecificName;
    }

    public void setVariationSpecificName(String variationSpecificName) {
        VariationSpecificName = variationSpecificName;
    }

    public List<VariationSpecificPictureSetType> getVariationSpecificPictureSet() {
        return VariationSpecificPictureSet;
    }

    public void setVariationSpecificPictureSet(List<VariationSpecificPictureSetType> variationSpecificPictureSet) {
        VariationSpecificPictureSet = variationSpecificPictureSet;
    }
}
