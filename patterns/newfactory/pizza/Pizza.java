package newfactory.pizza;

import java.util.LinkedList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new LinkedList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough);
        System.out.println("Adding " + sauce);
        System.out.println("Adding toppings:");
        toppings.forEach(t -> System.out.println("- " + t));
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
