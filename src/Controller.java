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
			System.out.println("clicked - Quit Button");
			System.exit(0);
		});
		
		mainMenu.addSelectButtonListener((ActionEvent e) -> {
			System.out.println("clicked - Select Button");
			mainMenu.windowDisappear();
			selectAcc.selectAccountVisible();
		});
		
		mainMenu.addCreateButtonListener((ActionEvent e) -> {
			mainMenu.windowDisappear();
			createAcc.createAccountVisible();
			System.out.println("clicked - Create Button");
		});
		
		
	}
}
	
