package com.example.nbsm.headfirstoop.chapter5PartTwo.chapter5.Domain.Instruments.Enums;

/**
 * Created by nbsm on 30-11-2016.
 */
public enum Style {
    A,F;

    @Override
    public String toString(){
        switch(this){
            case A:
                return "A";
            case F:
                return "F";
        }
        return "";
    }

}
