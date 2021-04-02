import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class withdrawl extends JFrame {

	private JPanel contentPane;
	private JTextField txtWithdrawAmount;
	private JTextField txtTransactionDesc;
	private Model model;

	public withdrawl(Model myModel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblWithdrawAmount = new JLabel("Enter Amount to withdraw: $");
		lblWithdrawAmount.setBounds(10, 45, 146, 14);
		contentPane.add(lblWithdrawAmount);
		
		txtWithdrawAmount = new JTextField();
		txtWithdrawAmount.setBounds(160, 45, 95, 20);
		contentPane.add(txtWithdrawAmount);
		txtWithdrawAmount.setColumns(10);
		
		JLabel lblTransactionDesc = new JLabel("Transaction Description:");
		lblTransactionDesc.setBounds(22, 82, 121, 14);
		contentPane.add(lblTransactionDesc);
		
		txtTransactionDesc = new JTextField();
		txtTransactionDesc.setColumns(10);
		txtTransactionDesc.setBounds(160, 79, 267, 20);
		contentPane.add(txtTransactionDesc);
		
		JButton btnOkWithdraw = new JButton("Ok");
		btnOkWithdraw.setBounds(160, 123, 89, 23);
		contentPane.add(btnOkWithdraw);
		
		JButton btnCancelWithdraw = new JButton("Cancel");
		btnCancelWithdraw.setBounds(259, 123, 89, 23);
		contentPane.add(btnCancelWithdraw);
		
		model = myModel;
	}
	
	public void withdrawlAccountVisible() {
		this.setVisible(true);
	}

}
