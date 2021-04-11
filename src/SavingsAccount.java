
public class SavingsAccount extends Account {
	
	private double withdrawFee;
	private String accountType;
	
	public SavingsAccount() {
		withdrawFee = 0.5;
		accountType = "Savings Account";
	}
	
	public double getWithdrawFee() {
		return withdrawFee;
	}
	
	public String getAccountType() {
		return accountType;
	}

	@Override
	public int getAirmilesBalance() {
		return 0;
	}
	

	@Override
	public void setAirmilesBalance(int miles) {
		// TODO Auto-generated method stub
		
	}
}
