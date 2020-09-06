package decorator.condiments.decorators;

import decorator.Beverage;
import decorator.condiments.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
        description = "soy";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

    @Override
    public int cost() {
        int cost = beverage.cost();
        switch (getSize()) {
            case BIG -> cost += 20;
            case MEDIUM -> cost += 15;
            case SMALL -> cost += 10;
        }
        return cost;
    }
}
