package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects;

/**
 * Created by nbsm on 21-12-2016.
 */

public class GarageDoor {

    public GarageDoor(){
    }

    public void up(){
        System.out.println("Garage door going up");
    }

    public void down(){
        System.out.println("Garage door going down");
    }

    private void stop(){
        System.out.println("Garage door stopped");
    }

    private void lightOn(){
        System.out.println("Light on");
    }

    private void lightOut(){
        System.out.println("Light out");
    }

}
