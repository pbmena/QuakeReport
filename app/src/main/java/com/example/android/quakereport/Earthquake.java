package com.example.android.quakereport;

/**
 * Created by pablomenaordenes on 04-11-16.
 */

public class Earthquake {

    private double magnitude;
    private String location;
    private Long time;
    private String url;

    public Earthquake(double mMagnitude, String mLocation, long mTime, String mUrl) {
        this.magnitude = mMagnitude;
        this.location = mLocation;
        this.time = mTime;
        this.url = mUrl;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
