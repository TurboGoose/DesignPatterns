package command.undo.receivers;

public class CeilFan {
    public enum Speed {HIGH, MEDIUM, LOW, OFF}
    private Speed fanSpeed;

    public CeilFan() {
        fanSpeed = Speed.OFF;
    }

    public Speed getFanSpeed() {
        return fanSpeed;
    }

    public void off() {
        fanSpeed = Speed.OFF;
        System.out.println("Fan is off");
    }

    public void low() {
        fanSpeed = Speed.LOW;
        System.out.println("Fan speed is low");
    }

    public void medium() {
        fanSpeed = Speed.MEDIUM;
        System.out.println("Fan speed is medium");
    }

    public void high() {
        fanSpeed = Speed.HIGH;
        System.out.println("Fan speed is high");
    }
}
