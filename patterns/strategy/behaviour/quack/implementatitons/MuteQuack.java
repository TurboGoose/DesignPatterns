package strategy.behaviour.quack.implementatitons;

import strategy.behaviour.quack.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("* Silence *");
    }
}
