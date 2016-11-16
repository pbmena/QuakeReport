package com.example.android.quakereport;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pablomenaordenes on 14-11-16.
 */

public class Home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Home.this, EarthquakeActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1800);

    }
}