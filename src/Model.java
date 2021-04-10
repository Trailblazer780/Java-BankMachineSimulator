
import java.util.ArrayList;

public class Model {
	
	
	private Account currentSelectedAccount;
	ArrayList<Account> accounts = new ArrayList<Account>();
	private int createAccountIndex;
	private int newAccountNumber;
	private String accountDescription;
	private double initialDeposit;
	
	public Model() {
		createAccountIndex = 0;
	}
	
	// ------------------------------------------------------- Creating Accounts
	
	public void getSelectedAccountIndex(int accountSelected) {
		createAccountIndex = accountSelected;
	}
	
	public void getNewAccountDescription(String accountDesc) {
		accountDescription = accountDesc;
		//System.out.println(accountDescription);
	}
	
	public void createAccount() {
		if(createAccountIndex == 1) {
			getNewAccountNumber();
			SavingsAccount savings = new SavingsAccount();
			savings.setStartingBalance(initialDeposit);
			savings.setAccountNumber(newAccountNumber);
			savings.setAccountDescription(accountDescription);
			setSelectedAccount(savings);
			accounts.add(savings);
			//System.out.println(accounts);
			//System.out.println("Account 1");
		}
		
		else if(createAccountIndex == 2) {
			getNewAccountNumber();
			AirmileSavingsAccount airmileSavings = new AirmileSavingsAccount();
			airmileSavings.setStartingBalance(initialDeposit);
			airmileSavings.setAccountNumber(newAccountNumber);
			airmileSavings.setAccountDescription(accountDescription);
			setSelectedAccount(airmileSavings);
			accounts.add(airmileSavings);
			//System.out.println(accounts);
			///System.out.println("Account 2");
		}
	}
	
	public void getInitialDeposit(Double firstDeposit) {
		initialDeposit = firstDeposit;
		//System.out.println(initialDeposit);
	}
	
	public void getNewAccountNumber() {
		newAccountNumber = accounts.size() + 1;
		System.out.println(newAccountNumber);
	}
	
	public void setSelectedAccount(Account account) {
		currentSelectedAccount = account;
		currentSelectedAccount.getBalance();
		currentSelectedAccount.getAccountNumber();
		//System.out.println(currentSelectedAccount.getAccountNumber());
		//System.out.println(currentSelectedAccount.getBalance());
		//System.out.println(currentSelectedAccount);
	}
	
	// ------------------------------------------------------- Creating Accounts
	
	
	
	
	
	
	
}
