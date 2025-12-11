package factory.pizza_firm;

public class CaliforniaStyleClamPizza extends Pizza {
    public CaliforniaStyleClamPizza() {
        this.name = "カリフォルニアスタイルのアサリピザ";
        this.dough = "薄いクラフト生地";
        this.sauce = "ベシャメルソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("カリフォルニア湾産のフレッシュなアサリ");
        this.toppings.add("ガーリック");
        this.toppings.add("オリーブオイル");
        this.toppings.add("ハーブ");
    }
}