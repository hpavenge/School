package com.example.nbsm.headfirstdesignbook2.chapt8EncapAlgorithmsTemplatePattern;

/**
 * Created by nbsm on 23-12-2016.
 */

public class Tea extends CaffeineBevarage{

    @Override
    void brew() {
        System.out.println("Steeping in the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
