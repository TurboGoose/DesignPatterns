package decorator.beverages;

import decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public int cost() {
        return switch (getSize()) {
            case BIG -> 249;
            case MEDIUM -> 199;
            case SMALL -> 149;
        };
    }
}
