/* Hero inventory. */

package javatextadv;

import java.util.ArrayList;

public class Inventory extends ArrayList<Item> {
	
	public Inventory() {

	}

	public boolean use(Item i) {
		if (contains(i)) {
			if (i.isUseable()) {
				remove(i);
				return true;
			}
			return false;
		}
		return false;
	}
	
}