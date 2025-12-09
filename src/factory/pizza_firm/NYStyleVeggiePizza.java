package factory.pizza_firm;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.name = "ニューヨークスタイルの野菜ピザ";
        this.dough = "薄いクラスト生地";
        this.sauce = "マリナラソース";

        this.toppings.add("すりおろしたレッジャーノチーズ");
        this.toppings.add("ガーリック");
        this.toppings.add("オニオン");
        this.toppings.add("マッシュルーム");
        this.toppings.add("トウガラシ");
    }
}