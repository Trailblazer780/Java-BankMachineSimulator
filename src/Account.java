import java.util.ArrayList;

public abstract class Account implements java.io.Serializable {
	
	protected double balance;
	private int accountNumber;
	private String description;
	private String accountType;
	private String transactionDescription;
	ArrayList<String> transactions = new ArrayList<String>();
	
	// ------------------------------------------- Constructor Method
	public Account() {
		balance = 0;
	}
	
	// ------------------------------------------- Gets / Sets 
	public void setStartingBalance(double initialDeposit) {
		balance = initialDeposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAccountNumber(int accNumb) {
		accountNumber = accNumb;
	}
	
	public void setAccountDescription(String desc) {
		description = desc;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountDescription() {
		return description;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setTransactionDescription(String desc) {
		transactionDescription = desc;
	}
	
	public String getTransactionDescription() {
		return transactionDescription;
	}
	
	public ArrayList<String> getTransactions() {
		return transactions;
	}
	
	// -------------------------------------------- Public Methods
	
	
	public void chargeWithdrawFee(double fee) {
		balance = balance - fee;
	}
	
	public void addTransactionToHistory(String historyToAdd) {
		transactions.add(historyToAdd);
	}
	
	public abstract double getWithdrawFee();
	public abstract int getAirmilesBalance();
	public abstract void setAirmilesBalance(int miles);
	public abstract void addAirMiles(int newMiles);
	
	
	
}
