/* Test */

import javatextadv.*;

public class test {

	public static void main (String[] args) {
		int rand1 = (int)(100 * Math.random());
		int rand2 = (int)(100 * Math.random());
		int rand3 = (int)(1000 * Math.random());
		int rand4 = (int)(1000 * Math.random());

		Enemy one = new Enemy("Enemy 1",1,1,rand1,rand3);
		Hero two = new Hero("Hero",1,1,rand2,rand4);
		
		while (one.isAlive() && two.isAlive()) {
			System.out.println(one.getName() + " has " + one.getHealth() + " health, " + two.getName() + " has " + two.getHealth() + " health");
			two.attack(one);
			if (!one.isAlive()) {
				break;
			}
			one.attack(two);
		}
	}

}