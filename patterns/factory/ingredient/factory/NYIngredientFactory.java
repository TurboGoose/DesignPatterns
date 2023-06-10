package factory.ingredient.factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.PizzarellaCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FreshClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThinDough;
import factory.ingredient.sauce.MarinaraSauce;
import factory.ingredient.sauce.Sauce;

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
