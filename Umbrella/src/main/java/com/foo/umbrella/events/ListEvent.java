package com.foo.umbrella.events;

import com.foo.umbrella.data.model.HourlyForecast;
import com.foo.umbrella.data.model.WeatherData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hector Vera on 2/11/2018.
 */

public class ListEvent {

    private ArrayList<ArrayList<HourlyForecast>> finalList;
    private WeatherData weatherData;

    public ListEvent(WeatherData weatherData, ArrayList<ArrayList<HourlyForecast>> finalList) {
        this.weatherData = weatherData;
        this.finalList = finalList;
    }

    public ArrayList<ArrayList<HourlyForecast>> getFinalList() {
        return finalList;
    }

    public void setFinalList(ArrayList<ArrayList<HourlyForecast>> finalList) {
        this.finalList = finalList;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
}
