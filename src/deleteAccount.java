import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class deleteAccount extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteAccount frame = new deleteAccount();
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
	public deleteAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblDeleteAcc = new JLabel("Delete Current Account?");
		lblDeleteAcc.setBounds(10, 38, 135, 14);
		contentPane.add(lblDeleteAcc);
		
		JLabel lblCurrentAccount = new JLabel("");
		lblCurrentAccount.setBounds(143, 38, 154, 14);
		contentPane.add(lblCurrentAccount);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(116, 63, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnDeleteCancel = new JButton("Cancel");
		btnDeleteCancel.setBounds(215, 63, 89, 23);
		contentPane.add(btnDeleteCancel);
	}

}