package factory.pizza_firm;

public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("野菜")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}