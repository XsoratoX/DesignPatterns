package factory.pizza_firm;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        this.name = "ニューヨークスタイルのアサリピザ";
        this.dough = "薄いクラスト生地";
        this.sauce = "マリナラソース";

        this.toppings.add("すりおろしたレッジャーノチーズ");
        this.toppings.add("ロングアイランド湾産の新鮮なアサリ");
    }
}