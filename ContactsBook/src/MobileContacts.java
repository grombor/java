import java.util.ArrayList;
import java.util.Scanner;

public class MobileContacts{
		
	private ArrayList<Contact> contacts;
	Scanner sc = new Scanner(System.in);
	
	public MobileContacts() {
		this.contacts = new ArrayList<Contact>();
		}

	public void addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact added");
	}
	
	
	public int findContact(Contact contact) {
		return this.contacts.indexOf(contact);
	}

	public void viewList() {
		System.out.println("Your have " + contacts.size() + " contacts:");
		for (int i=0; i<contacts.size(); i++) {
			System.out.println((i+1) + ". " 
					+ contacts.get(i).getName() + " number: " 
					+ contacts.get(i).getPhoneNum());
		}
	}

	public void showMenu() {
		System.out.println("____________________________\n");
		System.out.println("Choose an action:");
		System.out.println("1. Print list of contacts");
		System.out.println("2. Add a new contact");
		System.out.println("3. Edit edit a contact");
		System.out.println("4. Remove a contact");
		System.out.println("5. Find a contact");
		System.out.println("6. Quit");
		System.out.println("____________________________\n");
	}
	
	
}
