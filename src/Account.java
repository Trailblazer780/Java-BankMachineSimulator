
public abstract class Account {
	
	protected double balance;
	private int accountNumber;
	
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
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	// -------------------------------------------- Public Methods
	
	public void subtractBalance(double withdrawAmount) {
		balance = balance - withdrawAmount;
	}
	
	public void addBalance(double depositAmount) {
		balance = balance + depositAmount;
	}
	
	
	
}
