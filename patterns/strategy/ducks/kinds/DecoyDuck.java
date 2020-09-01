package strategy.ducks.kinds;

import strategy.behaviour.fly.imlementations.FlyNoWay;
import strategy.behaviour.quack.implementatitons.MuteQuack;
import strategy.ducks.Duck;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
