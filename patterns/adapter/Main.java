package adapter;

import adapter.duck.Duck;
import adapter.duck.DuckAdapter;
import adapter.duck.MallardDuck;
import adapter.turkey.Turkey;
import adapter.turkey.TurkeyAdapter;
import adapter.turkey.WildTurkey;

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
