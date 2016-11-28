package com.example.nbsm.headfirstoop.ChapterTwoThree.Business;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nbsm on 24-11-2016.
 */

// mockup of dogdoor communicating with hardware
public class DogDoor {
    private boolean open;
    private int opening;
    private List<Bark> allowedBarks;

    public DogDoor(){
        open = false;
        opening = 12;
        allowedBarks = new ArrayList<Bark>();
    }

    public void open(){
        System.out.println("Door opening");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("Door closing");
        open = false;
    }

    public Boolean isOpen(){
        return open;
    }

    public void addAlowedBark(Bark bark){
        this.allowedBarks.add(bark);
    }

    public List<Bark> getAllowedBarks(){
        return allowedBarks;
    }

}
