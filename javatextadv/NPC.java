/* Non-player (neutral) Character. */

package javatextadv;

public class NPC implements Character {

	public final String name;
	
	private Coord coordinates;
	private boolean alive;
	private int health;
	private int strength;

	private int patience;
	
	public NPC (String newName) {

		coordinates = new Coord(1, 1);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;

	}
	
	public NPC (String newName, int newX, int newY) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;

	}
	
	public NPC (String newName, int newX, int newY, int newStrength) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = newStrength;
		name = newName;

	}
	
	public NPC (String newName, int newX, int newY, int newStrength, int newHealth) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = newHealth;
		strength = newStrength;
		name = newName;

	}

	
	/* GETTERS */

	//return name of NPC
	public String getName() {
		return name;
	}

	//return coordinates of NPC
	public Coord getCoord() {
		return coordinates;
	}

	//NPC is alive?
	public boolean isAlive() {
		if (alive == false) {
			System.out.println(name + " is dead.");
		}
		return alive;
	}

	//return health of NPC
	public int getHealth() {
		return health;
	}

	//return strength of NPC
	public int getStrength() {
		return strength;
	}

	
	/* SETTERS */

	//move NPC to coordinates
	public void move(int newX, int newY) {
		coordinates = new Coord(newX, newY);
	}
	
	//kill NPC
	public void kill() {
		alive = false;
		health = 0;
	}

	//set health of NPC
	public void setHealth(int newHealth) {
		health = newHealth;
	}

	//set strength of NPC
	public void setStrength(int newStrength) {
		strength = newStrength;
	}


	/* NPC METHODS */

}