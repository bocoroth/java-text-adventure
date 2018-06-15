/* Enemy character. */

package javatextadv;

public class Enemy implements Character {

	public final String name;

	private Coord coordinates;
	private boolean alive;
	private int health;
	private int strength;

	private int id;
	private static int enemyCount = 0;
	
	public Enemy (String newName) {

		coordinates = new Coord(1, 1);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;
		id = ++enemyCount;

	}
	
	public Enemy (String newName, int newX, int newY) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = 1;
		name = newName;
		id = ++enemyCount;

	}
	
	public Enemy (String newName, int newX, int newY, int newStrength) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = 100;
		strength = newStrength;
		name = newName;
		id = ++enemyCount;

	}
	
	public Enemy (String newName, int newX, int newY, int newStrength, int newHealth) {

		coordinates = new Coord(newX, newY);
		alive = true;
		health = newHealth;
		strength = newStrength;
		name = newName;
		id = ++enemyCount;

	}

	
	/* GETTERS */

	//return name of Enemy
	public String getName() {
		return name;
	}

	//return coordinates of Enemy
	public Coord getCoord() {
		return coordinates;
	}

	//Enemy is alive?
	public boolean isAlive() {
		if (alive == false) {
			System.out.println(name + " is dead.");
		}
		return alive;
	}

	//return health of Enemy
	public int getHealth() {
		return health;
	}

	//return strength of Enemy
	public int getStrength() {
		return strength;
	}

	
	/* SETTERS */

	//move Enemy to coordinates
	public void move(int newX, int newY) {
		coordinates = new Coord(newX, newY);
	}
	
	//kill Enemy
	public void kill() {
		alive = false;
		health = 0;
	}

	//set health of Enemy
	public void setHealth(int newHealth) {
		health = newHealth;
	}

	//set strength of Enemy
	public void setStrength(int newStrength) {
		strength = newStrength;
	}


	/* Enemy METHODS */

	public void injure (int attack) {
		health -= attack;
		if (health <= 0) {
			kill();
		}
	}

	//Attack another character (Hero, NPC, or Enemy)
	public <T extends Character> void attack(T charact) {
		System.out.println(name + " attacks " + charact.getName() + " for " + strength + " damage.");
		charact.injure(strength);
	}
}
