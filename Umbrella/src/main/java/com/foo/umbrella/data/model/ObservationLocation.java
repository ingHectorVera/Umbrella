
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class ObservationLocation {

    @Json(name = "full")
    private String full;
    @Json(name = "city")
    private String city;
    @Json(name = "state")
    private String state;
    @Json(name = "country")
    private String country;
    @Json(name = "country_iso3166")
    private String countryIso3166;
    @Json(name = "latitude")
    private String latitude;
    @Json(name = "longitude")
    private String longitude;
    @Json(name = "elevation")
    private String elevation;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ObservationLocation() {
    }

    /**
     * 
     * @param countryIso3166
     * @param full
     * @param elevation
     * @param state
     * @param longitude
     * @param latitude
     * @param country
     * @param city
     */
    public ObservationLocation(String full, String city, String state, String country, String countryIso3166, String latitude, String longitude, String elevation) {
        super();
        this.full = full;
        this.city = city;
        this.state = state;
        this.country = country;
        this.countryIso3166 = countryIso3166;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public ObservationLocation withFull(String full) {
        this.full = full;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ObservationLocation withCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ObservationLocation withState(String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ObservationLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public ObservationLocation withCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public ObservationLocation withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ObservationLocation withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public ObservationLocation withElevation(String elevation) {
        this.elevation = elevation;
        return this;
    }

}
