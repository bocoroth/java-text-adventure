/* Hero (user). */

package javatextadv;

public class Hero implements Character {

	public final String name;
	
	private Coord coordinates;
	private boolean alive;
	private int health;
	private int strength;

	private Inventory inventory;

	
	public Hero (String newName) {

		coordinates = new Coord(1, 1);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;
		inventory = new Inventory();

	}
	
	public Hero (String newName, int newX, int newY) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;
		inventory = new Inventory();

	}
	
	public Hero (String newName, int newX, int newY, int newStrength) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = newStrength;
		name = newName;
		inventory = new Inventory();

	}
	
	public Hero (String newName, int newX, int newY, int newStrength, int newHealth) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = newHealth;
		strength = newStrength;
		name = newName;
		inventory = new Inventory();

	}

	
	/* GETTERS */

	//return name of Hero
	public String getName() {
		return name;
	}

	//return coordinates of Hero
	public Coord getCoord() {
		return coordinates;
	}

	//Hero is alive?
	public boolean isAlive() {
		if (alive == false) {
			System.out.println(name + " is dead.");
		}
		return alive;
	}

	//return health of Hero
	public int getHealth() {
		return health;
	}

	//return strength of Hero
	public int getStrength() {
		return strength;
	}

	
	/* SETTERS */

	//move Hero to coordinates
	public void move(int newX, int newY) {
		coordinates = new Coord(newX, newY);
	}
	
	//kill Hero
	public void kill() {
		alive = false;
		health = 0;
	}

	//set health of Hero
	public void setHealth(int newHealth) {
		health = newHealth;
	}

	//set strength of Hero
	public void setStrength(int newStrength) {
		strength = newStrength;
	}


	/* Hero METHODS */

	public void injure (int attack) {
		health -= attack;
		if (health <= 0) {
			kill();
		}
	}

	public <T extends Character> void attack(T charact) {
		System.out.println(name + " attacks " + charact.getName() + " for " + strength + " damage.");
		charact.injure(strength);
	}
}