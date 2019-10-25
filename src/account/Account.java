package account;

//Non-Functionality in regards to userinput
//Given Task:
//customer name, customer email, phone number, balance in account
//getter and setters
//several constructors
//methods for withdrawal, deposit, closing bank account

public class Account {
	
	//Attributes
	//private means that code from outside this class cannot access the variable directly
	private String name;
	private String email;
	private String phoneNumber;
	private int balance;
	
	
	//Getters and Setters: used for retrieving and updating value of a variable.
	//Bc the variables are private, you can't make changes to them directly so you have to use getters and setters
	//in order to retrieve the data. Another way is to make them public.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//no-arg constructor
	public Account () {
			
	}
	
	//Create a Bank Account Constructor w/All info
	public Account(String name, String email, String phoneNumber, int balance) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
	}
	
	//Constructor with just name
	public Account(String name) {
		this.name = name;
		this.email = "No email address available";
		this.phoneNumber = "No Phone Number Available";
		this.balance = 0;
	}
	
	//2-arg constructor
	public Account (int balance) {
		this.balance = balance;
		
	}

	//Methods
	public int getWithdrawl(int amount) {
		return balance - amount;
	}

	public int getDeposit(int amount) {
		if (amount < 0) {
			System.out.println("You can't deposit a negative number dude...");
		} else {
		 this.balance += amount;
		}
		return balance;
	}
	
	public String closeBank() {
		System.out.println("Account Deleted");
		name = " N/A";
		email = "N/A";
		phoneNumber = "N/A";
		balance = 0;
		return "Info:" + name;
		
	}
	
	//String Representation of Account Information
	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", balance=" + balance
				+ "]";
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Make a new instance of Account with 2 parameter: balance and amount which then called upon the getWithdrawl Method
	Account withdrawlOne = new Account (100);
	System.out.println(withdrawlOne.getWithdrawl(12));
	
	//Make a Deposit
	Account depositOne = new Account (200);
	System.out.println(depositOne.getDeposit(100));
	System.out.println(depositOne.getDeposit(-10));
	
	
	//Close Account
	Account closeBankNow = new Account ();
	System.out.println(closeBankNow.closeBank());
	
	Account newAccount = new Account("Phibal", "phibal.rath@gmail.com", "208-570-2034", 0);
	System.out.println(newAccount);
	System.out.println(newAccount.name); //Phibal
	newAccount.getDeposit(500); //this will update the balance
	System.out.println(newAccount);
	System.out.println(newAccount.closeBank()); //update the values to get rid of info
	System.out.println(newAccount);
	
	}

}
