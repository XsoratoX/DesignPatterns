package factory.pizza_firm;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "ニューヨークスタイルのソース&チーズピザ";
        this.dough = "薄いクラスト生地";
        this.sauce = "マリナラソース";

        this.toppings.add("すりおろしたレッジャーノチーズ");
    }
}