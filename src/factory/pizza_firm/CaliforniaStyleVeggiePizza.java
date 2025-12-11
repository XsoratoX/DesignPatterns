package factory.pizza_firm;

public class CaliforniaStyleVeggiePizza extends Pizza {
    public CaliforniaStyleVeggiePizza() {
        this.name = "カリフォルニアスタイルのアサリピザ";
        this.dough = "薄いクラフト生地";
        this.sauce = "ベシャメルソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("ズッキーニ");
        this.toppings.add("ホウレンソウ");
        this.toppings.add("スライスしたナス");
        this.toppings.add("ヤングコーン");
    }
}