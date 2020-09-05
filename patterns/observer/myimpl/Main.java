package observer.myimpl;

import observer.myimpl.displays.CurrentConditionsDisplay;
import observer.myimpl.weather.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weather);

        weather.setMeasurements(5, 4, 3);
        weather.setMeasurements(3, 2, 1);
        weather.setMeasurements(1, 2, 3);
    }
}
