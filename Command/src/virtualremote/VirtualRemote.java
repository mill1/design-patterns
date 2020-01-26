/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */

package virtualremote;

import intelliware.CeilingLight;
import intelliware.Stereo;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import virtualremote.command.Command;
import virtualremote.command.ceilinglight.*;
import virtualremote.command.stereo.*;


public class VirtualRemote {
	
    static final int nrOfButtons = 8;

    final List<Command> buttons = new ArrayList<Command>( nrOfButtons );
    final Stack<Command> history = new Stack<Command>();

    public VirtualRemote() {
        // Initialize all buttons to null
        for (int i=0 ; i < nrOfButtons; i++ ) {
            buttons.add(null);
        }
    }

    public void setButton(int i, Command c ) {
        buttons.set(i, c);
    }

    public void pressButton(int i ) {
        Command c = buttons.get(i);

        if (c != null ) {
            c.execute();
            history.push( c );
        }
    }
    
    public void undoButton() {
    	if (!history.isEmpty()) {
    		history.pop().undo();
    	}
    }

    public static void setupRC( VirtualRemote rc ) {
    	
        // Setup Stereo
        Stereo stereo = new Stereo();
        rc.setButton(1, new StereoCommandOn( stereo ));
        rc.setButton(5, new StereoCommandOff( stereo ));

        // Setup CeilingLight
        CeilingLight ceilingLight = new CeilingLight();
        rc.setButton(2, new CeilingLightCommandOn( ceilingLight ));
        rc.setButton(6, new CeilingLightCommandOff( ceilingLight ));
        rc.setButton(3, new CeilingLightCommandDimUp( ceilingLight ));
        rc.setButton(7, new CeilingLightCommandDimDown( ceilingLight ));
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VirtualRemote rc = new VirtualRemote();
        setupRC( rc );

        // Use RC
        for (int i=0; i < nrOfButtons; i++ ) {
            System.out.println("Pressing button " + i + " : " + "Result: " );
            rc.pressButton(i);
        }
        
        // Undo button presses 
        for ( int i=0; i < nrOfButtons; i++ ) {
        	System.out.println("Undo command. Result:" );
            rc.undoButton();
        }
    }
}