package virtualremote.command.stereo;

import intelliware.Stereo;
import virtualremote.command.Command;

public class StereoCommandOff implements Command {

    final private Stereo object;

    public StereoCommandOff(Stereo object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.Off();
    }

	@Override
	public void undo() {
		object.On();
	}
}
