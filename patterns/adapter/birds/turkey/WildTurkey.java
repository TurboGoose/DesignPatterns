package adapter.birds.turkey;

public class WildTurkey implements Turkey {
    @Override
    public void goble() {
        System.out.println("Goble!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying for a short distance");
    }
}
