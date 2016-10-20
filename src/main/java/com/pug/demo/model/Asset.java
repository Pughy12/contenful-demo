package com.pug.demo.model;

/**
 * Created by Mike on 14/10/2016.
 */
public class Asset extends Entry {

    @Override
    public Fields getFields() {
        return new Fields();
    }

    @Override
    public Sys getSys() {
        return new Sys();
    }
}
