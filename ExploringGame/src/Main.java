import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		locations.put(0, new Location(0, "You are sitting in front of computer and looking on the screen"));
		locations.put(1, new Location(1, "You are standing on the street near by a small store"));
		locations.put(2, new Location(2, "You are entering to the forest"));
		locations.put(3, new Location(3, "You are sitting in a bank of a lake"));
		locations.put(4, new Location(4, "You are entering vast Valley"));
		locations.put(5, new Location(5, "You are on the plains"));
		
		locations.get(1).AddExit("W", 2);
		locations.get(1).AddExit("E", 3);
		locations.get(1).AddExit("S", 4);
		locations.get(1).AddExit("N", 5);
		locations.get(1).AddExit("Q", 0);
		
		locations.get(2).AddExit("N", 5);
		locations.get(2).AddExit("Q", 0);

		locations.get(3).AddExit("W", 1);
		locations.get(3).AddExit("Q", 0);
		
		locations.get(4).AddExit("N", 1);
		locations.get(4).AddExit("Q", 0);
		locations.get(4).AddExit("W", 2);
		
		locations.get(5).AddExit("S", 1);
		locations.get(5).AddExit("W", 2);
		locations.get(5).AddExit("Q", 0);
		
		int loc=1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc==0) {
				break;
			}
			
			Map<String, Integer> exit = locations.get(loc).getExits();
			System.out.print("Available exits: ");
			for (String s : exit.keySet()) {
				System.out.print(s + ", ");
			}
			System.out.println();
			
			String direction = scanner.nextLine().toUpperCase();
			if (exit.containsKey(direction)) {
				loc = exit.get(direction);
			}
			else {
				System.out.println("You cannot go there.");
			}
		}
	}

}
