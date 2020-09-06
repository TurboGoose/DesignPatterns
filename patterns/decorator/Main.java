package decorator;

import decorator.beverages.HouseBlend;
import decorator.condiments.decorators.Milk;
import decorator.condiments.decorators.Mocha;
import decorator.condiments.decorators.Soy;

public class Main {
    public static void main(String[] args) {
        Beverage smallLatte = new Milk(new Mocha(new Mocha(new Soy(new HouseBlend()))));
        smallLatte.setSize(Beverage.Size.SMALL);

        Beverage mediumLatte = new Milk(new Mocha(new Mocha(new Soy(new HouseBlend()))));

        Beverage bigLatte = new Milk(new Mocha(new Mocha(new Soy(new HouseBlend()))));
        bigLatte.setSize(Beverage.Size.BIG);

        showFullDescription(smallLatte);
        showFullDescription(mediumLatte);
        showFullDescription(bigLatte);
    }

    private static void showFullDescription(Beverage beverage) {
        System.out.println(beverage.getDescription() + " ==> " + beverage.cost() / 100d + "$");
    }
}
