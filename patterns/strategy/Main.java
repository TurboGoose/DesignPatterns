package strategy;

import strategy.behavior.fly.FlyWithRocket;
import strategy.ducks.Duck;
import strategy.ducks.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.quack();
        duck.fly();
        duck.setFlyBehavior(new FlyWithRocket());
        duck.fly();
    }
}
