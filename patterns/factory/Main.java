package factory;

import factory.stores.regionpizzastores.ChicagoPizzaStore;
import factory.stores.regionpizzastores.NewYorkPizzaStore;

public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

        NewYorkPizzaStore nyPizzaStore = new NewYorkPizzaStore();
        nyPizzaStore.orderPizza("pepperoni");
    }
}
