package factory.ingredients.ingredientfactory.regioningredientfacrory;

import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.ingredients.regioningredients.Cheese;
import factory.ingredients.regioningredients.Dough;
import factory.ingredients.regioningredients.Pepperoni;
import factory.ingredients.regioningredients.Sauce;
import factory.ingredients.regioningredients.chicagoingredients.ChicagoCheese;
import factory.ingredients.regioningredients.chicagoingredients.ChicagoDough;
import factory.ingredients.regioningredients.chicagoingredients.ChicagoPepperoni;
import factory.ingredients.regioningredients.chicagoingredients.ChicagoSauce;

public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }
}
