package factory.ingredients.ingredientfactory.regioningredientfacrory;

import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.ingredients.regioningredients.Cheese;
import factory.ingredients.regioningredients.Dough;
import factory.ingredients.regioningredients.Pepperoni;
import factory.ingredients.regioningredients.Sauce;
import factory.ingredients.regioningredients.newyorkingredients.NewYorkCheese;
import factory.ingredients.regioningredients.newyorkingredients.NewYorkDough;
import factory.ingredients.regioningredients.newyorkingredients.NewYorkPepperoni;
import factory.ingredients.regioningredients.newyorkingredients.NewYorkSauce;

public class NewYorkIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new NewYorkDough();
    }

    @Override
    public Sauce createSauce() {
        return new NewYorkSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NewYorkCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NewYorkPepperoni();
    }
}
