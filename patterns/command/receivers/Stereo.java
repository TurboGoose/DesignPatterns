package command.receivers;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo is playing CD");
    }

    public void setDvd() {
        System.out.println("Stereo is playing DVD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is set to " + volume);
    }
}
