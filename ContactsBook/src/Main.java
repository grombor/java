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
	
	
	static void addContact() {
		String name = null;
		int phoneNum = 0;
		
		System.out.println("Enter the contact name: ");
		name = sc.nextLine().toString();
		System.out.println("Enter the phone number: ");
		phoneNum = Integer.parseInt(sc.nextLine());
		
		Contact newContact = Contact.createContact(name, phoneNum);
		mb.addContact(newContact);
	}
	
}
