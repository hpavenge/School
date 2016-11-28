package com.example.nbsm.headfirstoop.chapter5.Domain;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Mandolin {

    MandolinSpec mandolinSpec;

    public Mandolin(MandolinSpec mandolinSpec){
        this.mandolinSpec = mandolinSpec;
    }

    public getMandolinSpec(){
        return mandolinSpec;
    }
}
