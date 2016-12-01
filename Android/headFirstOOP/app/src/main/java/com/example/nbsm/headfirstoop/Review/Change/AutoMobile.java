package com.example.nbsm.headfirstoop.Review.Change;

/**
 * Created by nbsm on 1-12-2016.
 */

public class AutoMobile {
    private int tires;
    private String status;
    private float oilLevel;
    private Boolean filthy;

    public AutoMobile(int tires, String status, float oilLevel, Boolean filthy) {
        this.tires = tires;
        this.status = status;
        this.oilLevel = oilLevel;
        this.filthy = filthy;
    }

    public void start(){
        System.out.println("car starts driving");
        status = "driving";
    }

    public void stop(){
        System.out.println("car stopped");
        status = "stop";
    }

    public void wash(){
        if (filthy){
            System.out.println("car gewasssen etc");
        }
    }

    public String checkOil(){
        if (oilLevel == 100){
            return "saffie";
        }
        else{
            return "please refill";
        }
    }

    public float getOilLevel(){
        return oilLevel;
    }
}
