package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablomenaordenes on 14-11-16.
 */

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {
    /**
     * Tag for Log message
     */
    private static final String LOG_TAG = EarthquakeLoader.class.getSimpleName();
    /**
     * Query URL
     */
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeList(mUrl);

        return (ArrayList<Earthquake>) earthquakes;
    }
}
