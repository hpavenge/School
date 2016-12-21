package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern;

/**
 * Created by nbsm on 21-12-2016.
 */

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
