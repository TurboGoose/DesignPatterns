package newfactory.store;

import newfactory.pizza.ChicagoStyleCheesePizza;
import newfactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            default -> null;
        };
    }
}
