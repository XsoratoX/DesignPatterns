package command.remote;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ リモコン ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append(" [スロット" + i + "] " + this.onCommands[i].getClass().getSimpleName() + " "
                    + this.offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}