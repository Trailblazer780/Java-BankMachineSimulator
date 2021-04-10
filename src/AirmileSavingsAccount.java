
public class AirmileSavingsAccount extends Account {
	
	private double withdrawFee;
	private int airmiles;
	
	public AirmileSavingsAccount() {
		withdrawFee = 0.75;
		airmiles = 0;
	}
	
	public void initialAirMiles() {
		airmiles = airmiles + 10;
	}
	
	public void addAirmiles(int airmilesToAdd) {
		airmiles = airmiles + airmilesToAdd;
	}
	
	public void chargeWithdrawFee() {
		balance = balance - withdrawFee;
	}
}
