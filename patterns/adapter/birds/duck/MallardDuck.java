package adapter.birds.duck;

public class MallardDuck implements Duck {
    @Override
    public void squeak() {
        System.out.println("Squeak!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying for a long distance");
    }
}
