import java.awt.event.ActionEvent;

public class Controller {
	
	private Model model;
	private mainMenu mainMenu;
	private createAccount createAcc;
	private deleteAccount deleteAcc;
	private deposit makeDeposit;
	private selectAccount selectAcc;
	private viewAccount viewAcc;
	private withdrawl withdrawlAcc;
	
	public Controller(Model myModel, mainMenu menuMain, createAccount create, deleteAccount delete, deposit depositAcc, selectAccount select, viewAccount view, withdrawl withdrawlFromAcc) {
		model = myModel;
		mainMenu = menuMain;
		createAcc = create;
		deleteAcc = delete;
		makeDeposit = depositAcc;
		selectAcc = select;
		viewAcc = view;
		withdrawlAcc = withdrawlFromAcc;
		
		// ------------------------------------------------ Main Menu Action Listeners
		mainMenu.addQuitButtonListener((ActionEvent e) -> {
			System.out.println("clicked - Main Menu - Quit Button");
			System.exit(0);
		});
		
		mainMenu.addSelectButtonListener((ActionEvent e) -> {
			System.out.println("clicked - Main Menu - Select Button");
			mainMenu.windowDisappear();
			selectAcc.selectAccountVisible();
		});
		
		mainMenu.addCreateButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			createAcc.createAccountVisible();
			System.out.println("clicked - Main Menu - Create Button");
		});
		
		mainMenu.addDeleteButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			deleteAcc.deleteAccountVisible();
			System.out.println("clicked - Main Menu - Delete Button");
		});
		
		mainMenu.addDepositButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			makeDeposit.depositAccountVisible();
			System.out.println("clicked - Main Menu - Deposit Button");
		});
		
		mainMenu.addViewAccButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			viewAcc.viewAccountVisible();
			System.out.println("clicked - Main Menu - View Button");
		});
		
		mainMenu.addWithdrawlButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			withdrawlAcc.withdrawlAccountVisible();
			System.out.println("clicked - Main Menu - Withdrawl Button");
		});
		
		// ------------------------------------------------ Create Account Action Listeners
		
		createAcc.addOkButtonListener((ActionEvent e) -> {
			createAcc.windowDisappear();
			mainMenu.windowAppear();
			System.out.println("clicked - Create Menu - Ok Button");
			// ------------- Do Stuff -------------
		});
		
		createAcc.addCanelButtonListener((ActionEvent e) -> {
			createAcc.windowDisappear();
			mainMenu.windowAppear();
			System.out.println("clicked - Create Menu - Cancel Button");
		});
		
		// ------------------------------------------------ Delete Account Action Listeners
		
		
		
		
	}
}
	
