
public class AirmileSavingsAccount extends Account {
	
	private double withdrawFee;
	private int airmiles;
	private String accountType;
	
	public AirmileSavingsAccount() {
		withdrawFee = 0.75;
		airmiles = 0;
		accountType = "Airmile Savings Account";
	}
	
	public void initialAirMiles() {
		airmiles = airmiles + 10;
	}
	
	public void addAirmiles(int airmilesToAdd) {
		airmiles = airmiles + airmilesToAdd;
	}
	
	public double getWithdrawFee() {
		return withdrawFee;
	}
	
	public int getAirmilesBalance() {
		return airmiles;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAirmilesBalance(int miles) {
		airmiles = miles;
	}


}
