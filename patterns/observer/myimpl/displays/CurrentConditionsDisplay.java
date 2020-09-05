package observer.myimpl.displays;

import observer.myimpl.weather.WeatherData;
import observer.myimpl.interfaces.Observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private int temperature;
    private int humidity;
    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void displayElement() {
        System.out.println("Current state:\ntemperature: " + temperature + "\nhumidity: " + humidity + "\n");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        displayElement();
    }
}
