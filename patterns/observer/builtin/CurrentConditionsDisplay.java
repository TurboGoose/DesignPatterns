package observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Displayable {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData wd) {
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
        }
        display();
    }


    @Override
    public void display() {
        System.out.printf("Current conditions: temp = %f C, hum = %f%n", temperature, humidity);
    }
}
