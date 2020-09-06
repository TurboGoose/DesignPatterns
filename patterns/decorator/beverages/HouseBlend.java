package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public int cost() {
        return switch (getSize()) {
            case BIG -> 139;
            case MEDIUM -> 89;
            case SMALL -> 39;
        };
    }
}
