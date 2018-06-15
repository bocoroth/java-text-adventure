/* handle output to user. */

package javatextadv;

public class OutputManager {

	private boolean useGraphics;

	public OutputManager() {
		useGraphics = false;
	}

	public OutputManager(boolean useGraphical) {
		useGraphics = useGraphical;
	}


	public void out (String message) {
		if (useGraphics) {
			//graphical interface here
		}
		else {
			System.out.println(message);
		}
	}
}