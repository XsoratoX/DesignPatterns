package adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {
    private Duck duck;
    private Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        this.duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            this.duck.fly();
        }
    }
}