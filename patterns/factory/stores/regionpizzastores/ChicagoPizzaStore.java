package factory.stores.regionpizzastores;

import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.ingredients.ingredientfactory.regioningredientfacrory.ChicagoIngredientFactory;
import factory.pizza.Pizza;
import factory.pizza.concretepizzas.CheesePizza;
import factory.pizza.concretepizzas.PepperoniPizza;
import factory.stores.PizzaStore;

public class ChicagoPizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        IngredientFactory factory = new ChicagoIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(factory);
            case "pepperoni" -> new PepperoniPizza(factory);
            default -> null;
        };
    }
}
