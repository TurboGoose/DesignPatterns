package observer.fromutil.weather;

import java.util.Observable;

public class WeatherData extends Observable {
    private int temperature;
    private int humidity;
    private int pressure;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(new WeatherStats(temperature, humidity, pressure));
    }
}
