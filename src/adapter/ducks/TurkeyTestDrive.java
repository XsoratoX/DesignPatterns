package adapter.ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("Duckの出力:");
        duck.quack();
        duck.fly();

        System.out.println("\nTurkeyの出力:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuckAdapterの出力:");
        duckAdapter.gobble();
        duckAdapter.fly();
    }

}