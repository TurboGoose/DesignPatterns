package decorator.beverages;

import decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public int cost() {
        return switch (getSize()) {
            case BIG -> 155;
            case MEDIUM -> 105;
            case SMALL -> 55;
        };
    }
}
