package decorator.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size) {
        this.size = size;
        description = size.name() + " House Blend";
    }

    @Override
    public double cost() {

        return switch (size) {
            case LARGE -> 1.09;
            case MEDIUM -> 0.89;
            case SMALL -> 0.69;
        };
    }
}
