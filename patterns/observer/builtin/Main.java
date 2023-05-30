package observer.builtin;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(1, 2);
        weatherData.setMeasurements(3, 4);
    }
}
