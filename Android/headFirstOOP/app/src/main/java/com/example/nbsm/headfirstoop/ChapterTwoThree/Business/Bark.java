package com.example.nbsm.headfirstoop.ChapterTwoThree.Business;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Bark {
    private String sound;

    public Bark(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

    public boolean equals(Object bark){
        if (bark instanceof Bark) {
            Bark otherBark = (Bark) bark;
            if (this.sound.equalsIgnoreCase(otherBark.sound)) {
                return true; // allowed
            }
        }
        return false;
    }
}
