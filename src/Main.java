
public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		mainMenu menuMain = new mainMenu(model);
		createAccount createAcc = new createAccount(model);
		deleteAccount deleteAcc = new deleteAccount();
		deposit makeDeposit = new deposit();
		selectAccount selectAcc = new selectAccount(model);
		viewAccount viewAcc = new viewAccount();
		withdrawl withdrawlAcc = new withdrawl();
		Controller controller = new Controller(model, menuMain, createAcc, deleteAcc, makeDeposit, selectAcc, viewAcc, withdrawlAcc);
		
		menuMain.setVisible(true);
	}

}
