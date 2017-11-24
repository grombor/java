import java.util.ArrayList;
import java.util.Scanner;

public class MobileContacts extends Contact {
	
	public MobileContacts() {
		super();
	}
	
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addContact() {
		System.out.println("Enter the contact name: ");
		String name = sc.nextLine();
		System.out.println("Enter the phone number: ");
		int phoneNum = sc.nextInt();
		Contact newContact = new Contact(name, phoneNum);
		contacts.add(newContact);
		System.out.println("Contact created");
	}

	public void viewList() {
		System.out.println("Your have " + contacts.size() + " contacts:");
		for (int i=0; i<contacts.size(); i++) {
			System.out.println("\t" + (i+1) + ". " + contacts.get(i).toString());
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
