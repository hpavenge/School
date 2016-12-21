package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nbsm.headfirstdesignbook2.R;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.Command;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.GarageDoorOpenCommand;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.LightOnCommand;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.MacroCommand;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Command.StereoOnWithCDCommand;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.GarageDoor;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.Light;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.RemoteController;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.SimpleRemoteControl;
import com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects.Stereo;

public class CommandPatternMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_pattern_main);
        RemoteController remoteController = new RemoteController();

        // Objects
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        Light light = new Light();

        // Commands
        GarageDoorOpenCommand garageDoorUp =
                new GarageDoorOpenCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // normally add on and off commands but lazy
        remoteController.setCommand(0, garageDoorUp, garageDoorUp);
        remoteController.setCommand(1,stereoOnWithCD,stereoOnWithCD);
        remoteController.setCommand(2,lightOnCommand, lightOnCommand);

        // TOSTRING IS FOR THIS !!!!! WEW LAD} gets called automatic
        System.out.println(remoteController);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.onButtonWasPushed(2);
        //reverse
        remoteController.undoButtonWasPushed();
        // in the rest of the controller the NoCommand is initialized check RemoteController constructor
        // this can be called a nullobject which u want if dont want the client to check for null errors

        //PARTAY MODE EXTRA VAGANZA
        // create command array
        Command[] partyOn = { garageDoorUp, stereoOnWithCD, lightOnCommand};
        // turn it into a macrocommand object
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        // add it to the remote
        remoteController.setCommand(3, partyOnMacro,partyOnMacro);
        System.out.println("--- Pushing Macro On---");
        remoteController.onButtonWasPushed(3);

        // OLD
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        GarageDoor garageDoor = new GarageDoor();
//        LightOnCommand lightOn = new LightOnCommand(light);
//        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
//
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();
//        remote.setCommand(garageOpen);
//        remote.buttonWasPressed();
    }
}
