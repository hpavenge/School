package com.example.nbsm.headfirstoop.Chapter10.Loader;

import com.example.nbsm.headfirstoop.Chapter10.Subway.Connection;
import com.example.nbsm.headfirstoop.Chapter10.Subway.Subway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by nbsm on 9-12-2016.
 */

public class SubwayLoader {
    Subway subway;

    /**
     * The Loader which creates subways from input(s)
     */
    public SubwayLoader(){
        this.subway = new Subway();
    }

    /**
     * Loads the subway from a file
     * @param inputStream the stream given as input
     * @return the subway created from the file
     * @throws IOException we are using a FileReader
     */
    public Subway loadFromStream(InputStream inputStream) throws IOException{
        // read file
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        // add stations
        loadStations(subway, reader);
        // add lines and connections
        String lineName = reader.readLine();
        while(lineName != null && lineName.length() > 0){
            loadLine(subway,reader,lineName);
            lineName = reader.readLine();
        }
        return subway;
    }

    /**
     * methods which loads in stations by reading a line in the file
     * putting that line into the subway as a new station
     * stopping when hitting a blank line (0)
     * @param subway the current subway on which it adds the stations from the file
     * @param reader the filereader
     * @throws IOException When something goes wrong trow a Exception
     */
    public void loadStations(Subway subway, BufferedReader reader)throws IOException{
        String currentLine;
        currentLine = reader.readLine();
        while(currentLine.length() > 0){
            subway.addStation(currentLine);
            currentLine = reader.readLine();
        }
    }

    /**
     * Function which adds a line(multiple connections between two stations) to the subway
     * Since they have to keep linking while reading we set station1Name =  station2Name
     * and move on to the next line which contains the next station.
     * @param subway the subway which is gonna contain all stations + lines
     * @param reader the reader which reads the file
     * @param lineName the name of the line
     * @throws IOException
     */
    public void loadLine(Subway subway, BufferedReader reader, String lineName) throws IOException{
        String station1Name, station2Name;
        station1Name = reader.readLine();
        station2Name = reader.readLine();
        while(station2Name != null && station2Name.length() > 0){
            subway.addConnection(lineName,station1Name,station2Name);
            System.out.println("added = Line:"+lineName+"station1:"+station1Name+"station2:"+station2Name+"\n");
            station1Name = station2Name;
            station2Name = reader.readLine();
        }
    }
}
