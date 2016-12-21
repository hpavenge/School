package com.example.nbsm.headfirstdesignbook2.chapt7FacadePatternHometheater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstdesignbook2.R;

public class HomeTheaterMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_theater_main);
        /**
         * should make concrete classes from them and instantiate them
         */
        Amplifier amp;
        Tuner tuner;
        DvdPlayer dvd;
        CdPlayer cd;
        Projector projector;
        TheaterLights lights;
        Screen screen;
        PopcornPopper popper;

        // lazy commented because cba to make the classes concrete
//        HomeTheaterFacade homeTheater =
//                new HomeTheaterFacade(amp, tuner, dvd, cd,
//                        projector, screen, lights, popper);
//        homeTheater.watchMovie(“Raiders of the Lost Ark”);
//        homeTheater.endMovie();

    }
}
