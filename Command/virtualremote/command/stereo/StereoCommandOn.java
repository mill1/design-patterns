/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package virtualremote.command.stereo;

import intelliware.Stereo;
import virtualremote.command.Command;

/**
 *
 * @author michel
 */
public class StereoCommandOn implements Command {

    final private Stereo object;

    public StereoCommandOn(Stereo object) {
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
