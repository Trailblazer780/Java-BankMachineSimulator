
public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		mainMenu menuMain = new mainMenu(model);
		Controller controller = new Controller(model, menuMain);
		menuMain.setVisible(true);
	}

}
