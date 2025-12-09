package factory.pizza_firm;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        this.name = "シカゴスタイルのアサリピザ";
        this.dough = "極厚クラスト生地";
        this.sauce = "プラムトマトソース";

        this.toppings.add("シュレッドモツァレラチーズ");
        this.toppings.add("チェサピーク湾産の冷凍アサリ");
    }

    public void cut() {
        System.out.println("ピザを四角形にカットする");
    }
}