public abstract class Beverage {
    protected enum Size {
        TALL, GRANDE, VENTI
    };

    protected Size size;
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}