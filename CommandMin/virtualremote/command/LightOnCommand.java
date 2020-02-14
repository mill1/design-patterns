package virtualremote.command;

import intelliware.CeilingLight;

public class LightOnCommand implements Command {

	private CeilingLight ceilinglight;
	
	public LightOnCommand(CeilingLight ceilinglight) {
		this.ceilinglight = ceilinglight;
	}
	
	public void execute() {
		ceilinglight.On();
	}
	
	public void undo() {
		ceilinglight.Off();
	}
}
