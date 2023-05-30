package decorator.beverages.decorators;

import decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + switch (getSize()) {
            case LARGE -> 0.30;
            case MEDIUM -> 0.20;
            case SMALL -> 0.10;
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
