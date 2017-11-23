import java.util.ArrayList;
import java.util.Scanner;

public class MobileContacts extends Contact {
	
//	Contact contact = new Contact();
	
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	Scanner sc = new Scanner(System.in);

	public void menu() {
		int choice = 0;
		while (choice!=6) {
			showMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
//				viewList();
				break;
			case 2:
//				addContact();
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
			case 6:
//				quit();
				break;
			}
		}
	}
	
	public void showMenu() {
		System.out.println("Choose an action:");
		System.out.println("1. Print list of contacts");
		System.out.println("2. Add a new contact");
		System.out.println("3. Edit edit a contact");
		System.out.println("4. Remove a contact");
		System.out.println("5. Find a contact");
		System.out.println("6. Quit");
	}
	
	
}
