package com.example.nbsm.headfirstoop.chapter5.Data;

import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Instrument;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.InstrumentSpec;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Mandolin.Mandolin;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Mandolin.MandolinSpec;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Guitar.Guitar;
import com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Guitar.GuitarSpec;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Inventory {
    List<Instrument> inventory;

    public Inventory(){
        inventory = new ArrayList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if (spec instanceof  GuitarSpec){
            instrument = new Guitar(serialNumber,price,(GuitarSpec) spec);
        }
        else if(spec instanceof  MandolinSpec){
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber){
        for (Instrument instrument: inventory){
            if (instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec){
        //matching search list
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Instrument instrument: inventory){
            Guitar guitar = (Guitar) instrument;
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Mandolin> search(MandolinSpec mandolinSpec){
        // matching search list
        List<Mandolin> matchingMandolins = new ArrayList<Mandolin>();
        for (Instrument instrument : inventory){
            Mandolin mandolin = (Mandolin) instrument;
            if (mandolin.getSpec().matches(mandolinSpec)){
                matchingMandolins.add(mandolin);
            }
        }
        return matchingMandolins;
    }
}
