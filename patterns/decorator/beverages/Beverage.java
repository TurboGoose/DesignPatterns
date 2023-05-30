package decorator.beverages;

public abstract class Beverage {
    public enum Size {SMALL, MEDIUM, LARGE}
    protected String description = "Unknown beverage";
    protected Size size;


    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
