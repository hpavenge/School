package com.example.nbsm.headfirstdesignbook2.chapt8EncapAlgorithmsTemplatePattern;

/**
 * Created by nbsm on 23-12-2016.
 */

public abstract class CaffeineBevarage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    abstract void brew();

    abstract void addCondiments();

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
