package com.example.nbsm.headfirstoop.Review.Change.AutoMobileNew;

/**
 * Created by nbsm on 1-12-2016.
 */

public class Mechanic {

    public String checkOil(AutoMobile autoMobile){
        if (autoMobile.oilLevel == 100){
            return "saffie";
        }
        else{
            return "please refill";
        }
    }

    public float getOilLevel(AutoMobile autoMobile){
        return autoMobile.oilLevel;
    }
}
