import java.awt.BorderLayout;
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
		lblSelectAccountType.setBounds(10, 45, 102, 14);
		contentPane.add(lblSelectAccountType);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(122, 45, 102, 35);
		contentPane.add(list);
		
		JLabel lblAccountDescription = new JLabel("Account Description:");
		lblAccountDescription.setBounds(10, 94, 102, 14);
		contentPane.add(lblAccountDescription);
		
		txtAccountDescription = new JTextField();
		txtAccountDescription.setBounds(122, 91, 285, 20);
		contentPane.add(txtAccountDescription);
		txtAccountDescription.setColumns(10);
		
		JLabel lblStartingBalance = new JLabel("Starting Balance: $");
		lblStartingBalance.setBounds(10, 130, 102, 14);
		contentPane.add(lblStartingBalance);
		
		textField = new JTextField();
		textField.setBounds(122, 127, 102, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOkCreate = new JButton("Ok");
		btnOkCreate.setBounds(69, 178, 89, 23);
		contentPane.add(btnOkCreate);
		
		JButton btnCancelCreate = new JButton("Cancel");
		btnCancelCreate.setBounds(182, 178, 89, 23);
		contentPane.add(btnCancelCreate);
		
		model = myModel;
	}
	
	
	// ---------------------------------------------------- Public Methods
	
	public void createAccountVisible() {
		this.setVisible(true);
	}
	
}
