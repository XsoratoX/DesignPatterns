package command.party;

public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + "TVの電源が入っています．");
    }

    public void off() {
        System.out.println(this.location + "TVの電源が消えています．");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(this.location + " TVのチャネルがDVDに設定されています．");
    }
}