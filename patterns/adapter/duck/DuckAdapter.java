package adapter.duck;

import adapter.turkey.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
    private Duck duck;
    private Random random = new Random();

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void goble() {
        duck.squeak();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
