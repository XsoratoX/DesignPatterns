package factory.pizza_firm;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "シカゴスタイルの野菜ピザ";
        this.dough = "極厚クラスト生地";
        this.sauce = "プラムトマトソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("ブラックオリーブ");
        this.toppings.add("ホウレンソウ");
        this.toppings.add("ナス");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}