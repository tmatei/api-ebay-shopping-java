package com.tudormatei.ebay.shopping.response;

import com.tudormatei.ebay.shopping.type.AckEnumType;
import com.tudormatei.ebay.shopping.type.ErrorType;

import java.util.Date;
import java.util.List;

public abstract class AbstractResponse {

    protected Date Timestamp;

    protected AckEnumType Ack;

    protected String Build;

    protected String Version;

    protected int TotalItems;

    protected String ItemSearchURL;

    protected String CorrelationID;

    protected List<ErrorType> Errors;

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Timestamp = timestamp;
    }

    public AckEnumType getAck() {
        return Ack;
    }

    public void setAck(AckEnumType ack) {
        Ack = ack;
    }

    public String getBuild() {
        return Build;
    }

    public void setBuild(String build) {
        Build = build;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public int getTotalItems() {
        return TotalItems;
    }

    public void setTotalItems(int totalItems) {
        TotalItems = totalItems;
    }

    public String getItemSearchURL() {
        return ItemSearchURL;
    }

    public void setItemSearchURL(String itemSearchURL) {
        ItemSearchURL = itemSearchURL;
    }

    public String getCorrelationID() {
        return CorrelationID;
    }

    public void setCorrelationID(String correlationID) {
        CorrelationID = correlationID;
    }

    public List<ErrorType> getErrors() {
        return Errors;
    }

    public void setErrors(List<ErrorType> errors) {
        Errors = errors;
    }
}
