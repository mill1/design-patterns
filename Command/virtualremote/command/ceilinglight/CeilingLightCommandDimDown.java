package virtualremote.command.ceilinglight;

import intelliware.CeilingLight;
import virtualremote.command.Command;

public class CeilingLightCommandDimDown implements Command {

    final private CeilingLight object;

    public CeilingLightCommandDimDown(CeilingLight object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.DimDown();
    }

	@Override
	public void undo() {
		object.DimUp();
	}
}
