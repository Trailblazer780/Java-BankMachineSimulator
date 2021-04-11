import java.awt.BorderLayout;
import java.awt.Color;
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
	private TextFieldValidator txtValidator1;
	private TextFieldValidator txtValidator2;
	private Boolean inputValid = false;
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
		lblDepositAmount.setBounds(10, 45, 171, 14);
		contentPane.add(lblDepositAmount);
		
		
		JLabel lblTransactionDesc = new JLabel("Transaction Description:");
		lblTransactionDesc.setBounds(22, 82, 169, 14);
		contentPane.add(lblTransactionDesc);
		
		btnOkDeposit = new JButton("Ok");
		btnOkDeposit.setBounds(160, 123, 89, 23);
		contentPane.add(btnOkDeposit);
		
		btnCancelDeposit = new JButton("Cancel");
		btnCancelDeposit.setBounds(259, 123, 89, 23);
		contentPane.add(btnCancelDeposit);
		
		txtDepositAmount = new JTextField();
		txtDepositAmount.setBounds(191, 42, 100, 20);
		contentPane.add(txtDepositAmount);
		txtValidator1 = new TextFieldValidator(txtDepositAmount);
		txtValidator1.setRegExp("^(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$");
		txtDepositAmount.setColumns(10);
		
		txtDepositDesc = new JTextField();
		txtDepositDesc.setBounds(189, 79, 304, 20);
		contentPane.add(txtDepositDesc);
		txtValidator2 = new TextFieldValidator(txtDepositDesc);
		txtValidator2.setRegExp("^[A-Za-z]{1,50}$");
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
	
	public void depositMoney() {
		String description = "";
		if(txtValidator1.check() && txtValidator2.check()) {
			txtValidator1.setErrorColor(Color.GRAY);
			txtValidator2.setErrorColor(Color.GRAY);
			String newDeposit = "";
			newDeposit = txtDepositAmount.getText();
			description = txtDepositDesc.getText();
			model.deposit(newDeposit, description);
		}
		else if(txtValidator1.check() == false && txtValidator2.check() == false){
			txtValidator1.setErrorColor(new Color(255,0,0));
			txtValidator2.setErrorColor(new Color(255,0,0));
			System.out.println("error");
		}
		
		else if(txtValidator1.check() && txtValidator2.check() == false) {
			txtValidator2.setErrorColor(new Color(255,0,0));
			System.out.println("error");
		}
		
		else if(txtValidator1.check() == false && txtValidator2.check()) {
			txtValidator1.setErrorColor(new Color(255,0,0));
			System.out.println("error");
		}
			
	}
	
	
	public Boolean checkInput() {
		if(txtValidator1.check() && txtValidator2.check()) {
			inputValid = true;
		}
		else {
			inputValid = false;
		}
		
		return inputValid;
	}
	
	public void reset() {
		txtValidator1.setErrorColor(Color.GRAY);
		txtValidator2.setErrorColor(Color.GRAY);
		txtDepositAmount.setText("");
		txtDepositDesc.setText("");
	}
	
	// --------------------------------------------------------------- Changing Views
	
	public void depositAccountVisible() {
		this.setVisible(true);
	}
	
	public void windowDisappear() {
		this.setVisible(false);
	}
	
	

}
