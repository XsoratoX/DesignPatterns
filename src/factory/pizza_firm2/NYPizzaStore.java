package factory.pizza_firm2;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("チーズ")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルチーズピザ");
        } else if (item.equals("野菜")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイル野菜ピザ");
        } else if (item.equals("アサリ")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルアサリピザ");
        } else if (item.equals("ペパロニ")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルペパロニピザ");
        }
        return pizza;
    }
}