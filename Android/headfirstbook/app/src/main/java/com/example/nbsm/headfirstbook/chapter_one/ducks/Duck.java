package com.example.nbsm.headfirstbook.chapter_one.ducks;

import com.example.nbsm.headfirstbook.chapter_one.fly.FlyBehavior;
import com.example.nbsm.headfirstbook.chapter_one.quack.QuackBehavior;

/**
 * Created by nbsm on 10-11-2016.
 */

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.Quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public String performSwim(){
        String swim = "Standard Swimming";
        return swim;
    }

    public void performDisplay(){
        System.out.println("Normal Duck");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

}
