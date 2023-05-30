package strategy.ducks;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quack.QuackBehavior;

abstract public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract public void display();

    public void swim() {
        System.out.println("I'm swimming!");
    }
}
