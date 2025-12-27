package decorator.starbuzzWithSizes;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + this.beverage.cost();
    }
}