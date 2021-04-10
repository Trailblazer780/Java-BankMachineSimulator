
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

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
		}
		
		else if(createAccountIndex == 2) {
			getNewAccountNumber();
			AirmileSavingsAccount airmileSavings = new AirmileSavingsAccount();
			airmileSavings.setStartingBalance(initialDeposit);
			airmileSavings.setAccountNumber(newAccountNumber);
			airmileSavings.setAccountDescription(accountDescription);
			setSelectedAccount(airmileSavings);
			accounts.add(airmileSavings);
		}
	}
	
	public void getInitialDeposit(Double firstDeposit) {
		initialDeposit = firstDeposit;
	}
	
	public void getNewAccountNumber() {
		newAccountNumber = accounts.size() + 1;
		System.out.println(newAccountNumber);
	}
	
	// ------------------------------------------------------- Selecting accounts
	
	public void setSelectedAccount(Account account) {
		currentSelectedAccount = account;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public void selectAccount(int index) {
		currentSelectedAccount = accounts.get(index);
		//System.out.println(accounts.get(index));
		//setSelectedAccount(accounts.get(index));
	}
	
	// ------------------------------------------------------- View Account
	
	public void generateTransactions(JTextArea transactions) {
		transactions.setText("");
		if(currentSelectedAccount.getAccountType() == "Savings Account") {
			transactions.setText(currentSelectedAccount.getAccountType() +"\n");
			transactions.append("Account Description: " + currentSelectedAccount.getAccountDescription() + "\n");
			transactions.append("Account Type: " + currentSelectedAccount.getAccountType() +"\n");
			transactions.append("Balance: $" + currentSelectedAccount.getBalance());
		}
		
		if(currentSelectedAccount.getAccountType() == "Airmile Savings Account") {
			String airmilesBalance = String.valueOf(currentSelectedAccount.getAirmilesBalance());
			transactions.setText(currentSelectedAccount.getAccountType() + "\n");
			transactions.append("Airmiles Balance: " + airmilesBalance + "\n");
			transactions.append("Account Description: " + currentSelectedAccount.getAccountDescription() + "\n");
			transactions.append("Account Type: " + currentSelectedAccount.getAccountType() +"\n");
			transactions.append("Balance: $" + currentSelectedAccount.getBalance());
		}
		
	}

	
	
	
	
	
	
}
