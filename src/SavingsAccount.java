
public class SavingsAccount extends Account {
	
	private double withdrawFee;
	private String accountType;
	
	public SavingsAccount() {
		withdrawFee = 0.5;
		accountType = "Savings Account";
	}
	
	public void chargeWithdrawFee() {
		balance = balance - withdrawFee;
	}
	
	public String getAccountType() {
		return accountType;
	}
}
