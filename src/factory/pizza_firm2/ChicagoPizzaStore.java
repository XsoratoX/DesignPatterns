package factory.pizza_firm2;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("チーズ")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("シカゴスタイルチーズピザ");

        } else if (item.equals("野菜")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("シカゴスタイル野菜ピザ");

        } else if (item.equals("アサリ")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("シカゴスタイルアサリピザ");

        } else if (item.equals("ペパロニ")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("シカゴスタイルペパロニピザ");

        }
        return pizza;
    }
}