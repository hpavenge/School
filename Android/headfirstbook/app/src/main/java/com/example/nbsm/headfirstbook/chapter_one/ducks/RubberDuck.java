package com.example.nbsm.headfirstbook.chapter_one.ducks;

import com.example.nbsm.headfirstbook.chapter_one.fly.FlyNoWay;
import com.example.nbsm.headfirstbook.chapter_one.quack.Squack;

/**
 * Created by nbsm on 10-11-2016.
 */

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void performQuack(){
        quackBehavior.Quack();
    }

    @Override
    public void performFly(){
        flyBehavior.fly();
    }

    @Override
    public void performDisplay(){
        System.out.println("Looks like a rubber ducky");
    }

}
