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
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			switch (choice) {
			case 1:
				mb.viewList();
				break;
			case 2:
				addContact();
				break;
			case 3:
				editContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContact();
				break;
			}
		}
	}
	
	
	private static void findContact() {
		System.out.println("Enter name of a contact:");
		String name = sc.nextLine();
		System.out.println(mb.findContact(name));	
	}

	private static void removeContact() {
		System.out.println("Enter name of a contact:");
		String name = sc.nextLine();
		if (mb.isContactExist(mb.findContact(name))) {
			mb.removeContact(mb.findContact(name));
		}
		else System.out.println("Contact not found");
	}

	// Edit position from list
	private static void editContact() {
		System.out.println("Enter a position to edit:");
		int position = Integer.parseInt(sc.nextLine());
		System.out.println("Enter a new name");
		String newName = sc.nextLine();
		System.out.println("Enter a new phone number");
		int newNumber = Integer.parseInt(sc.nextLine());
		// Creating a new contact
		mb.editContact(position-1, Contact.createContact(newName, newNumber));
	}

	static void addContact() {
		
		// Initialize local variables
		String name = null;
		int phoneNum = 0;
		
		// Getting values from user
		System.out.println("Enter the contact name: ");
		name = sc.nextLine().toString();
		System.out.println("Enter the phone number: ");
		phoneNum = Integer.parseInt(sc.nextLine());
		
		// Creating a new field
		if (!mb.isContactExist(mb.findContact(name))) {
			Contact newContact = Contact.createContact(name, phoneNum);
			mb.addContact(newContact);
		}
		else System.out.println("Contact already exist");
		
	}
	
}
