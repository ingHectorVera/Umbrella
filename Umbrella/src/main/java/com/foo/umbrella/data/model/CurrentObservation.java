
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class CurrentObservation {

    @Json(name = "image")
    private Image image;
    @Json(name = "display_location")
    private DisplayLocation displayLocation;
    @Json(name = "observation_location")
    private ObservationLocation observationLocation;
    @Json(name = "estimated")
    private Estimated estimated;
    @Json(name = "station_id")
    private String stationId;
    @Json(name = "observation_time")
    private String observationTime;
    @Json(name = "observation_time_rfc822")
    private String observationTimeRfc822;
    @Json(name = "observation_epoch")
    private String observationEpoch;
    @Json(name = "local_time_rfc822")
    private String localTimeRfc822;
    @Json(name = "local_epoch")
    private String localEpoch;
    @Json(name = "local_tz_short")
    private String localTzShort;
    @Json(name = "local_tz_long")
    private String localTzLong;
    @Json(name = "local_tz_offset")
    private String localTzOffset;
    @Json(name = "weather")
    private String weather;
    @Json(name = "temperature_string")
    private String temperatureString;
    @Json(name = "temp_f")
    private double tempF;
    @Json(name = "temp_c")
    private double tempC;
    @Json(name = "relative_humidity")
    private String relativeHumidity;
    @Json(name = "wind_string")
    private String windString;
    @Json(name = "wind_dir")
    private String windDir;
    @Json(name = "pressure_mb")
    private String pressureMb;
    @Json(name = "pressure_in")
    private String pressureIn;
    @Json(name = "pressure_trend")
    private String pressureTrend;
    @Json(name = "dewpoint_string")
    private String dewpointString;
    @Json(name = "heat_index_string")
    private String heatIndexString;
    @Json(name = "heat_index_f")
    private String heatIndexF;
    @Json(name = "heat_index_c")
    private String heatIndexC;
    @Json(name = "windchill_string")
    private String windchillString;
    @Json(name = "windchill_f")
    private String windchillF;
    @Json(name = "windchill_c")
    private String windchillC;
    @Json(name = "feelslike_string")
    private String feelslikeString;
    @Json(name = "feelslike_f")
    private String feelslikeF;
    @Json(name = "feelslike_c")
    private String feelslikeC;
    @Json(name = "visibility_mi")
    private String visibilityMi;
    @Json(name = "visibility_km")
    private String visibilityKm;
    @Json(name = "solarradiation")
    private String solarradiation;
    @Json(name = "UV")
    private String uV;
    @Json(name = "precip_1hr_string")
    private String precip1hrString;
    @Json(name = "precip_1hr_in")
    private String precip1hrIn;
    @Json(name = "precip_1hr_metric")
    private String precip1hrMetric;
    @Json(name = "precip_today_string")
    private String precipTodayString;
    @Json(name = "precip_today_in")
    private String precipTodayIn;
    @Json(name = "precip_today_metric")
    private String precipTodayMetric;
    @Json(name = "icon")
    private String icon;
    @Json(name = "icon_url")
    private String iconUrl;
    @Json(name = "forecast_url")
    private String forecastUrl;
    @Json(name = "history_url")
    private String historyUrl;
    @Json(name = "ob_url")
    private String obUrl;
    @Json(name = "nowcast")
    private String nowcast;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CurrentObservation() {
    }

    /**
     * 
     * @param feelslikeC
     * @param historyUrl
     * @param iconUrl
     * @param localTzOffset
     * @param precipTodayIn
     * @param stationId
     * @param precipTodayMetric
     * @param estimated
     * @param localTzLong
     * @param pressureTrend
     * @param visibilityKm
     * @param weather
     * @param dewpointC
     * @param pressureIn
     * @param dewpointF
     * @param windKph
     * @param displayLocation
     * @param image
     * @param solarradiation
     * @param windGustMph
     * @param windDegrees
     * @param localTimeRfc822
     * @param precip1hrMetric
     * @param heatIndexString
     * @param forecastUrl
     * @param windDir
     * @param feelslikeF
     * @param windString
     * @param observationEpoch
     * @param heatIndexF
     * @param localTzShort
     * @param heatIndexC
     * @param visibilityMi
     * @param localEpoch
     * @param observationLocation
     * @param precipTodayString
     * @param windGustKph
     * @param feelslikeString
     * @param tempC
     * @param observationTime
     * @param obUrl
     * @param icon
     * @param relativeHumidity
     * @param pressureMb
     * @param precip1hrString
     * @param temperatureString
     * @param dewpointString
     * @param windMph
     * @param nowcast
     * @param observationTimeRfc822
     * @param windchillString
     * @param precip1hrIn
     * @param uV
     * @param windchillF
     * @param windchillC
     * @param tempF
     */
    public CurrentObservation(Image image, DisplayLocation displayLocation, ObservationLocation observationLocation, Estimated estimated, String stationId, String observationTime, String observationTimeRfc822, String observationEpoch, String localTimeRfc822, String localEpoch, String localTzShort, String localTzLong, String localTzOffset, String weather, String temperatureString, double tempF, double tempC, String relativeHumidity, String windString, String windDir, int windDegrees, double windMph, int windGustMph, int windKph, int windGustKph, String pressureMb, String pressureIn, String pressureTrend, String dewpointString, int dewpointF, int dewpointC, String heatIndexString, String heatIndexF, String heatIndexC, String windchillString, String windchillF, String windchillC, String feelslikeString, String feelslikeF, String feelslikeC, String visibilityMi, String visibilityKm, String solarradiation, String uV, String precip1hrString, String precip1hrIn, String precip1hrMetric, String precipTodayString, String precipTodayIn, String precipTodayMetric, String icon, String iconUrl, String forecastUrl, String historyUrl, String obUrl, String nowcast) {
        super();
        this.image = image;
        this.displayLocation = displayLocation;
        this.observationLocation = observationLocation;
        this.estimated = estimated;
        this.stationId = stationId;
        this.observationTime = observationTime;
        this.observationTimeRfc822 = observationTimeRfc822;
        this.observationEpoch = observationEpoch;
        this.localTimeRfc822 = localTimeRfc822;
        this.localEpoch = localEpoch;
        this.localTzShort = localTzShort;
        this.localTzLong = localTzLong;
        this.localTzOffset = localTzOffset;
        this.weather = weather;
        this.temperatureString = temperatureString;
        this.tempF = tempF;
        this.tempC = tempC;
        this.relativeHumidity = relativeHumidity;
        this.windString = windString;
        this.windDir = windDir;
        this.pressureMb = pressureMb;
        this.pressureIn = pressureIn;
        this.pressureTrend = pressureTrend;
        this.dewpointString = dewpointString;
        this.heatIndexString = heatIndexString;
        this.heatIndexF = heatIndexF;
        this.heatIndexC = heatIndexC;
        this.windchillString = windchillString;
        this.windchillF = windchillF;
        this.windchillC = windchillC;
        this.feelslikeString = feelslikeString;
        this.feelslikeF = feelslikeF;
        this.feelslikeC = feelslikeC;
        this.visibilityMi = visibilityMi;
        this.visibilityKm = visibilityKm;
        this.solarradiation = solarradiation;
        this.uV = uV;
        this.precip1hrString = precip1hrString;
        this.precip1hrIn = precip1hrIn;
        this.precip1hrMetric = precip1hrMetric;
        this.precipTodayString = precipTodayString;
        this.precipTodayIn = precipTodayIn;
        this.precipTodayMetric = precipTodayMetric;
        this.icon = icon;
        this.iconUrl = iconUrl;
        this.forecastUrl = forecastUrl;
        this.historyUrl = historyUrl;
        this.obUrl = obUrl;
        this.nowcast = nowcast;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public CurrentObservation withImage(Image image) {
        this.image = image;
        return this;
    }

    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
    }

    public CurrentObservation withDisplayLocation(DisplayLocation displayLocation) {
        this.displayLocation = displayLocation;
        return this;
    }

    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
    }

    public CurrentObservation withObservationLocation(ObservationLocation observationLocation) {
        this.observationLocation = observationLocation;
        return this;
    }

    public Estimated getEstimated() {
        return estimated;
    }

    public void setEstimated(Estimated estimated) {
        this.estimated = estimated;
    }

    public CurrentObservation withEstimated(Estimated estimated) {
        this.estimated = estimated;
        return this;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public CurrentObservation withStationId(String stationId) {
        this.stationId = stationId;
        return this;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public CurrentObservation withObservationTime(String observationTime) {
        this.observationTime = observationTime;
        return this;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public CurrentObservation withObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
        return this;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public CurrentObservation withObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
        return this;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public CurrentObservation withLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
        return this;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public CurrentObservation withLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
        return this;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public CurrentObservation withLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
        return this;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public CurrentObservation withLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
        return this;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public CurrentObservation withLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
        return this;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public CurrentObservation withWeather(String weather) {
        this.weather = weather;
        return this;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public CurrentObservation withTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
        return this;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public CurrentObservation withTempF(double tempF) {
        this.tempF = tempF;
        return this;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public CurrentObservation withTempC(double tempC) {
        this.tempC = tempC;
        return this;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public CurrentObservation withRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
        return this;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public CurrentObservation withWindString(String windString) {
        this.windString = windString;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public CurrentObservation withWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public CurrentObservation withPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
        return this;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public CurrentObservation withPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
        return this;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public CurrentObservation withPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
        return this;
    }

    public String getDewpointString() {
        return dewpointString;
    }

    public void setDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
    }

    public CurrentObservation withDewpointString(String dewpointString) {
        this.dewpointString = dewpointString;
        return this;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public CurrentObservation withHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
        return this;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public CurrentObservation withHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
        return this;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public CurrentObservation withHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
        return this;
    }

    public String getWindchillString() {
        return windchillString;
    }

    public void setWindchillString(String windchillString) {
        this.windchillString = windchillString;
    }

    public CurrentObservation withWindchillString(String windchillString) {
        this.windchillString = windchillString;
        return this;
    }

    public String getWindchillF() {
        return windchillF;
    }

    public void setWindchillF(String windchillF) {
        this.windchillF = windchillF;
    }

    public CurrentObservation withWindchillF(String windchillF) {
        this.windchillF = windchillF;
        return this;
    }

    public String getWindchillC() {
        return windchillC;
    }

    public void setWindchillC(String windchillC) {
        this.windchillC = windchillC;
    }

    public CurrentObservation withWindchillC(String windchillC) {
        this.windchillC = windchillC;
        return this;
    }

    public String getFeelslikeString() {
        return feelslikeString;
    }

    public void setFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
    }

    public CurrentObservation withFeelslikeString(String feelslikeString) {
        this.feelslikeString = feelslikeString;
        return this;
    }

    public String getFeelslikeF() {
        return feelslikeF;
    }

    public void setFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    public CurrentObservation withFeelslikeF(String feelslikeF) {
        this.feelslikeF = feelslikeF;
        return this;
    }

    public String getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    public CurrentObservation withFeelslikeC(String feelslikeC) {
        this.feelslikeC = feelslikeC;
        return this;
    }

    public String getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public CurrentObservation withVisibilityMi(String visibilityMi) {
        this.visibilityMi = visibilityMi;
        return this;
    }

    public String getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public CurrentObservation withVisibilityKm(String visibilityKm) {
        this.visibilityKm = visibilityKm;
        return this;
    }

    public String getSolarradiation() {
        return solarradiation;
    }

    public void setSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
    }

    public CurrentObservation withSolarradiation(String solarradiation) {
        this.solarradiation = solarradiation;
        return this;
    }

    public String getUV() {
        return uV;
    }

    public void setUV(String uV) {
        this.uV = uV;
    }

    public CurrentObservation withUV(String uV) {
        this.uV = uV;
        return this;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public CurrentObservation withPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
        return this;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public CurrentObservation withPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
        return this;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public CurrentObservation withPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
        return this;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public CurrentObservation withPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
        return this;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public CurrentObservation withPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
        return this;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
    }

    public CurrentObservation withPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public CurrentObservation withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public CurrentObservation withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public CurrentObservation withForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
        return this;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public CurrentObservation withHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
        return this;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }

    public CurrentObservation withObUrl(String obUrl) {
        this.obUrl = obUrl;
        return this;
    }

    public String getNowcast() {
        return nowcast;
    }

    public void setNowcast(String nowcast) {
        this.nowcast = nowcast;
    }

    public CurrentObservation withNowcast(String nowcast) {
        this.nowcast = nowcast;
        return this;
    }

}
