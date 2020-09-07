package factory.ingredients.ingredientfactory;

import factory.ingredients.regioningredients.Cheese;
import factory.ingredients.regioningredients.Dough;
import factory.ingredients.regioningredients.Pepperoni;
import factory.ingredients.regioningredients.Sauce;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
}
