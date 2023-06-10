package newfactory;

import newfactory.store.ChicagoPizzaStore;
import newfactory.store.NYPizzaStore;
import newfactory.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NYPizzaStore();
        pizzaStore1.orderPizza("cheese");

        PizzaStore pizzaStore2 = new ChicagoPizzaStore();
        pizzaStore2.orderPizza("cheese");
    }
}
