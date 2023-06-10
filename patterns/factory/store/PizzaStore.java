package factory.store;

import factory.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
