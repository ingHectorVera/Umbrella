
package com.foo.umbrella.data.model;

import java.util.List;
import com.squareup.moshi.Json;

public class WeatherData {

    @Json(name = "response")
    private Response response;
    @Json(name = "current_observation")
    private CurrentObservation currentObservation;
    @Json(name = "hourly_forecast")
    private List<HourlyForecast> hourlyForecast = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherData() {
    }

    /**
     * 
     * @param currentObservation
     * @param response
     * @param hourlyForecast
     */
    public WeatherData(Response response, CurrentObservation currentObservation, List<HourlyForecast> hourlyForecast) {
        super();
        this.response = response;
        this.currentObservation = currentObservation;
        this.hourlyForecast = hourlyForecast;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public WeatherData withResponse(Response response) {
        this.response = response;
        return this;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    public WeatherData withCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
        return this;
    }

    public List<HourlyForecast> getHourlyForecast() {
        return hourlyForecast;
    }

    public void setHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
    }

    public WeatherData withHourlyForecast(List<HourlyForecast> hourlyForecast) {
        this.hourlyForecast = hourlyForecast;
        return this;
    }

}
