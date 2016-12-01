package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Mandolin;

import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Instrument;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.InstrumentSpec;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Mandolin extends Instrument{

    public Mandolin(String serialNumber, double price,MandolinSpec mandolinSpec){
        super(serialNumber,price,mandolinSpec);
    }
}
