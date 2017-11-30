import java.util.ArrayList;

public class Branch {
	private String BranchName;
	private ArrayList<Customer> customers;
	

	public Branch(String branchName) {
		BranchName = branchName;
		this.customers = new ArrayList<Customer>();
	}

	public String getBranchName() {
		return BranchName;
	}
	
	public void addCustomer(String name, double initialAmount) {
		customers.add(new Customer(name, initialAmount));
		System.out.println("A new customer added.");
	}
	
	public void addTransaction(String customer, double amount) {
		if (findCustomer(customer)!=null) {
			Customer existingCustomer = findCustomer(customer);
			existingCustomer.addTransaction(amount);
			System.out.println("A new transaction added.");
		}
	}

	private Customer findCustomer(String customer) {
		for (int i=0; i<=customers.size(); i++) {
			Customer checkedCustomer = customers.get(i);
			if (checkedCustomer.getName().equals(customer)) {
				return checkedCustomer;
			}
		}
		return null;
	}
	
	public ArrayList<Customer> getCustomers (String branchName){
		return customers;
	}
	
}
