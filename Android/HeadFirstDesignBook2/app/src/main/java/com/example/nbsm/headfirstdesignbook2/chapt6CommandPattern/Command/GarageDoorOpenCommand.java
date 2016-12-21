package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;

import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.GarageDoor;

/**
 * Created by nbsm on 21-12-2016.
 */

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
