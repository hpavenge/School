package com.example.nbsm.headfirstoop.chapter5.Guitar;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Guitar {
    private GuitarSpec guitarspec;

    public Guitar(GuitarSpec guitarspec) {
        this.guitarspec = guitarspec;
    }

    public GuitarSpec getGuitarspec() {
        return guitarspec;
    }

    public void setGuitarspec(GuitarSpec guitarspec) {
        this.guitarspec = guitarspec;
    }
}
