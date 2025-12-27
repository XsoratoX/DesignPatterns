package decorator.starbuzzWithSizes;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    public double cost() {
        return .89; // .89 means 0.89.
    }
}