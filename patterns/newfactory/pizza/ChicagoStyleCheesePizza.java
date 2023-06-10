package newfactory.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago cheese pizza";
        dough = "Extra thickkk dough";
        sauce = "Tomato sauce";
        toppings.add("Pizzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cut into square slices");
    }
}
