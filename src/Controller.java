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
			selectAcc.populateSelectionList();
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
			viewAcc.populateTransactions();
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
			//createAcc.windowDisappear();
			// ------------- Do Stuff -------------
			createAcc.getSelectedAccountIndex();
			createAcc.getInitialDeposit();
			createAcc.getAccountDescription();
			if (createAcc.checkInput()) {
				model.createAccount();
				createAcc.windowDisappear();
				mainMenu.buttonEnable();
				mainMenu.windowAppear();
				createAcc.reset();
			}
			//-------------------------------------
			System.out.println("clicked - Create Menu - Ok Button");
		});
		
		createAcc.addCanelButtonListener((ActionEvent e) -> {
			createAcc.windowDisappear();
			mainMenu.windowAppear();
			createAcc.reset();
			System.out.println("clicked - Create Menu - Cancel Button");
		});
		
		// ------------------------------------------------ Delete Account Action Listeners
		
		deleteAcc.addDeleteButtonListener((ActionEvent e) -> {
			model.deleteAccount();
			mainMenu.checkAccountCount();
			System.out.println(mainMenu.checkAccountCount());
			if(mainMenu.checkAccountCount() > 0) {
				mainMenu.buttonEnable();
			}
			else if(mainMenu.checkAccountCount() == 0) {
				mainMenu.buttonDisable();
			}
			
			deleteAcc.windowDisappear();
			// ------------- Do Stuff -------------
			mainMenu.windowAppear();
			System.out.println("clicked - Delete Menu - Delete Button");
		});
		
		deleteAcc.addCanelButtonListener((ActionEvent e) -> {
			deleteAcc.windowDisappear();
			mainMenu.windowAppear();
			System.out.println("clicked - Delete Menu - Canel Button");
		});
		
		// ------------------------------------------------ Deposit Account Action Listeners
		
		makeDeposit.addOkButtonListener((ActionEvent e) -> {
			makeDeposit.depositMoney();
			if (makeDeposit.checkInput()) {
				makeDeposit.windowDisappear();
				mainMenu.windowAppear();
				makeDeposit.reset();
			}
			// ------------- Do Stuff -------------
			
			System.out.println("clicked - Deposit Menu - Ok Button");
		});
		
		makeDeposit.addCancelButtonListener((ActionEvent e) -> {
			makeDeposit.windowDisappear();
			mainMenu.windowAppear();
			makeDeposit.reset();
			System.out.println("clicked - Deposit Menu - Cancel Button");
			
		});
		
		// ------------------------------------------------ Withdraw Account Action Listeners
		
		withdrawlAcc.addOkButtonListener((ActionEvent e) -> {
			withdrawlAcc.withdrawMoney();
			if(withdrawlAcc.checkInput() && model.enoughFunds() == true) {
				withdrawlAcc.windowDisappear();
				mainMenu.windowAppear();
				withdrawlAcc.reset();
			}
			
			if(withdrawlAcc.checkInput() && model.enoughFunds() == false) {
				withdrawlAcc.insufficientFunds();
			}
			System.out.println("clicked - Withdrawl Menu - Ok Button");
		});
		
		withdrawlAcc.addCancelButtonListener((ActionEvent e) -> {
			withdrawlAcc.windowDisappear();
			mainMenu.windowAppear();
			withdrawlAcc.reset();
			System.out.println("clicked - Withdrawl Menu - Cancel Button");
		});
		
		// ------------------------------------------------ Select Account Action Listeners
		
		selectAcc.addOkButtonListener((ActionEvent e) -> {
			selectAcc.getAccountIndex();
			selectAcc.windowDisappear();
			// ------------- Do Stuff -------------
			
			mainMenu.windowAppear();
			System.out.println("clicked - Select Menu - Ok Button");
		});
		
		selectAcc.addCancelButtonListener((ActionEvent e) -> {
			selectAcc.windowDisappear();
			mainMenu.windowAppear();
			System.out.println("clicked - Select Menu - Cancel Button");
		});
		
		// ------------------------------------------------ View Account Action Listeners
		
		
		viewAcc.addOkButtonListener((ActionEvent e) -> {
			viewAcc.windowDisappear();
			mainMenu.windowAppear();
			System.out.println("clicked - View Account Menu - Ok Button");
		});
		
		
		
		
		
		
		
		
	}
}
	
