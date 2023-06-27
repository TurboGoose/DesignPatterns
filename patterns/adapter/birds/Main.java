package adapter.birds;

import adapter.birds.duck.Duck;
import adapter.birds.duck.DuckAdapter;
import adapter.birds.duck.MallardDuck;
import adapter.birds.turkey.Turkey;
import adapter.birds.turkey.TurkeyAdapter;
import adapter.birds.turkey.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new MallardDuck();

        testTurkey(turkey);
        testDuck(duck);

        testDuck(new TurkeyAdapter(turkey));
        testTurkey(new DuckAdapter(duck));
    }

    private static void testDuck(Duck duck) {
        System.out.println("--- Duck ---");
        duck.squeak();
        duck.fly();
        System.out.println();
    }

    private static void testTurkey(Turkey turkey) {
        System.out.println("--- Turkey ---");
        turkey.goble();
        turkey.fly();
        System.out.println();
    }
}
