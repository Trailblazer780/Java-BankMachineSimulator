
import java.util.ArrayList;

public class Model {
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	private int createAccountIndex;
	
	public Model() {
		createAccountIndex = 0;
	}
	
	// --------------------------------- Creating Accounts
	
	public void getSelectedAccountIndex(int accountSelected) {
		createAccountIndex = accountSelected;
		createAccount();
	}
	
	
	public void createAccount() {
		if(createAccountIndex == 1) {
			System.out.println("Account 1");
		}
		else if(createAccountIndex == 2) {
			System.out.println("Account 2");
		}
	}
	
	public void setNewAccountNumber() {
		
	}
	
	
	
	// ------------------------------------------------------- Gets / Sets
	
	
	
	
	
	
	
	
	
}
