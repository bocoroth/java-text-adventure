/* Room / area of map. */

package javatextadv;

public class Room {

	private Coord coordinates;			//location of room on world map

	private String lowerTitle;			//title and description for the lower
	private String lowerDescription;	//part of the room

	private String upperTitle;			//title and description for the upper
	private String upperDescription;	//part of the room

	private String[] subTitles;			//titles and descriptions for any sub
	private String[] subDescriptions;	//rooms

	public Room(Coord coordinates) {
		this.coordinates = coordinates;
		lowerTitle = "Purgatory";
		lowerDescription = "You are in a featureless white room with no apparent doors or windows. It doesn't look like you are going anywhere for a while."
		upperTitle = null;
		upperDescription = null;
		subTitles = null;
		subDescriptions = null;
	}

	public Room(Coord coordinates, String lowerTitle, String lowerDescription) {
		this.coordinates = coordinates;
		this.lowerTitle = lowerTitle;
		this.lowerDescription = lowerDescription;
		upperTitle = null;
		upperDescription = null;
		subTitles = null;
		subDescriptions = null;
	}

	public Room(Coord coordinates, String lowerTitle, String lowerDescription, String upperTitle, String upperDescription) {
		this.coordinates = coordinates;
		this.lowerTitle = lowerTitle;
		this.lowerDescription = lowerDescription;
		this.upperTitle = upperTitle;
		this.upperDescription = upperDescription;
		subTitles = null;
		subDescriptions = null;
	}

	public Room(Coord coordinates, String lowerTitle, String lowerDescription, String[] subTitles, String subDescriptions) {
		this.coordinates = coordinates;
		this.lowerTitle = lowerTitle;
		this.lowerDescription = lowerDescription;
		upperTitle = null;
		upperDescription = null;
		this.subTitles = subTitles;
		this.subDescriptions = subDescriptions;
	}

	public Room(Coord coordinates, String lowerTitle, String lowerDescription, String upperTitle, String upperDescription, String[] subTitles, String[] subDescriptions) {
		this.coordinates = coordinates;
		this.lowerTitle = lowerTitle;
		this.lowerDescription = lowerDescription;
		this.upperTitle = upperTitle;
		this.upperDescription = upperDescription;
		this.subTitles = subTitles;
		this.subDescriptions = subDescriptions;
	}

}