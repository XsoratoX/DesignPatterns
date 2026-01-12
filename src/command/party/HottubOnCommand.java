package command.party;

public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.on();
        this.hottub.setTemperture(40);
        this.hottub.circulate();
    }

    public void undo() {
        this.hottub.off();
    }
}