package command.receivers;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public CeilingFan() {
        this.speed = OFF;
    }

    public void high() {
        System.out.println("Set fan speed to HIGH");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("Set fan speed to MEDIUM");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("Set fan speed to LOW");
        speed = LOW;
    }

    public void off() {
        System.out.println("Fan is OFF");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
