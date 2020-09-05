package observer.myimpl.weather;

import observer.myimpl.interfaces.Observer;
import observer.myimpl.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private final List<Observer> observers;

    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        observers  = new ArrayList<>();
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int targetIndex = observers.indexOf(o);
        if (targetIndex != -1) {
            observers.remove(targetIndex);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}
