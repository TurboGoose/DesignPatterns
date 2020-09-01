package strategy.behaviour.fly.imlementations;

import strategy.behaviour.fly.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with my wings!");
    }
}
