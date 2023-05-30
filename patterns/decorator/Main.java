package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.Decaf;
import decorator.beverages.decorators.Mocha;
import decorator.beverages.decorators.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Decaf(Beverage.Size.LARGE);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
