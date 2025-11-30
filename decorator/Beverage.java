public class Beverage {
    protected String description = "Unknown Beverage";
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;
    private double milkCost = 1;
    private double soyCost = 0.5;
    private double mochaCost = 1.5;
    private double whipCost = 2;

    public Beverage() {
        this.milk = false;
        this.soy = false;
        this.mocha = false;
        this.whip = false;
    }

    public String getDescription() {
        return this.description;
    }

    public double cost() {
        float condimentCost = 0;
        if (hasMilk()) {
            condimentCost += this.milkCost;
        }
        if (hasSoy()) {
            condimentCost += this.soyCost;
        }
        if (hasMocha()) {
            condimentCost += this.mochaCost;
        }
        if (hasWhip()) {
            condimentCost += this.whipCost;
        }
        return condimentCost;
    }

    public boolean hasMilk() {
        return this.milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return this.soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return this.mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return this.whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}