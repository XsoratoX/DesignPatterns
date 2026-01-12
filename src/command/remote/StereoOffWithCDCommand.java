package command.remote;

public class StereoOffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.off();
    }
}