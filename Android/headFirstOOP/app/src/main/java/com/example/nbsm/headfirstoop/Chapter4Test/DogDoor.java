package com.example.nbsm.headfirstoop.Chapter4Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nbsm on 24-11-2016.
 */

public class DogDoor {
    List<Bark> allowedBarks;
    boolean open;

    public DogDoor(){
        open = false;
        allowedBarks = new ArrayList<Bark>();
    }

    public void open(){
        System.out.println("door opening");
        this.open = true;
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
        System.out.println("door closing");
        this.open = false;
    }

    public boolean isOpen(){
        return open;
    }

    public void addAllowedBark(Bark bark){
        allowedBarks.add(bark);
    }

    public List<Bark> getAllowedBarks(){
        return this.allowedBarks;
    }
}
