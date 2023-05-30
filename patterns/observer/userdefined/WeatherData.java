package observer.userdefined;

import java.util.LinkedList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers = new LinkedList<>();
    private float temperature;
    private float humidity;


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

}
