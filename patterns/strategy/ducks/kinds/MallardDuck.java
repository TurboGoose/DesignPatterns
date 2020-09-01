package strategy.ducks.kinds;

import strategy.behaviour.fly.imlementations.FlyWithWings;
import strategy.behaviour.quack.implementatitons.Quack;
import strategy.ducks.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
