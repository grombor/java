
public class Contact {
	private String name;
	private int phoneNum;
	
	
	private Contact(String name, int phoneNum) {
		super();
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


	public void setName(String name) {
		this.name = name;
	}


	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	

}
