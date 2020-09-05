package observer.fromutil;

import observer.fromutil.displays.CurrentStateDisplay;
import observer.fromutil.weather.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        CurrentStateDisplay display = new CurrentStateDisplay(weather);

        weather.setMeasurements(1, 2, 3);
        weather.setMeasurements(3, 2, 1);
    }
}
