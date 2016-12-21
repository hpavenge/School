package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;

import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.Light;

/**
 * Created by nbsm on 21-12-2016.
 */

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
