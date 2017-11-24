
public class Contact {
	private String name;
	private int phoneNum;
	
	
	public Contact(String name, int phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public Contact() {
	}


	public String getName() {
		return name;
	}


	public int getPhoneNum() {
		return phoneNum;
	}
	
	public static Contact createContact (String name, int phoneNum) {
		return new Contact(name, phoneNum);
	}
	
}
