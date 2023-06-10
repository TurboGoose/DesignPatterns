package factory.ingredient.factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.sauce.Sauce;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clams createClams();
    Cheese createCheese();
    String getRegion();
}
