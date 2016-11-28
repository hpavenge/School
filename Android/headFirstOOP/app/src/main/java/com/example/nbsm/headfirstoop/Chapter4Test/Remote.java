package com.example.nbsm.headfirstoop.Chapter4Test;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Remote {
    DogDoor dogDoor;

    public Remote(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        System.out.println("Button pressed");
        if (dogDoor.isOpen()){
            dogDoor.close();
        }
        else{
            dogDoor.open();
        }
    }
}
