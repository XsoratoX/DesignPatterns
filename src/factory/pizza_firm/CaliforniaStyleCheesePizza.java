package factory.pizza_firm;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        this.name = "カリフォルニアスタイルのソース&チーズピザ";
        this.dough = "薄いクラフト生地";
        this.sauce = "ベシャメルソース";

        this.toppings.add("すりおろしたレッジャーノチーズ");
    }
}