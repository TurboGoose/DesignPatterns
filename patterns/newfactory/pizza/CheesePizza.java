package newfactory.pizza;

import newfactory.ingredient.factory.IngredientFactory;

public class CheesePizza extends Pizza {
    private final IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = ingredientFactory.getRegion() + " cheese pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Ingredients: ");
        System.out.println(ingredientFactory.createDough());
        System.out.println(ingredientFactory.createSauce());
        System.out.println(ingredientFactory.createCheese());
    }
}
