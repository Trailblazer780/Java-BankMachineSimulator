
public abstract class Account {
	
	protected double balance;
	private int accountNumber;
	private String description;
	private String accountType;
	
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
	
	// -------------------------------------------- Public Methods
	
	public void subtractBalance(double withdrawAmount) {
		balance = balance - withdrawAmount;
	}
	
	public void addBalance(double depositAmount) {
		balance = balance + depositAmount;
	}
	
	public void chargeWithdrawFee(double fee) {
		balance = balance - fee;
	}
	
	public abstract int getAirmilesBalance();
	public abstract void setAirmilesBalance(int miles);
	
	
	
}
