package strategy.behaviour.fly.imlementations;

import strategy.behaviour.fly.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
