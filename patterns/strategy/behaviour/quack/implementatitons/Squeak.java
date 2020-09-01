package strategy.behaviour.quack.implementatitons;

import strategy.behaviour.quack.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("SQUEAK!!!");
    }
}
