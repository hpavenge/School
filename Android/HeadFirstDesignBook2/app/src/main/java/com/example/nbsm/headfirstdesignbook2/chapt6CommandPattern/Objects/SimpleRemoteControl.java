package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects;

import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.Command;

/**
 * Created by nbsm on 21-12-2016.
 */

public class SimpleRemoteControl {
    Command slot;

    /**
     * first a simple one a remote with one button which operates one device
     */
    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
