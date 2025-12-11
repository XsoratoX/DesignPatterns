package factory.pizza_firm;

public class CaliforniaPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("チーズ")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("ペパロニ")) {
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("アサリ")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("野菜")) {
            return new CaliforniaStyleVeggiePizza();
        } else {
            return null;
        }
    }
}