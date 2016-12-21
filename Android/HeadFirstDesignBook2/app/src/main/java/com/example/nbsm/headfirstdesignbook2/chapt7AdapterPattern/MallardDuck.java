package com.example.nbsm.headfirstdesignbook2.chapt7AdapterPattern;

/**
 * Created by nbsm on 21-12-2016.
 */

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I Fly sissy");
    }
}
