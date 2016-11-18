package com.example.nbsm.headfirstoop.Domain.Enum;

/**
 * Created by nbsm on 18-11-2016.
 */

public enum Type {
    WEED,HASH;

    public String toString(){
        switch(this){
            case WEED:
                return "Weed";
            case HASH:
                return "Hash";
        }
        return null;
    }
}
