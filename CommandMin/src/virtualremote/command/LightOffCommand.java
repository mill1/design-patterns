package virtualremote.command;

import intelliware.CeilingLight;

public class LightOffCommand implements Command {

	private CeilingLight ceilinglight;
	
	public LightOffCommand(CeilingLight ceilinglight) {
		this.ceilinglight = ceilinglight;
	}
	
	public void execute() {
		ceilinglight.Off();
	}
	
	public void undo() {
		ceilinglight.On();
	}
}
