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
			case 6:
				System.out.println("Shutting down");
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
//		Looking for contact
		if (mb.isContactExist(mb.findContact(name))) {
			mb.removeContact(mb.findContact(name));
		}
		else System.out.println("Contact not found");
	}

	// Edit position from list
	private static void editContact() {
//		Enter a name to find a contact
		System.out.println("Enter a name to edit");
		String name = sc.nextLine();
//		Enter a new name
		System.out.println("Enter a new name of contact");
		String newName = sc.nextLine();
//		Enter a new phone number
		System.out.println("Enter a new contact phone number");
		int newNumber = Integer.parseInt(sc.nextLine());
//		Creating a new contact
		mb.editContact(mb.findContact(name), Contact.createContact(newName, newNumber));
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
