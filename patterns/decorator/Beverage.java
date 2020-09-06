package decorator;

public abstract class Beverage {
    public enum Size {SMALL, MEDIUM, BIG}

    private Size size = Size.MEDIUM;
    protected String description = "Unknown beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return size.name() + " " + description;
    }

    public abstract int cost();

}
