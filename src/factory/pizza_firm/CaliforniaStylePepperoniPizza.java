package factory.pizza_firm;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        this.name = "カリフォルニアスタイルのペパロニピザ";
        this.dough = "薄いクラフト生地";
        this.sauce = "ベシャメルソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("オレガノ");
        this.toppings.add("バジル");
        this.toppings.add("トウガラシ");
        this.toppings.add("マッシュルーム");
        this.toppings.add("スライスしたペパロニ");
    }
}