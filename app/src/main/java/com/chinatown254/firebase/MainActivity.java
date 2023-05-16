package com.chinatown254.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private final String TAG = "FB_FIRSTLOOK";
    //Firebase remote config settings
    private final String CONFIG_PROMO_MESSAGE_KEY = "promo_message";
    private final String CONFIG_PROMO_ENABLED_KEY = "promo_enabled";
    private long  CONFIG_CACHE_DURATION = 1800;

    //Firebase Analytics settings
    private final int MIN_SESSION_DURATION =5000;
    //TODO: Define analytics objects
private FirebaseAnalytics mFBAnalytics;

    //TODO: Define Remote config object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Retrieve an instance of the Analytics package
        mFBAnalytics =  FirebaseAnalytics.getInstance(this);
        //TODO: Get the remote config instance
        //TODO: Wait 5 seconds before counting this as a session
        mFBAnalytics.setSessionTimeoutDuration(MIN_SESSION_DURATION);

    }

    @Override
    public void onClick(View v) {

    }
}