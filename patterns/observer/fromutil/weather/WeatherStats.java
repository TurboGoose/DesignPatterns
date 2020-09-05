package observer.fromutil.weather;

public class WeatherStats {
    public int temperature;
    public int humidity;
    public int pressure;

    public WeatherStats(int temperature, int humidity, int pressure) {
        setStats(temperature, humidity, pressure);
    }

    public void setStats(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
