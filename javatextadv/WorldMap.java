/* World map. */

package javatextadv;

import java.util.ArrayList;

public class WorldMap {

	private ArrayList<Room> map;

	public WorldMap() {
		map = new ArrayList<Room>();
	}

	public void addRoom(Room r) {
		map.add(r);
	}

}