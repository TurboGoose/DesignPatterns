package factory.pizza;

import factory.ingredients.Ingredient;
import factory.ingredients.ingredientfactory.IngredientFactory;
import factory.ingredients.regioningredients.Dough;
import factory.ingredients.regioningredients.Sauce;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected List<Ingredient> toppings = new ArrayList<>();
    protected IngredientFactory factory;

    public Pizza(IngredientFactory factory) {
        this.factory = factory;
    }

    public void prepare() {
        System.out.println(">>> Preparing " + name + ":");
        System.out.println("> Tossing " + dough.description());
        System.out.println("> Adding " + sauce.description());
        System.out.print("> Adding toppings : ");
        for (Ingredient topping : toppings)
            System.out.print(topping.description() + ", ");
        System.out.println();

    }

    public void bake() {
        System.out.println(">> Bake for 25 minutes at 350 C");
    }

    public void cut() {
        System.out.println(">> Cutting pizza");
    }

    public void box() {
        System.out.println(">> Put pizza in box\n");
    }

    public String getName() {
        return name;
    }
}
