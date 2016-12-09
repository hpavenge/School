package com.example.nbsm.headfirstoop.Chapter10.Subway;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nbsm on 9-12-2016.
 */

public class Connection {
    private Station station1, station2;
    private String lineName;

    /**
     * a connection between two stations
     * @param lineName the name of the line between the stations
     * @param station1 the name of the first station
     * @param station2 the name of the second station
     */
    public Connection(String lineName, Station station1, Station station2){
        this.lineName = lineName;
        this.station1 = station1;
        this.station2 = station2;
    }

    public Station getStation1(){
        return station1;
    }

    public Station getStation2(){
        return station2;
    }

    public String getLineName() {
        return lineName;
    }
}
