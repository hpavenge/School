package com.example.nbsm.headfirstdesignbook2.chapt7AdapterPattern;

/**
 * Created by nbsm on 21-12-2016.
 */

public class WildTurkey implements Turkey {
    public void gobble(){
        System.out.println("Gobble gobble");
    }
    public void fly(){
        System.out.println("I fly but shortly");
    }
}
