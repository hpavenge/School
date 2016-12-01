package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Guitar;

import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Instrument;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Guitar extends Instrument {


    public Guitar(String serialNumber, double price,GuitarSpec guitarspec) {
        super(serialNumber,price, guitarspec);
    }
}
