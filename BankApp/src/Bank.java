import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branchList;
	
	public Bank(String name) {
		this.name = name;
		this.branchList = new ArrayList<Branch>();
	}
	
	public void printBranches () {
		for (int i=0; i<branchList.size(); i++) {
			System.out.println((i+1) + ". " + branchList.get(i).getBranchName());
		}
	}
	
	public void addBranch(String name) {
		if (!findBranch(name)) {
			branchList.add(new Branch(name));
			System.out.println("Branch added.");
		}
	}

	private boolean findBranch(String branchName) {
		for (int i=0; i<branchList.size(); i++) {
			Branch findingBranch = branchList.get(i);
			if (findingBranch.getBranchName().equals(branchName)) {
				return true;
			}
		}
		return false;
	}
	
	public void addCustomer(String branch, String customer) {
		if (findBranch(branch)) {
			for (int i=0; i<branchList.size(); i++) {
				Branch findingBranch = branchList.get(i);
				if (findingBranch.getBranchName().equals(branch)) {
					findingBranch.addCustomer(customer, 0);
				}
			}
			
		}
	}
	
	public void printCustomers (String branchName) {
		if (findBranch(branchName)) {
			for (int i=0; i<branchList.size(); i++) {
				Branch findingBranch = branchList.get(i);
				if (findingBranch.getBranchName().equals(branchName)) {
					ArrayList<Customer> eCustomer = findingBranch.getCustomers(branchName);
					for (int j=0; j<eCustomer.size(); j++) {
						System.out.println((j+1) + ". " + eCustomer.get(j).getName());
						System.out.println("Transactions: " + eCustomer.get(j).getTransactions());
					}
				}
			}
			
		}
	}
	
	public void addTransaction (String branchName, String customer, double amount) {
		if (findBranch(branchName)) {
			for (int i=0; i<branchList.size(); i++) {
				Branch fBranch = branchList.get(i);
				if (fBranch.getBranchName().equals(branchName)){
					fBranch.addTransaction(customer, amount);
				}
			}
		}
	}
	
}
