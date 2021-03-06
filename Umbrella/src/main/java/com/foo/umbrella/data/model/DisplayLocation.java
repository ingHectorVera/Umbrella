
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class DisplayLocation {

    @Json(name = "full")
    private String full;
    @Json(name = "city")
    private String city;
    @Json(name = "state")
    private String state;
    @Json(name = "state_name")
    private String stateName;
    @Json(name = "country")
    private String country;
    @Json(name = "country_iso3166")
    private String countryIso3166;
    @Json(name = "zip")
    private String zip;
    @Json(name = "magic")
    private String magic;
    @Json(name = "wmo")
    private String wmo;
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
    public DisplayLocation() {
    }

    /**
     * 
     * @param zip
     * @param magic
     * @param countryIso3166
     * @param full
     * @param elevation
     * @param stateName
     * @param state
     * @param wmo
     * @param longitude
     * @param latitude
     * @param country
     * @param city
     */
    public DisplayLocation(String full, String city, String state, String stateName, String country, String countryIso3166, String zip, String magic, String wmo, String latitude, String longitude, String elevation) {
        super();
        this.full = full;
        this.city = city;
        this.state = state;
        this.stateName = stateName;
        this.country = country;
        this.countryIso3166 = countryIso3166;
        this.zip = zip;
        this.magic = magic;
        this.wmo = wmo;
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

    public DisplayLocation withFull(String full) {
        this.full = full;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public DisplayLocation withCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DisplayLocation withState(String state) {
        this.state = state;
        return this;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public DisplayLocation withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public DisplayLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryIso3166() {
        return countryIso3166;
    }

    public void setCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
    }

    public DisplayLocation withCountryIso3166(String countryIso3166) {
        this.countryIso3166 = countryIso3166;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public DisplayLocation withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public DisplayLocation withMagic(String magic) {
        this.magic = magic;
        return this;
    }

    public String getWmo() {
        return wmo;
    }

    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public DisplayLocation withWmo(String wmo) {
        this.wmo = wmo;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public DisplayLocation withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public DisplayLocation withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public DisplayLocation withElevation(String elevation) {
        this.elevation = elevation;
        return this;
    }

}
