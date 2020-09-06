package decorator.condiments.decorators;

import decorator.Beverage;
import decorator.condiments.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
        description = "mocha";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public int cost() {
        int cost = beverage.cost();
        switch (getSize()) {
            case BIG -> cost += 25;
            case MEDIUM -> cost += 20;
            case SMALL -> cost += 15;
        }
        return cost;
    }
}
