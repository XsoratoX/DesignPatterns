package factory.pizza_firm;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("チーズ");
        System.out.println("イーサンの注文は" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("チーズ");
        System.out.println("ジョエルの注文は" + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("チーズ");
        System.out.println("マイクの注文は" + pizza.getName() + "\n");
    }
}