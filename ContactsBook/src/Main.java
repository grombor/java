import java.util.Scanner;

public class Main extends MobileContacts {
	static MobileContacts mb = new MobileContacts();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main (String[] args) {
		menu();
	}

	static void menu() {
		int choice = 0;
		while (choice!=6) {
			mb.showMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				mb.viewList();
				break;
			case 2:
				mb.addContact();
				break;
			case 3:
//				editContact();
				break;
			case 4:
//				removeContact();
				break;
			case 5:
//				findContact();
				break;
			}
		}
	}
	
}
