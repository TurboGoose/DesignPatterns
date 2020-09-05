package observer.propertychange.weather;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {
    private PropertyChangeSupport support;
    Measurements measurements;

    public WeatherData() {
        support = new PropertyChangeSupport(this);
        measurements = new Measurements(0, 0, 0);
    }

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    
    public void removeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        Measurements oldMeasurements = measurements.copy();
        measurements.setStats(temperature, humidity, pressure);
        support.firePropertyChange("measurements", oldMeasurements, measurements);
    }

    public void setTemperature(int temperature) {
        support.firePropertyChange("temperature", measurements.temperature, temperature);
        measurements.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        support.firePropertyChange("humidity", measurements.humidity, humidity);
        measurements.humidity = humidity;
    }

    public void setPressure(int pressure) {
        support.firePropertyChange("pressure", measurements.pressure, pressure);
        measurements.pressure = pressure;
    }

}
