package com.foo.umbrella.data.api;

import com.foo.umbrella.data.model.WeatherData;
import com.foo.umbrella.database.library.Library;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.Result;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Retrofit interface for fetching weather data
 */
public interface WeatherService {

    String BASE_URL = "http://api.wunderground.com";
    /**
     * Get the forecast for a given zip code using {@link Call}
     */
    @GET("/api/" + Library.API_KEY + "/conditions/hourly/q/{zip}.json")
    Call<WeatherData> forecastForZipCallable(@Path("zip") String zipCode);

    /**
     * Get the forecast for a given zip code using {@link Observable}
     */
    @GET("/api/" + Library.API_KEY + "/conditions/hourly/q/{zip}.json")
    Observable<Result<WeatherData>> forecastForZipObservable(@Path("zip") String zipCode);

    class Factory {
        private static WeatherService service;

        public static WeatherService getInstance(){

            if(service == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(MoshiConverterFactory.create())
                        .baseUrl(BASE_URL)
                        .build();
                service = retrofit.create(WeatherService.class);
                return service;
            }else {
                return service;
            }

        }

    }

}
