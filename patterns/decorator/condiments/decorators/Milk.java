package decorator.condiments.decorators;

import decorator.Beverage;
import decorator.condiments.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
        description = "milk";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public int cost() {
        int cost = beverage.cost();
        switch (getSize()) {
            case BIG -> cost += 15;
            case MEDIUM -> cost += 10;
            case SMALL -> cost += 5;
        }
        return cost;
    }
}
