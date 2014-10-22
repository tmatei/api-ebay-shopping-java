package com.tudormatei.ebay.shopping.type;

import java.util.List;

public class ErrorType {

    protected String ShortMessage;

    protected String LongMessage;

    protected String ErrorCode;

    protected boolean UserDisplayHint;

    protected SeverityCodeEnumType SeverityCode;

    protected List<ErrorParameterType> ErrorParameters;

    protected ErrorClassificationEnumType ErrorClassification;

    public String getShortMessage() {
        return ShortMessage;
    }

    public void setShortMessage(String shortMessage) {
        ShortMessage = shortMessage;
    }

    public String getLongMessage() {
        return LongMessage;
    }

    public void setLongMessage(String longMessage) {
        LongMessage = longMessage;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public boolean getUserDisplayHint() {
        return UserDisplayHint;
    }

    public void setUserDisplayHint(boolean userDisplayHint) {
        UserDisplayHint = userDisplayHint;
    }

    public SeverityCodeEnumType getSeverityCode() {
        return SeverityCode;
    }

    public void setSeverityCode(SeverityCodeEnumType severityCode) {
        SeverityCode = severityCode;
    }

    public List<ErrorParameterType> getErrorParameters() {
        return ErrorParameters;
    }

    public void setErrorParameters(List<ErrorParameterType> errorParameters) {
        ErrorParameters = errorParameters;
    }

    public ErrorClassificationEnumType getErrorClassification() {
        return ErrorClassification;
    }

    public void setErrorClassification(ErrorClassificationEnumType errorClassification) {
        ErrorClassification = errorClassification;
    }
}
