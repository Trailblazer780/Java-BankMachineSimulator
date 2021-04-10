
import java.util.ArrayList;

public class Model {
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	private int createAccountIndex;
	private int newAccountNumber;
	private String accountDescription;
	private double initialDeposit;
	
	public Model() {
		createAccountIndex = 0;
	}
	
	// --------------------------------- Creating Accounts
	
	public void getSelectedAccountIndex(int accountSelected) {
		createAccountIndex = accountSelected;
		createAccount();
	}
	
	public void getNewAccountDescription(String accountDesc) {
		accountDescription = accountDesc;
		System.out.println(accountDescription);
	}
	
	public void createAccount() {
		if(createAccountIndex == 1) {
			getNewAccountNumber();
			SavingsAccount savings = new SavingsAccount();
			System.out.println("Account 1");
		}
		
		else if(createAccountIndex == 2) {
			getNewAccountNumber();
			AirmileSavingsAccount airmileSavings = new AirmileSavingsAccount();
			System.out.println("Account 2");
		}
	}
	
	public void getInitialDeposit(Double firstDeposit) {
		initialDeposit = firstDeposit;
		System.out.println(initialDeposit);
	}
	
	public void getNewAccountNumber() {
		newAccountNumber = accounts.size() + 1;
		System.out.println(newAccountNumber);
	}
	
	
	
	// ------------------------------------------------------- Gets / Sets
	
	
	
	
	
	
	
	
	
}
