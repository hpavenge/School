package com.example.nbsm.headfirstoop.ChapterTwoThree.Business;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Remote {

    private DogDoor door;
    // opening i guess

    public Remote(DogDoor dogdoor ){
        door = dogdoor;
    }

    public void pressButton(){
        // pressing button
        System.out.println("pressed button");
        if (door.isOpen()){
            door.close();
        }
        else{
            door.open();
        }
    }
}
