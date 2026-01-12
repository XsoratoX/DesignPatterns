package command.party;

public class LivingRoomLightOffCommand implements Command {
    private Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }
}