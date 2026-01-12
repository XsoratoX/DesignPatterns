package command.party;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.on();
    }

    public void undo() {
        this.tv.off();
    }
}