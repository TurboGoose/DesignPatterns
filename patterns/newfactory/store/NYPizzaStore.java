package newfactory.store;

import newfactory.pizza.NYStyleCheesePizza;
import newfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            default -> null;
        };
    }
}
