package observer.propertychange.weather;

public class Measurements {
    public int temperature;
    public int humidity;
    public int pressure;

    public Measurements(int temperature, int humidity, int pressure) {
        setStats(temperature, humidity, pressure);
    }

    public void setStats(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public Measurements copy() {
        return new Measurements(temperature, humidity, pressure);
    }
}
