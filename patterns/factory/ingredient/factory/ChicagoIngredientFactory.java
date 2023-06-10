package factory.ingredient.factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.ParmesanCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FrozenClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThickDough;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.sauce.TomatoSauce;

public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public String getRegion() {
        return "Chicago";
    }
}
