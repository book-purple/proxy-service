package com.proxyservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * Written by Gaurav Sharma on 11 Sep 2019
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestProxyDto {

    @JsonProperty("key")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
