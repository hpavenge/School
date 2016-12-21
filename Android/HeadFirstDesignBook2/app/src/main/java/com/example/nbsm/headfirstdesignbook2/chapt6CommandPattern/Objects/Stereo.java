package com.example.nbsm.headfirstdesignbook2.chapt6CommandPattern.Objects;

/**
 * Created by nbsm on 21-12-2016.
 */
public class Stereo {

    public Stereo(){

    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void setCD(){
        System.out.println("Setting CD");
    }

    public void setVolume(int volume){
        System.out.println("Volume is now:"+volume);
    }

    public void off(){
        System.out.println("off bishes");
    }

}
