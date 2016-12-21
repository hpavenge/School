package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;

import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.Light;

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

    @Override
    public void undo() {
        // so simple wew lad
        light.off();
    }


}
