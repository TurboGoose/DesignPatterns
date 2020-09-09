package command.noundo.receivers;

public class Stereo {
    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo is playing CD");
    }

    public void setVolume(int volume) {
        if (volume < 0)
            this.volume = 0;
        else if (volume > 100)
            this.volume = 100;
        else
            this.volume = volume;
        System.out.println("Stereo volume is " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
