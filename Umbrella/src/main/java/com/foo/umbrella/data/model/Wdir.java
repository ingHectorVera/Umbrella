
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class Wdir {

    @Json(name = "dir")
    private String dir;
    @Json(name = "degrees")
    private String degrees;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wdir() {
    }

    /**
     * 
     * @param dir
     * @param degrees
     */
    public Wdir(String dir, String degrees) {
        super();
        this.dir = dir;
        this.degrees = degrees;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public Wdir withDir(String dir) {
        this.dir = dir;
        return this;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    public Wdir withDegrees(String degrees) {
        this.degrees = degrees;
        return this;
    }

}
