package command.remote;

public class GarageDoor {
    private String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(this.location + " ガレージドアが開いています．");
    }

    public void down() {
        System.out.println(this.location + " ガレージドアが閉じてします．");
    }

    public void stop() {
        System.out.println(this.location + " ガレージドアは停止しています．");
    }

    public void lightOn() {
        System.out.println(this.location + " ガレージライトが点いています．");
    }

    public void lightOff() {
        System.out.println(this.location + " ガレージライトが消えています．");
    }
}