package com.tudormatei.ebay.shopping.type;

public class FeedbackPeriodType {

    protected int PeriodInDays;

    protected long Count;

    public int getPeriodInDays() {
        return PeriodInDays;
    }

    public void setPeriodInDays(int periodInDays) {
        PeriodInDays = periodInDays;
    }

    public long getCount() {
        return Count;
    }

    public void setCount(long count) {
        Count = count;
    }
}
