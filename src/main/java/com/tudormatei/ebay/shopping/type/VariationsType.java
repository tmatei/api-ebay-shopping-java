package com.tudormatei.ebay.shopping.type;

public class VariationsType {

    protected VariationType Variation;

    protected PicturesType Pictures;

    protected NameValueListArrayType VariationSpecificsSet;

    public VariationType getVariation() {
        return Variation;
    }

    public void setVariation(VariationType variation) {
        Variation = variation;
    }

    public PicturesType getPictures() {
        return Pictures;
    }

    public void setPictures(PicturesType pictures) {
        Pictures = pictures;
    }

    public NameValueListArrayType getVariationSpecificsSet() {
        return VariationSpecificsSet;
    }

    public void setVariationSpecificsSet(NameValueListArrayType variationSpecificsSet) {
        VariationSpecificsSet = variationSpecificsSet;
    }
}
