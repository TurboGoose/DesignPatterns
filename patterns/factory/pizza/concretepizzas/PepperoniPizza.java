package factory.pizza.concretepizzas;

import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.pizza.Pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza(IngredientFactory factory) {
        super(factory);
        name = "Pepperoni pizza";
        dough = factory.createDough();
        sauce = factory.createSauce();
        toppings.add(factory.createPepperoni());
    }
}
