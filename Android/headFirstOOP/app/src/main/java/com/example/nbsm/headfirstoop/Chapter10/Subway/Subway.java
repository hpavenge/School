package com.example.nbsm.headfirstoop.Chapter10.Subway;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nbsm on 9-12-2016.
 */

public class Subway {
    private List stations;
    private List connections;

    /**
     * Not putting stations and connections in the constructor
     * It should handle this itself
     */
    public Subway(){
        this.stations = new LinkedList();
        this.connections = new LinkedList();
    }

    /**
     * Using a string instead of Station object because easyer to program against
     * Also only expose clients of your code to the classed they need to interact with
     * @param stationName
     */
    public void addStation(String stationName){
        // first validate
        if (!this.hasStation(stationName)){
            Station station = new Station(stationName);
            stations.add(station);
        }
    }

    /**
     * Function which checks if the subway contains the station
     * @param stationName the name of the station
     * @return
     */
    public boolean hasStation(String stationName){
        // THIS LINE!
        return stations.contains(new Station(stationName));
//        for (Object object: stations){
//            if (object instanceof Station){
//                Station station = (Station) object;
//                if (station.getName().equalsIgnoreCase(name)){
//                    return true;
//                }
//                return false;
//            }
//            return false;
//        }
//        return false;
    }

    /**
     * Function that adds a connection to the subway
     * @param lineName the name of the line
     * @param station1Name the first station (start,end -> can go both ways)
     * @param station2Name the second station (start,end -> can go both ways)
     */
    public void addConnection(String lineName, String station1Name, String station2Name){
        // AGAIN validate it (both stations should exist if u want to create a connection
        if (this.hasStation(station1Name) && this.hasStation(station2Name)){
            Station station1 = new Station(station1Name);
            Station station2 = new Station(station2Name);
            Connection connection = new Connection(lineName,station1,station2);
            connections.add(connection);
        }
        else{
            throw new NullPointerException("Connection cannot be established since there are no stations");
        }
    }
}
