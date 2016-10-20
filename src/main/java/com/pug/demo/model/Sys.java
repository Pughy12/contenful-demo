package com.pug.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Mike on 17/10/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {

    private String id;

    public Sys() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
