public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return 1.99 + super.cost();
    }
}