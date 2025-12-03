public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + this.beverage.cost();
    }
}