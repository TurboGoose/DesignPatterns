package templatemethod;

public class CoffeeWithHook extends BeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }
}
