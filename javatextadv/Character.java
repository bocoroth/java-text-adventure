/* Character Interface. */

package javatextadv;

public interface Character {

	/*
	public final String name;

	private Coord coordinates;
	private boolean alive;
	private int health;
	private int strength;
	*/
	
	/* GETTERS */

	//return name of Character
	public String getName();

	//return coordinates of Character
	public Coord getCoord();
	
	//Character is alive?
	public boolean isAlive();

	//return health of Character
	public int getHealth();

	//return strength of Character
	public int getStrength();

	
	/* SETTERS */

	//move Character to coordinates
	public void move(int x, int y);
	
	//kill Character
	public void kill();

	//set health of Character
	public void setHealth(int h);

	//set attack strength of Character
	public void setStrength(int s);

	//injure Character for d damage
	public void injure (int d);

}