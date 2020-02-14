package virtualremote.command.ceilinglight;

import intelliware.CeilingLight;
import virtualremote.command.Command;


public class CeilingLightCommandOn implements Command {

    final private CeilingLight object;

    public CeilingLightCommandOn(CeilingLight object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.On();
    }

	@Override
	public void undo() {
		object.Off();
	}
}
