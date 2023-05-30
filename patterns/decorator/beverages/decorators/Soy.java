package decorator.beverages.decorators;

import decorator.beverages.Beverage;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + switch (getSize()) {
            case LARGE -> 0.10;
            case MEDIUM -> 0.15;
            case SMALL -> 0.20;
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
