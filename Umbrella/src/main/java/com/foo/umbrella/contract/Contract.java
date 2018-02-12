package com.foo.umbrella.contract;

import com.foo.umbrella.data.model.HourlyForecast;

import java.util.ArrayList;


public interface Contract {
    interface View {
         void fillList(ArrayList<ArrayList<HourlyForecast>> finalList);
    }

    interface Presenter {
        void requestHourlyForecast(String zipCode);
    }
}
