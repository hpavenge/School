package com.example.nbsm.headfirstoop.Chapter10.Subway;

/**
 * Created by nbsm on 9-12-2016.
 */

public class Station {
    String name;

    /**
     * A station
     * @param name the name of a station
     */
    public Station(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * checks if the given object equals the station
     * @param object
     * @return
     */
    public boolean equals(Object object){
        if (object instanceof Station){
            Station otherStation = (Station) object;
            // this line makes sure AJAX equals the same as ajax
            if (otherStation.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    /**
     * this is neede to make sure equals in java works decently
     * normally .equals would return false since they are two different instances
     * @return
     */
    public int hashCode(){
        return name.toLowerCase().hashCode();
    }
}
