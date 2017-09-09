
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class Features {

    @Json(name = "conditions")
    private int conditions;
    @Json(name = "hourly")
    private int hourly;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Features() {
    }

    /**
     * 
     * @param conditions
     * @param hourly
     */
    public Features(int conditions, int hourly) {
        super();
        this.conditions = conditions;
        this.hourly = hourly;
    }

    public int getConditions() {
        return conditions;
    }

    public void setConditions(int conditions) {
        this.conditions = conditions;
    }

    public Features withConditions(int conditions) {
        this.conditions = conditions;
        return this;
    }

    public int getHourly() {
        return hourly;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }

    public Features withHourly(int hourly) {
        this.hourly = hourly;
        return this;
    }

}
