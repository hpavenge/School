package com.example.nbsm.headfirstdesignbook2.chapt8EncapAlgorithmsTemplatePattern;

/**
 * Created by nbsm on 23-12-2016.
 */

public class Coffee extends CaffeineBevarage{

    @Override
    void brew() {
        System.out.println("Dripping coffee trough filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
