package virtualremote.command.ceilinglight;

import intelliware.CeilingLight;
import virtualremote.command.Command;

public class CeilingLightCommandOff implements Command {

    final private CeilingLight object;

    public CeilingLightCommandOff(CeilingLight object) {
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
