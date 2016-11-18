package chapter_two.WeatherData.Observer;

import chapter_two.WeatherData.Subject.Subject;

/**
 * Created by nbsm on 10-11-2016.
 */

public class CurrentConditionsDisplay implements Subject.Observer, Subject.DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: " + temperature + "F degress and" + humidity + "% humidity");
    }
}
