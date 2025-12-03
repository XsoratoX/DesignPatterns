public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + this.beverage.cost(); // .15 means 0.15.
    }
}