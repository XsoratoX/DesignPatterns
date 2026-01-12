package command.undo;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location = "";
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println(this.location + " シーリングファンの強さは「強」です．");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.location + " シーリングファンの強さは「中」です．");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(this.location + " シーリングファンの強さは「弱」です．");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(this.location + " シーリングファンは止まっています．");
    }

    public int getSpeed() {
        return this.speed;
    }
}