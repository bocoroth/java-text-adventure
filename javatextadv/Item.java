/* Inventory item. */

package javatextadv;

public class Item {

	public final String name;
	public final String description;
	
	private int id;
	private boolean used;
	
	//constructor
	public Item (String item_name, String item_description, int item_id) {
		name = item_name;
		description = item_description;
		id = item_id;
		used = false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getID() {
		return id;
	}

	public boolean isUseable() {
		return !used;
	}

}