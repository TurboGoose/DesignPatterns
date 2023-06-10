package factory.store;

import factory.ingredient.factory.IngredientFactory;
import factory.ingredient.factory.NYIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

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
