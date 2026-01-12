package command.remote;

public class Stereo {
    private String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " オーディオの電源が点いています．");
    }

    public void off() {
        System.out.println(this.location + " オーディオの電源が消えています．");
    }

    public void setCD() {
        System.out.println(this.location + " オーディオがCD入力に設定されています．");
    }

    public void setDVD() {
        System.out.println(this.location + " オーディオがDVD入力に設定されています．");
    }

    public void setRadio() {
        System.out.println(this.location + " オーディオがラジオに設定されています．");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " オーディオのボリュームが" + volume + "に設定されています．");
    }
}