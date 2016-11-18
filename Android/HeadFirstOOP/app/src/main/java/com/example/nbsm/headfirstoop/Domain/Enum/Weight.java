package com.example.nbsm.headfirstoop.Domain.Enum;

/**
 * Created by nbsm on 18-11-2016.
 */
public enum Weight {
    LIGHT,MEDIUM,HEAVY;

    public String toString(){
        switch (this){
            case LIGHT:
                return "Light";
            case MEDIUM:
                return "Medium";
            case HEAVY:
                return "Heavy";
        }

        return null;
    }
}
