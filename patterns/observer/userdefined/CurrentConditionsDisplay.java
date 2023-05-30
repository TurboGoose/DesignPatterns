package observer.userdefined;

public class CurrentConditionsDisplay implements Displayable, Observer {
    private Subject weatherDataSource;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherDataSource) {
        this.weatherDataSource = weatherDataSource;
        weatherDataSource.register(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: temp = %f C, hum = %f%n", temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
