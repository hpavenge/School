package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;

/**
 * Created by nbsm on 21-12-2016.
 */

public interface Command {

    public void execute();

    /**
     * When commands support undo, they have an undo() method that mirrors the execute()
     method. Whatever execute() last did, undo() reverses. So, before we can add undo to our
     commands, we need to add an undo() method to the Command interface:
     this example lightoncommand has it
     */

    public void undo();

    /**
     * For logging what the user does u would add 2 commands
     * store()
     * load()
     */
}
