import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player phil = new Player("Phil", 25);
		phil.setWeapon("Stormbringer");
		System.out.println(phil.toString());
		saveObject(phil);
		readObject(phil);
		System.out.println(phil.toString());
		
	}
	
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to easy hero creator.");
		System.out.println("Enter a hero name: ");
		String read = sc.nextLine();
		values.add(0,read);
		System.out.println("Enter Health Point value: ");
		read = sc.nextLine();
		values.add(1,read);
		System.out.println("Enter a weapon name: ");
		read = sc.nextLine();
		values.add(2,read);
		return values;
	}

	public static void saveObject (IStorage o) {
		for (int i=0; i<o.write().size(); i++) {
			System.out.println("Saving...");
		}
	}
	
	public static void readObject(IStorage o) {
		ArrayList<String> values = readValues();
		o.read(values);
	}
	
}
