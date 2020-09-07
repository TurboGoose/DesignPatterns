package factory.stores;

import factory.pizza.Pizza;

public interface PizzaStore {
    default void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    Pizza createPizza(String type);
}
