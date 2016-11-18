package chapter_two.WeatherData.Subject;

/**
 * Created by nbsm on 10-11-2016.
 */

public interface Subject {;
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

    public interface Observer {
        public void update(float temp, float humidity, float pressure);
    }

    public interface DisplayElement{
        public void display();
    }
}
