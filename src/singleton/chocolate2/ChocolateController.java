package singleton.chocolate2;

public class ChocolateController {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}