package adapter.ducks;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("ゴロゴロ");
    }

    public void fly() {
        System.out.println("短い距離で飛んでいます");
    }
}