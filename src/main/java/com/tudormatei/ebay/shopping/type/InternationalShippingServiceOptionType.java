package com.tudormatei.ebay.shopping.type;

import java.util.Date;
import java.util.List;

public class InternationalShippingServiceOptionType {

    protected AmountType ShippingInsuranceCost;

    protected String ShippingServiceName;

    protected AmountType ShippingServiceAdditionalCost;

    protected AmountType ShippingServiceCost;

    protected int ShippingServicePriority;

    protected List<String> ShipsTo;

    protected Date EstimatedDeliveryMinTime;

    protected Date EstimatedDeliveryMaxTime;

    protected AmountType ImportCharge;

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

    public AmountType getShippingServiceAdditionalCost() {
        return ShippingServiceAdditionalCost;
    }

    public void setShippingServiceAdditionalCost(AmountType shippingServiceAdditionalCost) {
        ShippingServiceAdditionalCost = shippingServiceAdditionalCost;
    }

    public AmountType getShippingServiceCost() {
        return ShippingServiceCost;
    }

    public void setShippingServiceCost(AmountType shippingServiceCost) {
        ShippingServiceCost = shippingServiceCost;
    }

    public int getShippingServicePriority() {
        return ShippingServicePriority;
    }

    public void setShippingServicePriority(int shippingServicePriority) {
        ShippingServicePriority = shippingServicePriority;
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

    public AmountType getImportCharge() {
        return ImportCharge;
    }

    public void setImportCharge(AmountType importCharge) {
        ImportCharge = importCharge;
    }

    public Date getShippingServiceCutOffTime() {
        return ShippingServiceCutOffTime;
    }

    public void setShippingServiceCutOffTime(Date shippingServiceCutOffTime) {
        ShippingServiceCutOffTime = shippingServiceCutOffTime;
    }
}
