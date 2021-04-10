import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class createAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtAccountDescription;
	private JTextField textField;
	private Model model;
	
	// Button Variables
	private JButton btnOkCreate;
	private JButton btnCancelCreate;
	
	// Other Variables
	private JList<String> list;
	private DefaultListModel<String> listModel = new DefaultListModel();
	
	public createAccount(Model myModel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblSelectAccountType = new JLabel("Select Account Type:");
		lblSelectAccountType.setBounds(10, 45, 133, 14);
		contentPane.add(lblSelectAccountType);
		
		
		listModel.addElement("Savings Account");
		listModel.addElement("Airmiles Savings Account");
		list = new JList(listModel);
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(153, 45, 181, 43);
		contentPane.add(list);
		
		JLabel lblAccountDescription = new JLabel("Account Description:");
		lblAccountDescription.setBounds(10, 99, 133, 14);
		contentPane.add(lblAccountDescription);
		
		txtAccountDescription = new JTextField();
		txtAccountDescription.setBounds(153, 96, 285, 20);
		contentPane.add(txtAccountDescription);
		txtAccountDescription.setColumns(10);
		
		JLabel lblStartingBalance = new JLabel("Starting Balance: $");
		lblStartingBalance.setBounds(10, 130, 133, 14);
		contentPane.add(lblStartingBalance);
		
		textField = new JTextField();
		textField.setBounds(153, 127, 102, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnOkCreate = new JButton("Ok");
		btnOkCreate.setBounds(166, 178, 89, 23);
		contentPane.add(btnOkCreate);
		
		btnCancelCreate = new JButton("Cancel");
		btnCancelCreate.setBounds(311, 178, 89, 23);
		contentPane.add(btnCancelCreate);
		
		model = myModel;
	}
	
	
	// --------------------------------------------------------------- Public Methods
	
	public void addOkButtonListener(ActionListener okButton) {
		btnOkCreate.addActionListener(okButton);
	}
	
	public void addCanelButtonListener(ActionListener cancelButton) {
		btnCancelCreate.addActionListener(cancelButton);
	}
	
	public void getSelectedAccountIndex() {
		 int accountSelected = 0;

		if(list.getSelectedIndex() == 0) {
			accountSelected = 1;
		}
		else if (list.getSelectedIndex() == 1) {
			accountSelected = 2;
		}
		
		model.getSelectedAccountIndex(accountSelected);
	}
	
	// --------------------------------------------------------------- Changing Views
	
	public void createAccountVisible() {
		this.setVisible(true);
	}
	
	public void windowDisappear() {
		this.setVisible(false);
	}
	
}
