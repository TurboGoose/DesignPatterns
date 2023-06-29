package templatemethod;

import java.util.Scanner;

public class TeaWithHook extends BeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = askCustomer();
        return answer.startsWith("y");
    }

    private String askCustomer() {
        System.out.print("Would you like to add lemon (y/n): ");
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextLine().strip().toLowerCase();
        }
    }
}
