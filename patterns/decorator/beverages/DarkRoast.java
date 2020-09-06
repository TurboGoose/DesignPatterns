package decorator.beverages;

import decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast coffee";
    }

    @Override
    public int cost() {
        return switch (getSize()) {
            case BIG -> 149;
            case MEDIUM -> 99;
            case SMALL -> 49;
        };
    }
}
