
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class Feelslike {

    @Json(name = "english")
    private String english;
    @Json(name = "metric")
    private String metric;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Feelslike() {
    }

    /**
     * 
     * @param metric
     * @param english
     */
    public Feelslike(String english, String metric) {
        super();
        this.english = english;
        this.metric = metric;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Feelslike withEnglish(String english) {
        this.english = english;
        return this;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public Feelslike withMetric(String metric) {
        this.metric = metric;
        return this;
    }

}
