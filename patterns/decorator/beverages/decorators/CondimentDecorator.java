package decorator.beverages.decorators;

import decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract Beverage.Size getSize();
}
