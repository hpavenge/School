package com.example.nbsm.headfirstbook.chapter_one.ducks;

import com.example.nbsm.headfirstbook.chapter_one.fly.FlyWithWings;

/**
 * Created by nbsm on 10-11-2016.
 */

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void performDisplay(){
        System.out.println("Looks like a redhead");
    }
}
