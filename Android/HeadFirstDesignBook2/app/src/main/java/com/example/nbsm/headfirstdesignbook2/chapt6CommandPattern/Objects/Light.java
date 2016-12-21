package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects;

/**
 * Created by nbsm on 21-12-2016.
 */
public class Light {
    private String status;

    public Light(){
    }

    public void on(){
        status = "on";
        System.out.println("Light on yo");
    }

    public void off(){
        status = "off";
        System.out.println("Light off yo");
    }
}
