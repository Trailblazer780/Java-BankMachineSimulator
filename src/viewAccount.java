import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class viewAccount extends JFrame {

	private JPanel contentPane;
	private Model model;

	public viewAccount(Model myModel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApplicationTitle = new JLabel("Bank Machine Simulation V1.0 >");
		lblApplicationTitle.setBounds(10, 11, 181, 23);
		contentPane.add(lblApplicationTitle);
		
		JLabel lblTransactions = new JLabel("Transactions of currently selected account:");
		lblTransactions.setBounds(10, 34, 218, 14);
		contentPane.add(lblTransactions);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 59, 497, 186);
		contentPane.add(scrollPane);
		
		JTextArea txtTransactions = new JTextArea();
		scrollPane.setViewportView(txtTransactions);
		
		JButton btnOkViewAccount = new JButton("Ok");
		btnOkViewAccount.setBounds(10, 256, 89, 23);
		contentPane.add(btnOkViewAccount);
		
		model = myModel;
	}
	
	// ---------------------------------------------------- Public Methods
	
	public void viewAccountVisible() {
		this.setVisible(true);
	}
}
