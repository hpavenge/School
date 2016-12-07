package com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Enums;

import android.widget.Switch;

/**
 * Created by nbsm on 1-12-2016.
 */

public enum InstrumentType {
    GUITAR,BANJO,DOBRO, FIDDLE, BASS, MANDOLIN;

    @Override
    public String toString(){
        switch(this){
            case GUITAR:
                return "Guitar";
            case BANJO:
                return "Banjo";
            case DOBRO:
                return "Dobro";
            case FIDDLE:
                return "Fiddle";
            case BASS:
                return "Bass";
            case MANDOLIN:
                return "Mandolin";
        }
        return "Unspecified";
    }
}
