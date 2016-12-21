package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;

/**
 * Created by nbsm on 21-12-2016.
 */

public class MacroCommand implements Command {
    Command[] commands;

    /**
     * EVERY remote needs a partay mode
     * @param commands
     */
    public MacroCommand (Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands){
            command.undo();
        }
    }
}
