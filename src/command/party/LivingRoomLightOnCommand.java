package command.party;

public class LivingRoomLightOnCommand implements Command {
    private Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }

    public void undo() {
        this.light.off();
    }
}