package com.example.nbsm.headfirstoop.Chapter4Test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstoop.R;

public class TestDogDoorSimulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dog_door_simulator);
    }

    @Override
    protected void onResume() {
        super.onResume();
        DogDoor dogDoor = new DogDoor();
        // the weird dog
        dogDoor.addAllowedBark(new Bark("woof"));
        dogDoor.addAllowedBark(new Bark("walf"));
        dogDoor.addAllowedBark(new Bark("waffles"));
        // simulate barkings
        BarkRecognizer barkRecognizer = new BarkRecognizer(dogDoor);
        System.out.println("my weird dog barking");
        barkRecognizer.recognize(new Bark("waffles"));
        System.out.println("doggie goes outside");
        // neighbourhood doggie barks
        Bark smallBark = new Bark("derpaherp");
        barkRecognizer.recognize(smallBark);
        try {
            Thread.currentThread().sleep(10000); // sleep for ten secconds
            if (!dogDoor.isOpen()){
                System.out.println("my weird dog wants to go inside so starts barking");
                barkRecognizer.recognize(new Bark("woof"));
                System.out.println("Dog is inside");
            }
        }catch (InterruptedException e){
            // derp a herp not made for android
        }
    }
}
