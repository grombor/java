import java.util.HashMap;
import java.util.Map;

public class Location {
	private final String description;
	private final int locationId;
	private final Map <String, Integer> exits;
	
	public Location(String description, int locationId) {
		super();
		this.description = description;
		this.locationId = locationId;
		this.exits = new HashMap<String, Integer>();
	}
	
	public void AddExit(String direction, Integer location) {
		exits.put(direction, location);
	}

	public String getDescription() {
		return description;
	}

	public int getLocationId() {
		return locationId;
	}

	public Map<String, Integer> getExits() {
		return exits;
	}
	
	
}
