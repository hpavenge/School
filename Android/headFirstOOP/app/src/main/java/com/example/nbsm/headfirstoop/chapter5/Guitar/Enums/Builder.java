package com.example.nbsm.headfirstoop.chapter5.Guitar.Enums;

/**
 * Created by nbsm on 24-11-2016.
 */

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch(this){
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            case OLSON: return "Olson";
            case RYAN: return "Ryan";
            case PRS: return "Prs";
            case ANY: return "Any";
        }
        return null;
    }
}
