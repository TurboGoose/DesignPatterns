package newfactory.store;

import newfactory.ingredient.factory.IngredientFactory;
import newfactory.ingredient.factory.NYIngredientFactory;
import newfactory.pizza.CheesePizza;
import newfactory.pizza.ClamPizza;
import newfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        IngredientFactory factory = new NYIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(factory);
            case "clams" -> new ClamPizza(factory);
            default -> null;
        };
    }
}
