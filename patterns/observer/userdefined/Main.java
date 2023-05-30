package observer.userdefined;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Displayable display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1, 2);
    }
}
