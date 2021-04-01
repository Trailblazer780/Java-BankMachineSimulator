import java.awt.BorderLayout;
import java.awt.EventQueue;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit frame = new deposit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public deposit() {
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
		
		JButton btnOkWithdraw = new JButton("Ok");
		btnOkWithdraw.setBounds(160, 123, 89, 23);
		contentPane.add(btnOkWithdraw);
		
		JButton btnCancelWithdraw = new JButton("Cancel");
		btnCancelWithdraw.setBounds(259, 123, 89, 23);
		contentPane.add(btnCancelWithdraw);
		
		txtDepositAmount = new JTextField();
		txtDepositAmount.setBounds(149, 42, 100, 20);
		contentPane.add(txtDepositAmount);
		txtDepositAmount.setColumns(10);
		
		txtDepositDesc = new JTextField();
		txtDepositDesc.setBounds(147, 79, 304, 20);
		contentPane.add(txtDepositDesc);
		txtDepositDesc.setColumns(10);
	}

}
