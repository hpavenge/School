package com.example.nbsm.headfirstdesignbook2.chapt7FacadePatternHometheater;

/**
 * Created by nbsm on 21-12-2016.
 */
public interface Amplifier {
    void on();

    void setDvd(DvdPlayer dvd);

    void setSurroundSound();

    void setVolume(int i);

    void off();
}
