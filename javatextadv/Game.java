/* Game container object */

package javatextadv;

public class Game {

	private OutputManager write;
	private WorldMap map;
	private int mapLevel; //vertical state of map

	public Game() {
		write = new OutputManager();
	}

	public void gameOver() {
		write.out("Your game has ended.\n\n\n-=GAME OVER=-\n\n\n");
	}

	public void gameOver(String message) {
		write.out(message);
	}
}