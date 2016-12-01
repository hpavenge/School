package com.example.nbsm.headfirstoop.chapter5.Domain.Instruments.Enums;

/**
 * Created by nbsm on 24-11-2016.
 */

public enum Type {
    ACOUSTIC,ELECTRIC;

    public String toString(){
        switch (this){
            case ACOUSTIC: return "acoustic";
            case ELECTRIC:return "electric";
        }
        return null;
    }
}
