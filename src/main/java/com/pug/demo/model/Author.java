package com.pug.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Author extends Entry {

    @Override
    public Fields getFields() {
        return new Fields();
    }

    @Override
    public Sys getSys() {
        return new Sys();
    }
}
