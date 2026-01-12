package command.remote;

public class CeilingFan {
    private String location = "";
    private int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        this.level = HIGH;
        System.out.println(this.location + " シーリングファンの強さは「強」です．");
    }

    public void medium() {
        this.level = MEDIUM;
        System.out.println(this.location + " シーリングファンの強さは「中」です．");
    }

    public void low() {
        this.level = LOW;
        System.out.println(this.location + " シーリングファンの強さは「弱」です．");
    }

    public void off() {
        this.level = -1;
        System.out.println(this.location + " シーリングファンは止まっています．");
    }

    public int getSpeed() {
        return this.level;
    }
}