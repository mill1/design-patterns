package virtualremote;

import intelliware.CeilingLight;
import virtualremote.command.LightOffCommand;
import virtualremote.command.LightOnCommand;

public class VirtualRemote {

    public static void main(String[] args) {

    	LightOnCommand lightOn = new LightOnCommand(new CeilingLight());
    	lightOn.execute();
        
        LightOffCommand lightOff = new LightOffCommand(new CeilingLight());
        lightOff.execute();    	
        lightOff.undo();
    }
}
