package newfactory.store;

import newfactory.ingredient.factory.ChicagoIngredientFactory;
import newfactory.ingredient.factory.IngredientFactory;
import newfactory.pizza.CheesePizza;
import newfactory.pizza.ClamPizza;
import newfactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        IngredientFactory factory = new ChicagoIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(factory);
            case "clams" -> new ClamPizza(factory);
            default -> null;
        };
    }
}
