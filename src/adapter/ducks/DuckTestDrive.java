package adapter.ducks;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkeyの出力:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuckの出力:");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkeyAdapterの出力:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}