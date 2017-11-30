import java.util.Scanner;

// You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


public class Main {

	public static void main(String[] args) {
		int action=1;
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank("Halifix");
		
		b.addBranch("Liverpool");
		

		while(action!=0) {
			printMenu();
			System.out.println("Choose an action");
			action=Integer.parseInt(sc.nextLine());			
			switch (action) {
			case 0:
				System.out.println("Quiting...");
				break;
			case 1:
				b.printBranches();
				break;
			case 2:
				System.out.println("Enter a new branch name");
				String name = sc.nextLine();
				b.addBranch(name);
				break;
			case 3:
				System.out.println("Enter a branch name");
				b.printBranches();
				String branchName = sc.nextLine();
				System.out.println("Enter a customer name");
				String customerName = sc.nextLine();
				b.addCustomer(branchName, customerName);
				break;
			case 4:
				System.out.println("Enter a branch name");
				b.printBranches();
				String branchName2 = sc.nextLine();
				b.printCustomers(branchName2);
				break;
			case 5:
				System.out.println("Enter a branch name");
				b.printBranches();
				String branchName3 = sc.nextLine();
				System.out.println("Enter a customer name");
				b.printCustomers(branchName3);
				String customer2 = sc.nextLine();
				System.out.println("Enter an amount");
				double amount = Double.parseDouble(sc.nextLine());
				b.addTransaction(branchName3, customer2, amount);
				break;
			}
		}
		sc.close();
	}

	private static void printMenu() {
		System.out.println("\n\tWELCOME IN SIMPLE BANK APP\n");
		System.out.println("1. View Branch list");
		System.out.println("2. Add a branch");
		System.out.println("3. Add a customer to branch");
		System.out.println("4. Print customers of a branch");
		System.out.println("5. Add customers' transactions");
		System.out.println("0. For EXIT");
	}
	
}