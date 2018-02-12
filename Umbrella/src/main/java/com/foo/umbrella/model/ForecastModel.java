package com.foo.umbrella.model;

import com.foo.umbrella.data.api.WeatherService;
import com.foo.umbrella.data.model.CurrentObservation;
import com.foo.umbrella.data.model.HourlyForecast;
import com.foo.umbrella.data.model.WeatherData;
import com.foo.umbrella.events.ListEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Hector Vera on 2/11/2018.
 */

public class ForecastModel {

    public static void forecastForZipCallable(String zipCode){
        WeatherService.Factory.getInstance().forecastForZipCallable(zipCode).enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                WeatherData weatherData = response.body();
                ArrayList<ArrayList<HourlyForecast>> finalList = null;
                CurrentObservation currentObservation = weatherData.getCurrentObservation();
                if(currentObservation != null) {
                     finalList = parseHourlyForecastList(
                            weatherData.getHourlyForecast());
                }
                EventBus.getDefault().post(new ListEvent(finalList));
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    private static ArrayList<ArrayList<HourlyForecast>> parseHourlyForecastList(List<HourlyForecast> list){
        int flag = 0;
        ArrayList<ArrayList<HourlyForecast>> finalList = new ArrayList<>();
        ArrayList<HourlyForecast> intermedial = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            HourlyForecast l = list.get(i);
            int tempFlag = Integer.parseInt(l.getFCTTIME().getYday());
            if(flag != tempFlag && flag != 0){
                finalList.add(intermedial);
                intermedial = null;
                intermedial = new ArrayList<>();
                intermedial.add(l);
            } else if(flag == tempFlag || flag == 0){
                intermedial.add(l);
            }
            if((i+1) == list.size()){
                finalList.add(intermedial);
            }
            flag = tempFlag;
        }
        return finalList;
    }
}
