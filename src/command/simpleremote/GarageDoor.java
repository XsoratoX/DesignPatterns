package command.simpleremote;

public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("ガレージドアが開いています．");
    }

    public void down() {
        System.out.println("ガレージドアが閉じてします．");
    }

    public void stop() {
        System.out.println("ガレージドアは停止しています．");
    }

    public void lightOn() {
        System.out.println("ガレージライトが点いています．");
    }

    public void lightOff() {
        System.out.println("ガレージライトが消えています．");
    }
}