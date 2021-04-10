import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class selectAccount extends JFrame {

	private JPanel contentPane;
	private Model model;
	
	private JList<String> list;
	private DefaultListModel<String> listModel = new DefaultListModel();
	ArrayList<Account> accountsToSelect = new ArrayList<Account>();
	
	
	// Button Variables
	private JButton btnOkSelectAcc;
	private JButton btnCancelSelectAcc;

	public selectAccount(Model myModel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblSelectAccount = new JLabel("Select Account:");
		lblSelectAccount.setBounds(10, 38, 80, 14);
		contentPane.add(lblSelectAccount);
		
		list = new JList(listModel);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(93, 37, 151, 155);
		contentPane.add(list);
		
		btnOkSelectAcc = new JButton("Ok");
		btnOkSelectAcc.setBounds(93, 223, 89, 23);
		contentPane.add(btnOkSelectAcc);
		
		btnCancelSelectAcc = new JButton("Cancel");
		btnCancelSelectAcc.setBounds(203, 223, 89, 23);
		contentPane.add(btnCancelSelectAcc);
		
		model = myModel;
	}
	
	// ---------------------------------------------------- Public Methods
	
	public void addOkButtonListener(ActionListener okButton) {
		btnOkSelectAcc.addActionListener(okButton);
	}
	
	public void addCancelButtonListener(ActionListener cancelButton) {
		btnCancelSelectAcc.addActionListener(cancelButton);
	}
	
	public void populateSelectionList() {
		resetSelectionList();
		accountsToSelect = model.getAccounts();
		for (int i=0; i<accountsToSelect.size(); i++) {
			listModel.addElement(accountsToSelect.get(i).getAccountDescription());
		}
	}
	
	public void getAccountIndex() {
		int index = list.getSelectedIndex();
		System.out.println(index);
		model.selectAccount(index);
	}
	
	public void resetSelectionList() {
		listModel.removeAllElements();
	}


	// --------------------------------------------------------------- Changing Views
	
	public void selectAccountVisible() {
		this.setVisible(true);
	}
	
	public void windowDisappear() {
		this.setVisible(false);
	}
}
