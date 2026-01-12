package command.party;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        undoCommand = this.onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ リモコン ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append(" [スロット" + i + "] " + this.onCommands[i].getClass().getSimpleName() + "    "
                    + this.offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuff.append("[undo] " + this.undoCommand.getClass().getSimpleName() + "\n");
        return stringBuff.toString();
    }
}