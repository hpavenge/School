package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects;

import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.Command;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.NoCommand;

/**
 * Created by nbsm on 21-12-2016.
 */

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController(){
        // only 7 options
        onCommands = new Command[7];
        offCommands = new Command[7];

        // not sure if this is stil needed in these days
        // but this is for instatiating and initializing the arrays (think its oldschool)
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        // start with nocommand for null error
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }


    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("");
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
