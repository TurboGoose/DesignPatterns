package strategy.main;

import strategy.behaviour.fly.imlementations.FlyWithRocket;
import strategy.behaviour.quack.implementatitons.Squeak;
import strategy.ducks.Duck;
import strategy.ducks.kinds.DecoyDuck;
import strategy.ducks.kinds.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        showDuck(duck);

        duck.setFlyBehaviour(new FlyWithRocket());
        showDuck(duck);

        duck = new DecoyDuck();
        showDuck(duck);

        duck.setQuackBehaviour(new Squeak());
        showDuck(duck);
    }

    private static void showDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println();
    }
}
