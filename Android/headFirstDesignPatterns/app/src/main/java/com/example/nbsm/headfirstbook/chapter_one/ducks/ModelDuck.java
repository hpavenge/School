package com.example.nbsm.headfirstbook.chapter_one.ducks;

import com.example.nbsm.headfirstbook.chapter_one.fly.FlyNoWay;
import com.example.nbsm.headfirstbook.chapter_one.quack.Quack;

/**
 * Created by nbsm on 10-11-2016.
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
