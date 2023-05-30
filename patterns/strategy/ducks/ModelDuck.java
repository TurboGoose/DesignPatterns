package strategy.ducks;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quack.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
