
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Model {
	
	
	private Account currentSelectedAccount;
	ArrayList<Account> accounts = new ArrayList<Account>();
	private int createAccountIndex;
	private int newAccountNumber;
	private String accountDescription;
	private double initialDeposit;
	private boolean enoughAvailable;
	private int accountsCreated;
	
	public Model() {
		createAccountIndex = 0;
		accountsCreated = 0;
		setAccountCount();
		//enoughAvailable;
	}
	
	// ------------------------------------------------------- Button Disabler
//	public void disableButtons(JButton disable) {
//			disable.setEnabled(false);
//	}
	
	public void setAccountCount() {
		accountsCreated = accounts.size(); 
	}
	
	public int getAccountCount() {
		return accountsCreated; 
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
			airmileSavings.addAirmiles(10);
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
			transactions.append("Balance: $" + currentSelectedAccount.getBalance() + "\n");
			populateHistory(transactions);
		}
		
		if(currentSelectedAccount.getAccountType() == "Airmile Savings Account") {
			String airmilesBalance = String.valueOf(currentSelectedAccount.getAirmilesBalance());
			transactions.setText(currentSelectedAccount.getAccountType() + "\n");
			transactions.append("Airmiles Balance: " + airmilesBalance + "\n");
			transactions.append("Account Description: " + currentSelectedAccount.getAccountDescription() + "\n");
			transactions.append("Account Type: " + currentSelectedAccount.getAccountType() +"\n");
			transactions.append("Balance: $" + currentSelectedAccount.getBalance()+ "\n");
			populateHistory(transactions);
		}
		
	}
	
	public void populateHistory(JTextArea trans) {
		ArrayList<String> transactions = currentSelectedAccount.getTransactions();
		
		for (int i=0; i<transactions.size(); i++) {
			trans.append(transactions.get(i)+"\n");
		}
	}
	

	// ------------------------------------------------------- Deposit
	
	public void deposit(String toDeposit, String description) {
		double currentBalance = currentSelectedAccount.getBalance();
		double toDepositConvert = Double.parseDouble(toDeposit);
		
		String transactionDescription = description;
		String transactionDetails = "";
		String date = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").format(new Date());
		String dateNoDot = date.replace(".", ""); 
		transactionDetails = dateNoDot+": $" + toDepositConvert + " ["+transactionDescription+"]";
		currentSelectedAccount.addTransactionToHistory(transactionDetails);
		currentSelectedAccount.setBalance(currentBalance + toDepositConvert);
		
	}
	
	public void getNewTransactionDescription(String description) {
		currentSelectedAccount.setTransactionDescription(description);
	}
	
	// ------------------------------------------------------- Withdraw
	
	public void withdraw(String toWithdraw, String description) {
		double currentBalance = currentSelectedAccount.getBalance();
		double toWithdrawConvert = Double.parseDouble(toWithdraw);
		
		if((currentBalance - toWithdrawConvert - currentSelectedAccount.getWithdrawFee()) >= 0 ) {
			enoughAvailable = true;
			String transactionDescription = description;
			String transactionDetails = "";
			String date = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").format(new Date());
			String dateNoDot = date.replace(".", ""); 
			transactionDetails = dateNoDot+": $-" + toWithdrawConvert + " ["+transactionDescription+"]";
			currentSelectedAccount.addTransactionToHistory(transactionDetails);
			currentSelectedAccount.setBalance(currentBalance - toWithdrawConvert - currentSelectedAccount.getWithdrawFee());
		}
		else{
			enoughAvailable = false;
		}
		
	}
	
	public boolean enoughFunds() {
		return enoughAvailable;
	}
	
	// ------------------------------------------------------- Delete Accounts
	
	public void deleteAccount() {
		accounts.remove(currentSelectedAccount);
		setAccountCount();
	}
	
	
	
	
	
	
	
	
	
}
