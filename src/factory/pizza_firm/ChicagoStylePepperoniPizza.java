package factory.pizza_firm;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "シカゴスタイルのペパロニピザ";
        this.dough = "極厚クラスト生地";
        this.sauce = "プラムトマトソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("ブラックオリーブ");
        this.toppings.add("ホウレンソウ");
        this.toppings.add("ナス");
        this.toppings.add("スライスしたペパロニ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}