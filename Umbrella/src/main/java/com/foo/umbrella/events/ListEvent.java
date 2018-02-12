package com.foo.umbrella.events;

import com.foo.umbrella.data.model.HourlyForecast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hector Vera on 2/11/2018.
 */

public class ListEvent {

    private ArrayList<ArrayList<HourlyForecast>> finalList;

    public ListEvent(ArrayList<ArrayList<HourlyForecast>> finalList) {
        this.finalList = finalList;
    }

    public ArrayList<ArrayList<HourlyForecast>> getFinalList() {
        return finalList;
    }

    public void setFinalList(ArrayList<ArrayList<HourlyForecast>> finalList) {
        this.finalList = finalList;
    }
}
