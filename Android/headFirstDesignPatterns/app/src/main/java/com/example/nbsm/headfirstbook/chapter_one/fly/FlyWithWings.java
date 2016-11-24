package com.example.nbsm.headfirstbook.chapter_one.fly;

/**
 * Created by nbsm on 10-11-2016.
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly normally!");
    }
}
