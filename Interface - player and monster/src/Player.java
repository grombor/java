import java.util.ArrayList;
import java.util.List;

public class Player implements IStorage {
	
	private String name;
	private int hpPoints;
	private String weapon;
	
	public Player(String name, int hpPoints) {
		this.name = name;
		this.hpPoints = hpPoints;
		this.weapon = "Mace";
	}

	public String getName() {
		return name;
	}

	public int getHpPoints() {
		return hpPoints;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHpPoints(int hpPoints) {
		this.hpPoints = hpPoints;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.hpPoints);
		values.add(2, this.weapon);
		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if (!savedValues.isEmpty()) {
			this.name = savedValues.get(0);
			this.hpPoints = Integer.parseInt(savedValues.get(1));
			this.weapon = savedValues.get(2);
		}
	}

	@Override
	public String toString() {
		return " Player{ " + name +
		" HP: " + hpPoints +
		" Weapon: " + weapon;
	}
	
	
	
}
