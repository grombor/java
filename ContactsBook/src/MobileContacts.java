import java.util.ArrayList;
import java.util.Scanner;

public class MobileContacts{
		
	private ArrayList<Contact> contacts;
	Scanner sc = new Scanner(System.in);
	
	public MobileContacts() {
		this.contacts = new ArrayList<Contact>();
		}
	
	// Add a contact if contact doesnt exist 
	public void addContact(Contact contact) {
		if (!isContactExist(contact)) {
			contacts.add(contact);
			System.out.println("Contact added");
		}
		else System.out.println("Contact already exists");
	}
	
	public void removeContact(int position) {
		this.contacts.remove(position);
	}
	
	// Checking if contact exists on a list
	public boolean isContactExist(Contact contact) {
		if (findContact(contact)>=0) {
			return true;
		}
		return false;
	}
	
	// Returning item position on list. If position <0 means item doesnt exist
	public int findContact(Contact contact) {
		return this.contacts.indexOf(contact);
	}

	// Printing all list records
	public void viewList() {
		System.out.println("Your have " + contacts.size() + " contacts:");
		for (int i=0; i<contacts.size(); i++) {
			System.out.println((i+1) + ". " 
					+ contacts.get(i).getName() + " number: " 
					+ contacts.get(i).getPhoneNum());
		}
	}

	// Printing user menu
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

	public void editContact(int position, Contact contact) {
		this.contacts.set(position-1, contact);
		System.out.println("Contact has been changed");
	}
	
	
}
