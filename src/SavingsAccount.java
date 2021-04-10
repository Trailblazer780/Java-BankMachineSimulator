
public class SavingsAccount extends Account {
	
	private double withdrawFee;
	
	public SavingsAccount() {
		withdrawFee = 0.5;
	}
	
	public void chargeWithdrawFee() {
		balance = balance - withdrawFee;
	}
}
