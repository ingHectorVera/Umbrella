
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class HourlyForecast {

    @Json(name = "FCTTIME")
    private FCTTIME fCTTIME;
    @Json(name = "temp")
    private Temp temp;
    @Json(name = "dewpoint")
    private Dewpoint dewpoint;
    @Json(name = "condition")
    private String condition;
    @Json(name = "icon")
    private String icon;
    @Json(name = "icon_url")
    private String iconUrl;
    @Json(name = "fctcode")
    private String fctcode;
    @Json(name = "sky")
    private String sky;
    @Json(name = "wspd")
    private Wspd wspd;
    @Json(name = "wdir")
    private Wdir wdir;
    @Json(name = "wx")
    private String wx;
    @Json(name = "uvi")
    private String uvi;
    @Json(name = "humidity")
    private String humidity;
    @Json(name = "windchill")
    private Windchill windchill;
    @Json(name = "heatindex")
    private Heatindex heatindex;
    @Json(name = "feelslike")
    private Feelslike feelslike;
    @Json(name = "qpf")
    private Qpf qpf;
    @Json(name = "snow")
    private Snow snow;
    @Json(name = "pop")
    private String pop;
    @Json(name = "mslp")
    private Mslp mslp;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HourlyForecast() {
    }

    /**
     * 
     * @param uvi
     * @param mslp
     * @param icon
     * @param heatindex
     * @param condition
     * @param iconUrl
     * @param wspd
     * @param pop
     * @param fctcode
     * @param feelslike
     * @param wdir
     * @param wx
     * @param qpf
     * @param humidity
     * @param sky
     * @param snow
     * @param dewpoint
     * @param temp
     * @param fCTTIME
     * @param windchill
     */
    public HourlyForecast(FCTTIME fCTTIME, Temp temp, Dewpoint dewpoint, String condition, String icon, String iconUrl, String fctcode, String sky, Wspd wspd, Wdir wdir, String wx, String uvi, String humidity, Windchill windchill, Heatindex heatindex, Feelslike feelslike, Qpf qpf, Snow snow, String pop, Mslp mslp) {
        super();
        this.fCTTIME = fCTTIME;
        this.temp = temp;
        this.dewpoint = dewpoint;
        this.condition = condition;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.fctcode = fctcode;
        this.sky = sky;
        this.wspd = wspd;
        this.wdir = wdir;
        this.wx = wx;
        this.uvi = uvi;
        this.humidity = humidity;
        this.windchill = windchill;
        this.heatindex = heatindex;
        this.feelslike = feelslike;
        this.qpf = qpf;
        this.snow = snow;
        this.pop = pop;
        this.mslp = mslp;
    }

    public FCTTIME getFCTTIME() {
        return fCTTIME;
    }

    public void setFCTTIME(FCTTIME fCTTIME) {
        this.fCTTIME = fCTTIME;
    }

    public HourlyForecast withFCTTIME(FCTTIME fCTTIME) {
        this.fCTTIME = fCTTIME;
        return this;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public HourlyForecast withTemp(Temp temp) {
        this.temp = temp;
        return this;
    }

    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    public HourlyForecast withDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public HourlyForecast withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public HourlyForecast withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public HourlyForecast withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public HourlyForecast withFctcode(String fctcode) {
        this.fctcode = fctcode;
        return this;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public HourlyForecast withSky(String sky) {
        this.sky = sky;
        return this;
    }

    public Wspd getWspd() {
        return wspd;
    }

    public void setWspd(Wspd wspd) {
        this.wspd = wspd;
    }

    public HourlyForecast withWspd(Wspd wspd) {
        this.wspd = wspd;
        return this;
    }

    public Wdir getWdir() {
        return wdir;
    }

    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    public HourlyForecast withWdir(Wdir wdir) {
        this.wdir = wdir;
        return this;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public HourlyForecast withWx(String wx) {
        this.wx = wx;
        return this;
    }

    public String getUvi() {
        return uvi;
    }

    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    public HourlyForecast withUvi(String uvi) {
        this.uvi = uvi;
        return this;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public HourlyForecast withHumidity(String humidity) {
        this.humidity = humidity;
        return this;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public void setWindchill(Windchill windchill) {
        this.windchill = windchill;
    }

    public HourlyForecast withWindchill(Windchill windchill) {
        this.windchill = windchill;
        return this;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
    }

    public HourlyForecast withHeatindex(Heatindex heatindex) {
        this.heatindex = heatindex;
        return this;
    }

    public Feelslike getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
    }

    public HourlyForecast withFeelslike(Feelslike feelslike) {
        this.feelslike = feelslike;
        return this;
    }

    public Qpf getQpf() {
        return qpf;
    }

    public void setQpf(Qpf qpf) {
        this.qpf = qpf;
    }

    public HourlyForecast withQpf(Qpf qpf) {
        this.qpf = qpf;
        return this;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public HourlyForecast withSnow(Snow snow) {
        this.snow = snow;
        return this;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public HourlyForecast withPop(String pop) {
        this.pop = pop;
        return this;
    }

    public Mslp getMslp() {
        return mslp;
    }

    public void setMslp(Mslp mslp) {
        this.mslp = mslp;
    }

    public HourlyForecast withMslp(Mslp mslp) {
        this.mslp = mslp;
        return this;
    }

}
