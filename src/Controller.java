import java.awt.event.ActionEvent;

public class Controller {
	
	private Model model;
	private mainMenu mainMenu;
	
	public Controller(Model myModel, mainMenu menuMain) {
		model = myModel;
		mainMenu = menuMain;
		
		mainMenu.addQuitButtonListener((ActionEvent e) -> {
			System.exit(0);
		});
		
	}
}
	
