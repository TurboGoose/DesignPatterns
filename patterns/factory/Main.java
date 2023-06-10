package factory;

import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        new NYPizzaStore().orderPizza("cheese");
        System.out.println("---");

        new NYPizzaStore().orderPizza("clams");
        System.out.println("---");

        new ChicagoPizzaStore().orderPizza("cheese");
        System.out.println("---");

        new ChicagoPizzaStore().orderPizza("clams");
    }
}
