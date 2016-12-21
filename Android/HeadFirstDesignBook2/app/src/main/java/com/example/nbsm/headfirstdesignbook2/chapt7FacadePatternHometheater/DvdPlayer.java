package com.example.nbsm.headfirstdesignbook2.chapt7FacadePatternHometheater;

/**
 * Created by nbsm on 21-12-2016.
 */
public interface DvdPlayer {
    void on();

    void play(String movie);

    void stop();

    void eject();

    void off();
}
