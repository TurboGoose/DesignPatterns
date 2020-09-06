package decorator.condiments;

import decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Beverage.Size getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(Beverage.Size size) {
        beverage.setSize(size);
    }

    public abstract String getDescription();
}
