package com.example.nbsm.headfirstoop.Chapter10.Printer;

import com.example.nbsm.headfirstoop.Chapter10.Subway.Connection;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Created by nbsm on 9-12-2016.
 */

public class SubwayPrinter {
    private PrintStream out;

    public SubwayPrinter(OutputStream out){
        this.out = new PrintStream(out);
    }

    public void printDirections(List route){
        Connection connection = (Connection) route.get(0);
        String currentLine = connection.getLineName();
        String previousLine = currentLine;
        out.println("start at:"+connection.getStation1().getName()+".");
        out.println("Get on the:"+currentLine+"heading towards"+connection.getStation2().getName()+".");
        for (int i=1; i<route.size(); i++){
            connection = (Connection) route.get(i);
            currentLine = connection.getLineName();
            if (currentLine.equals(previousLine)){
                out.println("Continue past"+connection.getStation1().getName()+"...");
            }else{
                out.println("When you get to "+connection.getStation1().getName()+"Get off the"+previousLine+".");
                previousLine = currentLine;
            }
        }
        out.println("Get off at "+connection.getStation2().getName() + " Mission accomplished");
    }
}
