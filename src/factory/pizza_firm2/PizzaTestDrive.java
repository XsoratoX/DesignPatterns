package factory.pizza_firm2;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("チーズ");
        System.out.println("イーサンは\n" + pizza + "をオーダー\n");

        pizza = chicagoStore.orderPizza("チーズ");
        System.out.println("ジョエルは\n" + pizza + "をオーダー\n");

        pizza = nyStore.orderPizza("アサリ");
        System.out.println("イーサンは\n" + pizza + "をオーダー\n");

        pizza = chicagoStore.orderPizza("アサリ");
        System.out.println("ジョエルは\n" + pizza + "をオーダー\n");

        pizza = nyStore.orderPizza("ペパロニ");
        System.out.println("イーサンは\n" + pizza + "をオーダー\n");

        pizza = chicagoStore.orderPizza("ペパロニ");
        System.out.println("ジョエルは\n" + pizza + "をオーダー\n");

        pizza = nyStore.orderPizza("野菜");
        System.out.println("イーサンは\n" + pizza + "をオーダー\n");

        pizza = chicagoStore.orderPizza("野菜");
        System.out.println("ジョエルは\n" + pizza + "をオーダー\n");
    }
}