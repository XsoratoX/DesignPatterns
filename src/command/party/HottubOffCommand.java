package command.party;

public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.setTemperture(37);
        this.hottub.off();
    }

    public void undo() {
        this.hottub.on();
    }
}