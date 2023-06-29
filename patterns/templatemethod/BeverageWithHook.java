package templatemethod;

public abstract class BeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring into the cup...");
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    public abstract void brew();

    public abstract void addCondiments();
}
