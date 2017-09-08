
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class FCTTIME {

    @Json(name = "hour")
    private String hour;
    @Json(name = "hour_padded")
    private String hourPadded;
    @Json(name = "min")
    private String min;
    @Json(name = "min_unpadded")
    private String minUnpadded;
    @Json(name = "sec")
    private String sec;
    @Json(name = "year")
    private String year;
    @Json(name = "mon")
    private String mon;
    @Json(name = "mon_padded")
    private String monPadded;
    @Json(name = "mon_abbrev")
    private String monAbbrev;
    @Json(name = "mday")
    private String mday;
    @Json(name = "mday_padded")
    private String mdayPadded;
    @Json(name = "yday")
    private String yday;
    @Json(name = "isdst")
    private String isdst;
    @Json(name = "epoch")
    private String epoch;
    @Json(name = "pretty")
    private String pretty;
    @Json(name = "civil")
    private String civil;
    @Json(name = "month_name")
    private String monthName;
    @Json(name = "month_name_abbrev")
    private String monthNameAbbrev;
    @Json(name = "weekday_name")
    private String weekdayName;
    @Json(name = "weekday_name_night")
    private String weekdayNameNight;
    @Json(name = "weekday_name_abbrev")
    private String weekdayNameAbbrev;
    @Json(name = "weekday_name_unlang")
    private String weekdayNameUnlang;
    @Json(name = "weekday_name_night_unlang")
    private String weekdayNameNightUnlang;
    @Json(name = "ampm")
    private String ampm;
    @Json(name = "tz")
    private String tz;
    @Json(name = "age")
    private String age;
    @Json(name = "UTCDATE")
    private String uTCDATE;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FCTTIME() {
    }

    /**
     * 
     * @param weekdayNameNightUnlang
     * @param mdayPadded
     * @param weekdayNameAbbrev
     * @param pretty
     * @param minUnpadded
     * @param monthNameAbbrev
     * @param ampm
     * @param weekdayNameNight
     * @param age
     * @param civil
     * @param year
     * @param monPadded
     * @param min
     * @param monAbbrev
     * @param epoch
     * @param mday
     * @param mon
     * @param hourPadded
     * @param hour
     * @param weekdayName
     * @param isdst
     * @param tz
     * @param weekdayNameUnlang
     * @param yday
     * @param sec
     * @param uTCDATE
     * @param monthName
     */
    public FCTTIME(String hour, String hourPadded, String min, String minUnpadded, String sec, String year, String mon, String monPadded, String monAbbrev, String mday, String mdayPadded, String yday, String isdst, String epoch, String pretty, String civil, String monthName, String monthNameAbbrev, String weekdayName, String weekdayNameNight, String weekdayNameAbbrev, String weekdayNameUnlang, String weekdayNameNightUnlang, String ampm, String tz, String age, String uTCDATE) {
        super();
        this.hour = hour;
        this.hourPadded = hourPadded;
        this.min = min;
        this.minUnpadded = minUnpadded;
        this.sec = sec;
        this.year = year;
        this.mon = mon;
        this.monPadded = monPadded;
        this.monAbbrev = monAbbrev;
        this.mday = mday;
        this.mdayPadded = mdayPadded;
        this.yday = yday;
        this.isdst = isdst;
        this.epoch = epoch;
        this.pretty = pretty;
        this.civil = civil;
        this.monthName = monthName;
        this.monthNameAbbrev = monthNameAbbrev;
        this.weekdayName = weekdayName;
        this.weekdayNameNight = weekdayNameNight;
        this.weekdayNameAbbrev = weekdayNameAbbrev;
        this.weekdayNameUnlang = weekdayNameUnlang;
        this.weekdayNameNightUnlang = weekdayNameNightUnlang;
        this.ampm = ampm;
        this.tz = tz;
        this.age = age;
        this.uTCDATE = uTCDATE;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public FCTTIME withHour(String hour) {
        this.hour = hour;
        return this;
    }

    public String getHourPadded() {
        return hourPadded;
    }

    public void setHourPadded(String hourPadded) {
        this.hourPadded = hourPadded;
    }

    public FCTTIME withHourPadded(String hourPadded) {
        this.hourPadded = hourPadded;
        return this;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public FCTTIME withMin(String min) {
        this.min = min;
        return this;
    }

    public String getMinUnpadded() {
        return minUnpadded;
    }

    public void setMinUnpadded(String minUnpadded) {
        this.minUnpadded = minUnpadded;
    }

    public FCTTIME withMinUnpadded(String minUnpadded) {
        this.minUnpadded = minUnpadded;
        return this;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public FCTTIME withSec(String sec) {
        this.sec = sec;
        return this;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public FCTTIME withYear(String year) {
        this.year = year;
        return this;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public FCTTIME withMon(String mon) {
        this.mon = mon;
        return this;
    }

    public String getMonPadded() {
        return monPadded;
    }

    public void setMonPadded(String monPadded) {
        this.monPadded = monPadded;
    }

    public FCTTIME withMonPadded(String monPadded) {
        this.monPadded = monPadded;
        return this;
    }

    public String getMonAbbrev() {
        return monAbbrev;
    }

    public void setMonAbbrev(String monAbbrev) {
        this.monAbbrev = monAbbrev;
    }

    public FCTTIME withMonAbbrev(String monAbbrev) {
        this.monAbbrev = monAbbrev;
        return this;
    }

    public String getMday() {
        return mday;
    }

    public void setMday(String mday) {
        this.mday = mday;
    }

    public FCTTIME withMday(String mday) {
        this.mday = mday;
        return this;
    }

    public String getMdayPadded() {
        return mdayPadded;
    }

    public void setMdayPadded(String mdayPadded) {
        this.mdayPadded = mdayPadded;
    }

    public FCTTIME withMdayPadded(String mdayPadded) {
        this.mdayPadded = mdayPadded;
        return this;
    }

    public String getYday() {
        return yday;
    }

    public void setYday(String yday) {
        this.yday = yday;
    }

    public FCTTIME withYday(String yday) {
        this.yday = yday;
        return this;
    }

    public String getIsdst() {
        return isdst;
    }

    public void setIsdst(String isdst) {
        this.isdst = isdst;
    }

    public FCTTIME withIsdst(String isdst) {
        this.isdst = isdst;
        return this;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public FCTTIME withEpoch(String epoch) {
        this.epoch = epoch;
        return this;
    }

    public String getPretty() {
        return pretty;
    }

    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    public FCTTIME withPretty(String pretty) {
        this.pretty = pretty;
        return this;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public FCTTIME withCivil(String civil) {
        this.civil = civil;
        return this;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public FCTTIME withMonthName(String monthName) {
        this.monthName = monthName;
        return this;
    }

    public String getMonthNameAbbrev() {
        return monthNameAbbrev;
    }

    public void setMonthNameAbbrev(String monthNameAbbrev) {
        this.monthNameAbbrev = monthNameAbbrev;
    }

    public FCTTIME withMonthNameAbbrev(String monthNameAbbrev) {
        this.monthNameAbbrev = monthNameAbbrev;
        return this;
    }

    public String getWeekdayName() {
        return weekdayName;
    }

    public void setWeekdayName(String weekdayName) {
        this.weekdayName = weekdayName;
    }

    public FCTTIME withWeekdayName(String weekdayName) {
        this.weekdayName = weekdayName;
        return this;
    }

    public String getWeekdayNameNight() {
        return weekdayNameNight;
    }

    public void setWeekdayNameNight(String weekdayNameNight) {
        this.weekdayNameNight = weekdayNameNight;
    }

    public FCTTIME withWeekdayNameNight(String weekdayNameNight) {
        this.weekdayNameNight = weekdayNameNight;
        return this;
    }

    public String getWeekdayNameAbbrev() {
        return weekdayNameAbbrev;
    }

    public void setWeekdayNameAbbrev(String weekdayNameAbbrev) {
        this.weekdayNameAbbrev = weekdayNameAbbrev;
    }

    public FCTTIME withWeekdayNameAbbrev(String weekdayNameAbbrev) {
        this.weekdayNameAbbrev = weekdayNameAbbrev;
        return this;
    }

    public String getWeekdayNameUnlang() {
        return weekdayNameUnlang;
    }

    public void setWeekdayNameUnlang(String weekdayNameUnlang) {
        this.weekdayNameUnlang = weekdayNameUnlang;
    }

    public FCTTIME withWeekdayNameUnlang(String weekdayNameUnlang) {
        this.weekdayNameUnlang = weekdayNameUnlang;
        return this;
    }

    public String getWeekdayNameNightUnlang() {
        return weekdayNameNightUnlang;
    }

    public void setWeekdayNameNightUnlang(String weekdayNameNightUnlang) {
        this.weekdayNameNightUnlang = weekdayNameNightUnlang;
    }

    public FCTTIME withWeekdayNameNightUnlang(String weekdayNameNightUnlang) {
        this.weekdayNameNightUnlang = weekdayNameNightUnlang;
        return this;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public FCTTIME withAmpm(String ampm) {
        this.ampm = ampm;
        return this;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public FCTTIME withTz(String tz) {
        this.tz = tz;
        return this;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public FCTTIME withAge(String age) {
        this.age = age;
        return this;
    }

    public String getUTCDATE() {
        return uTCDATE;
    }

    public void setUTCDATE(String uTCDATE) {
        this.uTCDATE = uTCDATE;
    }

    public FCTTIME withUTCDATE(String uTCDATE) {
        this.uTCDATE = uTCDATE;
        return this;
    }

}
