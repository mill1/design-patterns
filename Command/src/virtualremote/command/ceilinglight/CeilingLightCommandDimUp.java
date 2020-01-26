package virtualremote.command.ceilinglight;

import intelliware.CeilingLight;
import virtualremote.command.Command;

public class CeilingLightCommandDimUp implements Command {

    final private CeilingLight object;

    public CeilingLightCommandDimUp(CeilingLight object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.DimUp();
    }

	@Override
	public void undo() {
		object.DimDown();
	}
}
