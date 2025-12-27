public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + this.beverage.cost(); // .10 means 0.10.
    }
}