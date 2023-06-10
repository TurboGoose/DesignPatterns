package newfactory.ingredient.factory;

import newfactory.ingredient.cheese.Cheese;
import newfactory.ingredient.cheese.ParmesanCheese;
import newfactory.ingredient.clams.Clams;
import newfactory.ingredient.clams.FrozenClams;
import newfactory.ingredient.dough.Dough;
import newfactory.ingredient.dough.ThickDough;
import newfactory.ingredient.sauce.Sauce;
import newfactory.ingredient.sauce.TomatoSauce;

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
