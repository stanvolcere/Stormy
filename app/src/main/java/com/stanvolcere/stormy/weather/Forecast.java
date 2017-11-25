package com.stanvolcere.stormy.weather;

/**
 * Created by Stan Wayne Volcere on 11/24/2017.
 */

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDayForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDayForecast() {
        return mDayForecast;
    }

    public void setDayForecast(Day[] dayForecast) {
        mDayForecast = dayForecast;
    }
}
