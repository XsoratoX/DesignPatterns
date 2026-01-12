package command.undo;

public class Light {
    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " 照明が点いています．");
    }

    public void off() {
        System.out.println(this.location + " 照明が消えています．");
    }
}