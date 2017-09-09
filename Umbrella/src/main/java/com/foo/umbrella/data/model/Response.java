
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class Response {

    @Json(name = "version")
    private String version;
    @Json(name = "termsofService")
    private String termsofService;
    @Json(name = "features")
    private Features features;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Response() {
    }

    /**
     * 
     * @param features
     * @param termsofService
     * @param version
     */
    public Response(String version, String termsofService, Features features) {
        super();
        this.version = version;
        this.termsofService = termsofService;
        this.features = features;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Response withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getTermsofService() {
        return termsofService;
    }

    public void setTermsofService(String termsofService) {
        this.termsofService = termsofService;
    }

    public Response withTermsofService(String termsofService) {
        this.termsofService = termsofService;
        return this;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Response withFeatures(Features features) {
        this.features = features;
        return this;
    }

}
