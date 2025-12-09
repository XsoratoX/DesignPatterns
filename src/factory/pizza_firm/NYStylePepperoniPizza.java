package factory.pizza_firm;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.name = "ニューヨークスタイルのペパロニピザ";
        this.dough = "薄いクラスト生地";
        this.sauce = "マリナラソース";

        this.toppings.add("すりおろしたレッジャーノチーズ");
        this.toppings.add("スライスしたペパロニ");
        this.toppings.add("ガーリック");
        this.toppings.add("オニオン");
        this.toppings.add("マッシュルーム");
        this.toppings.add("トウガラシ");
    }
}