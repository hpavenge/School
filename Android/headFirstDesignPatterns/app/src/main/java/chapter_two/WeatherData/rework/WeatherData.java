package chapter_two.WeatherData.rework;

import java.util.Observable;

/**
 * Created by nbsm on 10-11-2016.
 */

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //here ya go observer
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
}
