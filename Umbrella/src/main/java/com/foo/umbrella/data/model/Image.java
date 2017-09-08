
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;

public class Image {

    @Json(name = "url")
    private String url;
    @Json(name = "title")
    private String title;
    @Json(name = "link")
    private String link;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param title
     * @param link
     * @param url
     */
    public Image(String url, String title, String link) {
        super();
        this.url = url;
        this.title = title;
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Image withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Image withLink(String link) {
        this.link = link;
        return this;
    }

}
