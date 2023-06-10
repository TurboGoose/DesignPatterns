package newfactory.ingredient.factory;

import newfactory.ingredient.cheese.Cheese;
import newfactory.ingredient.clams.Clams;
import newfactory.ingredient.dough.Dough;
import newfactory.ingredient.sauce.Sauce;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clams createClams();
    Cheese createCheese();
    String getRegion();
}
