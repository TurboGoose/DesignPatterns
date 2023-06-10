package factory.pizza;

public abstract class Pizza {
    protected String name;

    public abstract void prepare();

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
