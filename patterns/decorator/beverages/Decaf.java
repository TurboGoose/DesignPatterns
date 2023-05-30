package decorator.beverages;

public class Decaf extends Beverage {
    public Decaf(Size size) {
        this.size = size;
        description = size.name() + " Decaf";
    }

    @Override
    public double cost() {
        return switch (size) {
            case LARGE -> 1.25;
            case MEDIUM -> 1.05;
            case SMALL -> 0.85;
        };
    }
}
