package com.example.nbsm.headfirstoop.Chapter10.Subway;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by nbsm on 9-12-2016.
 */

public class Subway {
    private List stations;
    private List connections;
    private Map network; // subway network

    /**
     * Not putting stations and connections in the constructor
     * It should handle this itself
     */
    public Subway(){
        this.stations = new LinkedList();
        this.connections = new LinkedList();
        this.network = new HashMap();
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
        return stations.contains(new Station(stationName));
    }

    /**
     * Function which checks if the subway contains this connection
     * @param lineName
     * @param station1Name
     * @param station2Name
     * @return true or false
     */
    public boolean hasConnection(String lineName, String station1Name, String station2Name){
        Station station1 = new Station(station1Name);
        Station station2 = new Station(station2Name);
        for (Iterator i = connections.iterator(); i.hasNext();){
            Connection connection = (Connection) i.next();
            if (connection.getLineName().equalsIgnoreCase(lineName)){
                if (connection.getStation1().equals(station1) && connection.getStation2().equals(station2)){
                    return true;
                }
            }
        }
        return false;
//        System.out.println("searching for Connection:"+ lineName+ "with station1:"+station1Name+"with station2:"+station2Name);
//        return connections.contains(new Connection(lineName,station1,station2)); // FAILS ??????????????
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
            // every connection should be added to the subway network
            addToNetwork(station1,station2);
            addToNetwork(station2,station1);
        }
        else{
            throw new NullPointerException("Invaled connection!");
        }
    }

    public void addToNetwork(Station station1, Station station2){
        if (network.keySet().contains(station1)){
            List connectingStations = (List) network.get(station1);
            if (!connectingStations.contains(station2)){
                connectingStations.add(station2);
            }
        }
        else{
            List connectingStations = new LinkedList();
            connectingStations.add(station2);
            network.put(station1,connectingStations);
        }
    }

    public List getDirections(String startStationName, String endStationName){
        if (!this.hasStation(startStationName) || !this.hasStation(endStationName)){
            throw new NullPointerException("Stations do not exist in this subway");
        }

        Station start = new Station(startStationName);
        Station end = new Station(endStationName);
        List route = new LinkedList();
        List reachableStations = new LinkedList();
        Map previousStations = new HashMap();

        List neighbors = (List) network.get(start);
        for (Iterator i = neighbors.iterator(); i.hasNext();){
            Station station = (Station) i.next();
            if (station.equals(end)){
                route.add(getConnection(start,end));
                return route;
            }
            else{
                reachableStations.add(station);
                previousStations.put(station,start);
            }
        }

        List nextStations = new LinkedList();
        nextStations.addAll(neighbors);
        Station currentStation = start;

        searchLoop:
        for (int i= 1; i<stations.size(); i++){
            List tmpNextStations = new LinkedList();
            for (Iterator j = nextStations.iterator(); j.hasNext();){
                Station station = (Station) j.next();
                reachableStations.add(station);
                currentStation = station;
                List currentNeighbors = (List) network.get(currentStation);
                for (Iterator k = currentNeighbors.iterator(); k.hasNext();){
                    Station neighbor = (Station) k.next();
                    if (neighbor.equals(end)){
                        reachableStations.add(neighbor);
                        previousStations.put(neighbor,currentStation);
                        break searchLoop;
                    }
                    else if(!reachableStations.contains(neighbor)){
                        reachableStations.add(neighbor);
                        tmpNextStations.add(neighbor);
                        previousStations.put(neighbor,currentStation);
                    }
                }
            }
            nextStations = tmpNextStations;
        }
        //found path
        boolean keepLooping = true;
        Station keyStation = end;
        Station station;

        while(keepLooping){
            station = (Station)previousStations.get(keyStation);
            route.add(0,getConnection(station,keyStation));
            if (start.equals(station)){
                keepLooping = false;
            }
            keyStation = station;
        }
        return route;
    }

    /**
     * utility method that takes two statins, and looks for a connection between them (on any line)
     * @param station1
     * @param station2
     * @return
     */
    private Connection getConnection(Station station1, Station station2){
        for (Iterator i = connections.iterator(); i.hasNext();){
            Connection connection = (Connection) i.next();
            Station one = connection.getStation1();
            Station two = connection.getStation2();
            if (station1.equals(one) && station2.equals(two)){
                return connection;
            }
        }
        return null;
    }
}
