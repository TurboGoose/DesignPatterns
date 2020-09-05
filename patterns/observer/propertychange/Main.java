package observer.propertychange;

import observer.propertychange.display.CurrentConditionsDisplay;
import observer.propertychange.weather.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weather);

        weather.setMeasurements(1, 2, 3);
        weather.setMeasurements(7, 8, 9);
    }
}
