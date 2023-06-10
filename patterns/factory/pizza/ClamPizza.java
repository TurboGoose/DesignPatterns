package factory.pizza;

import factory.ingredient.factory.IngredientFactory;

public class ClamPizza extends Pizza {
    private final IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getRegion() + " clam pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Ingredients:");
        System.out.println(ingredientFactory.createDough());
        System.out.println(ingredientFactory.createSauce());
        System.out.println(ingredientFactory.createClams());
    }
}
