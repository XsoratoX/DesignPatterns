package factory.pizza_firm;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "シカゴスタイルのディープディッシュチーズピザ";
        this.dough = "極厚クラスト生地";
        this.sauce = "プラムトマトソース";

        this.toppings.add("シュレッドモツァレラチーズ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}