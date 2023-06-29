package templatemethod;

public class Main {
    public static void main(String[] args) {
        BeverageWithHook tea = new TeaWithHook();
        BeverageWithHook coffee = new CoffeeWithHook();

        System.out.println(">>> Preparing tea");
        tea.prepareRecipe();

        System.out.println(">>> Preparing coffee");
        coffee.prepareRecipe();
    }
}
