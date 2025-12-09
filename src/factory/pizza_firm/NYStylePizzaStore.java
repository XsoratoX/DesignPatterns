package factory.pizza_firm;

public class NYStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new NYStyleClamPizza();
        } else if (type.equals("野菜")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}