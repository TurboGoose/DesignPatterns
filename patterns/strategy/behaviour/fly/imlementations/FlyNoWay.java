package strategy.behaviour.fly.imlementations;

import strategy.behaviour.fly.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
