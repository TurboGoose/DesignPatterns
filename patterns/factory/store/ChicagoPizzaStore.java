package factory.store;

import factory.ingredient.factory.ChicagoIngredientFactory;
import factory.ingredient.factory.IngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

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
