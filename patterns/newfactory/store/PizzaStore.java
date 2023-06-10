package newfactory.store;

import newfactory.pizza.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
