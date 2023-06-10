package newfactory.ingredient.factory;

import newfactory.ingredient.cheese.Cheese;
import newfactory.ingredient.cheese.PizzarellaCheese;
import newfactory.ingredient.clams.Clams;
import newfactory.ingredient.clams.FreshClams;
import newfactory.ingredient.clams.FrozenClams;
import newfactory.ingredient.dough.Dough;
import newfactory.ingredient.dough.ThinDough;
import newfactory.ingredient.sauce.MarinaraSauce;
import newfactory.ingredient.sauce.Sauce;

public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        return new PizzarellaCheese();
    }

    @Override
    public String getRegion() {
        return "New York";
    }
}
