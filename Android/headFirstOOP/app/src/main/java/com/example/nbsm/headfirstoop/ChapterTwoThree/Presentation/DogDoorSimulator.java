package com.example.nbsm.headfirstoop.ChapterTwoThree.Presentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstoop.ChapterTwoThree.Business.Bark;
import com.example.nbsm.headfirstoop.ChapterTwoThree.Business.BarkRecognizer;
import com.example.nbsm.headfirstoop.ChapterTwoThree.Business.DogDoor;
import com.example.nbsm.headfirstoop.ChapterTwoThree.Business.Remote;
import com.example.nbsm.headfirstoop.R;

public class DogDoorSimulator extends AppCompatActivity {
    DogDoor dogDoor;
    Remote remote;
    BarkRecognizer barkRecognizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_doorsimulator);
        dogDoor = new DogDoor();
        remote = new Remote(dogDoor);
        barkRecognizer = new BarkRecognizer(dogDoor);
        // set right bark of the dog warrior
        Bark rightBark = new Bark("woof");
        dogDoor.addAlowedBark(rightBark);
        // one weird dog barking the word waffles
        Bark wrongBark = new Bark("waffles");
        // shouldnt do a thing
        barkRecognizer.recognize(wrongBark);
        // brave dog warrior
        barkRecognizer.recognize(rightBark);
        // etc the flow
        System.out.println("Dog goes outside");
        System.out.println("Dog does his buseniss");
        try {
            Thread.currentThread().sleep(10000);
            // same story different temp solution since doesnt go into catch -> while thread waits for 10 seconds and door close is called after 5
            if (!dogDoor.isOpen()){
                System.out.println("Door closed thanks to timer");
                System.out.println("Bark, System hears the bark");
                barkRecognizer.recognize(rightBark); // also opens when neighbour dog barks
                System.out.println("Dog goes inside");
            }
        } catch (InterruptedException e){
            // dunno why catch example aint working in android
            System.out.println("catched");
        }
    }
}
