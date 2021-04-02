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

public class selectAccount extends JFrame {

	private JPanel contentPane;
	private Model model;

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
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(93, 37, 151, 155);
		contentPane.add(list);
		
		JButton btnOkSelectAcc = new JButton("Ok");
		btnOkSelectAcc.setBounds(93, 223, 89, 23);
		contentPane.add(btnOkSelectAcc);
		
		JButton btnCancelAcc = new JButton("Cancel");
		btnCancelAcc.setBounds(203, 223, 89, 23);
		contentPane.add(btnCancelAcc);
		
		model = myModel;
	}
	
	// ---------------------------------------------------- Public Methods
	public void selectAccountVisible() {
		this.setVisible(true);
	}

}
