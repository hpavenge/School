package com.example.nbsm.headfirstbook.chapter_one.ducks;

import com.example.nbsm.headfirstbook.chapter_one.fly.FlyWithWings;
import com.example.nbsm.headfirstbook.chapter_one.quack.Quack;


/**
 * Created by nbsm on 10-11-2016.
 */

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void performDisplay(){
        System.out.println("Looks like a Mallard");
    }
}
