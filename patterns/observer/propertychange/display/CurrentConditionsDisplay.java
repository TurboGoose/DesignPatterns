package observer.propertychange.display;

import observer.myimpl.displays.DisplayElement;
import observer.propertychange.weather.Measurements;
import observer.propertychange.weather.WeatherData;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement {
    private int temperature;
    private int humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.addListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        switch (propertyName) {
            case "temperature" -> temperature = (int) evt.getNewValue();
            case "humidity" -> humidity = (int) evt.getNewValue();
            case "measurements" -> {
                Measurements measurements = (Measurements) evt.getNewValue();
                temperature = measurements.temperature;
                humidity = measurements.humidity;
            }
        }
        displayElement();
    }

    @Override
    public void displayElement() {
        System.out.println("Current conditions -> temp: " + temperature + "  hum: " + humidity);
    }
}
