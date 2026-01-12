package command.party;

public class Hottub {
    private boolean on;
    private int temperture;

    public Hottub() {
    }

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public void circulate() {
        if (on) {
            System.out.println("バブルバスが動いています！");
        }
    }

    public void jetsOn() {
        if (on) {
            System.out.println("ジェットバスが動いています．");
        }
    }

    public void jetsOff() {
        if (on) {
            System.out.println("ジェットパスが停止しています．");
        }
    }

    public void setTemperture(int temperture) {
        if (temperture > this.temperture) {
            System.out.println("風呂が" + temperture + "度まで熱くなっています．");
        } else {
            System.out.println("風呂が" + temperture + "度まで冷めています．");
        }
    }
}