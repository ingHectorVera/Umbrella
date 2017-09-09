package com.foo.umbrella.database.library;

/**
 * Created by Hector Vera on 9/7/2017.
 */

public class Library {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "umbrellaConfig";

    public static final String TABLE_CONFIG = "config";
    public static final String CONFIG_ATT = "attribute";
    public static final String CONFIG_VALUE = "value";

    public static final String ATT_ZIP_CODE = "zipCode";
    public static final String ATT_UNIT = "unit";
    public static final String API_KEY = "8851aaec50fe0323";

    public static final String CELSIUS = "Celsius";
    public static final String FAHRENHEIT = "Fahrenheit";
    public static final String ZIP_CODE_ERROR = "Wrong zip code, please change it in settings";
    public static final double TEMPERATURE_LIMIT = 60;
}
