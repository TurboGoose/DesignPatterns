package factory.pizza.concretepizzas;

import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.pizza.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza(IngredientFactory factory) {
        super(factory);
        name = "Cheese pizza";
        dough = factory.createDough();
        sauce = factory.createSauce();
        toppings.add(factory.createCheese());
    }
}
