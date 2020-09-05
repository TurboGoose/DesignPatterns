package observer.fromutil.displays;

import observer.myimpl.displays.DisplayElement;
import observer.fromutil.weather.WeatherData;
import observer.fromutil.weather.WeatherStats;

import java.util.Observable;
import java.util.Observer;

public class CurrentStateDisplay implements Observer, DisplayElement {

    private int temperature;
    private int humidity;
    private Observable observable;

    public CurrentStateDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData && arg instanceof WeatherStats) {
            WeatherData weatherData = (WeatherData) obs;
            WeatherStats weatherStats = (WeatherStats) arg;
            this.temperature = weatherStats.temperature;
            this.humidity = weatherStats.humidity;
            displayElement();
        }
    }

    @Override
    public void displayElement() {
        System.out.println("Current conditions -> temp: " + temperature + "  hum: " + humidity);
    }
}
