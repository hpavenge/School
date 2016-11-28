package com.example.nbsm.headfirstoop.ChapterTwoThree.Business;

import java.util.List;

/**
 * Created by nbsm on 24-11-2016.
 */

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        List<Bark> allowedBarks =  dogDoor.getAllowedBarks();
        for (Bark allowedBark : allowedBarks)
        if (allowedBark.equals(bark)){
            System.out.println("System detected the right bark open the door");
            dogDoor.open();
        }
        else{
            System.out.println("Not the good bark");
        }

    }
}
