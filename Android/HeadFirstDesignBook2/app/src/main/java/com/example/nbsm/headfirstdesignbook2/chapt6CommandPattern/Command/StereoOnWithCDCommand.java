package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command;


import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.Stereo;

/**
 * Created by nbsm on 21-12-2016.
 */

public class StereoOnWithCDCommand implements Command {
    Stereo steroe;

    public StereoOnWithCDCommand(Stereo stereo){
        this.steroe = stereo;
    }
    @Override
    public void execute() {
        steroe.on();
        steroe.setCD();
        steroe.setVolume(11);
    }

    @Override
    public void undo() {
        steroe.off();
    }
}
