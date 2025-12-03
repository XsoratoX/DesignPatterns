public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    protected Size size;

    public abstract String getDescription();
}