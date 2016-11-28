package com.example.nbsm.headfirstoop.chapter5.Domain;

/**
 * Created by nbsm on 24-11-2016.
 */

public class Instrument {
    private String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price){
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
