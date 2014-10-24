package com.tudormatei.ebay.shopping.type;

import java.util.Date;
import java.util.List;

public class ShippingServiceOptionType {

    protected AmountType ShippingInsuranceCost;

    protected String ShippingServiceName;

    protected String LogisticPlanType;

    protected AmountType ShippingServiceCost;

    protected AmountType ShippingServiceAdditionalCost;

    protected int ShippingServicePriority;

    protected boolean ExpeditedService;

    protected int ShippingTimeMin;

    protected int ShippingTimeMax;

    protected AmountType ShippingSurcharge;

    protected List<String> ShipsTo;

    protected Date EstimatedDeliveryMinTime;

    protected Date EstimatedDeliveryMaxTime;

    protected boolean FastAndFree;

    protected Date ShippingServiceCutOffTime;

    public AmountType getShippingInsuranceCost() {
        return ShippingInsuranceCost;
    }

    public void setShippingInsuranceCost(AmountType shippingInsuranceCost) {
        ShippingInsuranceCost = shippingInsuranceCost;
    }

    public String getShippingServiceName() {
        return ShippingServiceName;
    }

    public void setShippingServiceName(String shippingServiceName) {
        ShippingServiceName = shippingServiceName;
    }

    public String getLogisticPlanType() {
        return LogisticPlanType;
    }

    public void setLogisticPlanType(String logisticPlanType) {
        LogisticPlanType = logisticPlanType;
    }

    public AmountType getShippingServiceCost() {
        return ShippingServiceCost;
    }

    public void setShippingServiceCost(AmountType shippingServiceCost) {
        ShippingServiceCost = shippingServiceCost;
    }

    public AmountType getShippingServiceAdditionalCost() {
        return ShippingServiceAdditionalCost;
    }

    public void setShippingServiceAdditionalCost(AmountType shippingServiceAdditionalCost) {
        ShippingServiceAdditionalCost = shippingServiceAdditionalCost;
    }

    public int getShippingServicePriority() {
        return ShippingServicePriority;
    }

    public void setShippingServicePriority(int shippingServicePriority) {
        ShippingServicePriority = shippingServicePriority;
    }

    public boolean isExpeditedService() {
        return ExpeditedService;
    }

    public void setExpeditedService(boolean expeditedService) {
        ExpeditedService = expeditedService;
    }

    public int getShippingTimeMin() {
        return ShippingTimeMin;
    }

    public void setShippingTimeMin(int shippingTimeMin) {
        ShippingTimeMin = shippingTimeMin;
    }

    public int getShippingTimeMax() {
        return ShippingTimeMax;
    }

    public void setShippingTimeMax(int shippingTimeMax) {
        ShippingTimeMax = shippingTimeMax;
    }

    public AmountType getShippingSurcharge() {
        return ShippingSurcharge;
    }

    public void setShippingSurcharge(AmountType shippingSurcharge) {
        ShippingSurcharge = shippingSurcharge;
    }

    public List<String> getShipsTo() {
        return ShipsTo;
    }

    public void setShipsTo(List<String> shipsTo) {
        ShipsTo = shipsTo;
    }

    public Date getEstimatedDeliveryMinTime() {
        return EstimatedDeliveryMinTime;
    }

    public void setEstimatedDeliveryMinTime(Date estimatedDeliveryMinTime) {
        EstimatedDeliveryMinTime = estimatedDeliveryMinTime;
    }

    public Date getEstimatedDeliveryMaxTime() {
        return EstimatedDeliveryMaxTime;
    }

    public void setEstimatedDeliveryMaxTime(Date estimatedDeliveryMaxTime) {
        EstimatedDeliveryMaxTime = estimatedDeliveryMaxTime;
    }

    public boolean isFastAndFree() {
        return FastAndFree;
    }

    public void setFastAndFree(boolean fastAndFree) {
        FastAndFree = fastAndFree;
    }

    public Date getShippingServiceCutOffTime() {
        return ShippingServiceCutOffTime;
    }

    public void setShippingServiceCutOffTime(Date shippingServiceCutOffTime) {
        ShippingServiceCutOffTime = shippingServiceCutOffTime;
    }
}
