package com.foo.umbrella.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.IOException;

import retrofit2.Response;

/**
 * Created by Hector Vera on 9/7/2017.
 */

public class CommunicationService extends IntentService {

    private static final String DEBUG = "DEBUG_INTENT_SERVICE";
    public CommunicationService(){
        super("CommunicationService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(DEBUG, "onHandleIntent");
        String zipCode = intent.getStringExtra("zipCode");
        /*ApiServicesProvider api = new ApiServicesProvider(getApplication());
        try {
            Log.d(DEBUG, "try");
            Response<WeatherData> response = api.getWeatherService().forecastForZipCallable(zipCode).execute();
            WeatherData weatherData = response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
