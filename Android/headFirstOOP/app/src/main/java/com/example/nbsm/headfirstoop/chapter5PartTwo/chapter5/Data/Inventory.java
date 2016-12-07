package com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Data;

import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Instrument;
import com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.InstrumentSpec;

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
        Instrument instrument = new Instrument(serialNumber,price,spec);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber){
        for (Instrument instrument: inventory){
            if (instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec){
        //matching search list
        List<Instrument> matchingInstruments = new ArrayList<Instrument>();
        for (Instrument instrument: inventory){
            if (instrument.getSpec().matches(searchSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }

}
