import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class deposit extends JFrame {

	private JPanel contentPane;
	private JTextField txtDepositAmount;
	private JTextField txtDepositDesc;
	private Model model;
	
	// Button Variables
	private JButton btnOkDeposit;
	private JButton btnCancelDeposit;


	public deposit(Model myModel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblDepositAmount = new JLabel("Enter Amount to deposit: $");
		lblDepositAmount.setBounds(10, 45, 146, 14);
		contentPane.add(lblDepositAmount);
		
		
		JLabel lblTransactionDesc = new JLabel("Transaction Description:");
		lblTransactionDesc.setBounds(22, 82, 121, 14);
		contentPane.add(lblTransactionDesc);
		
		btnOkDeposit = new JButton("Ok");
		btnOkDeposit.setBounds(160, 123, 89, 23);
		contentPane.add(btnOkDeposit);
		
		btnCancelDeposit = new JButton("Cancel");
		btnCancelDeposit.setBounds(259, 123, 89, 23);
		contentPane.add(btnCancelDeposit);
		
		txtDepositAmount = new JTextField();
		txtDepositAmount.setBounds(149, 42, 100, 20);
		contentPane.add(txtDepositAmount);
		txtDepositAmount.setColumns(10);
		
		txtDepositDesc = new JTextField();
		txtDepositDesc.setBounds(147, 79, 304, 20);
		contentPane.add(txtDepositDesc);
		txtDepositDesc.setColumns(10);
		
		model = myModel;
	}
	
	// --------------------------------------------------------------- Public Methods
	
	public void addOkButtonListener(ActionListener okButton) {
		btnOkDeposit.addActionListener(okButton);
	}
	
	public void addCancelButtonListener(ActionListener cancelButton) {
		btnCancelDeposit.addActionListener(cancelButton);
	}
	
	
	// --------------------------------------------------------------- Changing Views
	
	public void depositAccountVisible() {
		this.setVisible(true);
	}
	
	public void windowDisappear() {
		this.setVisible(false);
	}
	
	

}
