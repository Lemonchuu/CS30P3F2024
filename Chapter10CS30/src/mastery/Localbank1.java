package mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Localbank1 {

	private JFrame frame;
	private JTextField Acctnum;
	private JTextField AMT;
	private JTextField fname;
	private JTextField lname;
	private JTextField Bgbalence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Localbank1 window = new Localbank1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Localbank1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 441, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		Acctnum = new JTextField();
		Acctnum.setForeground(new Color(255, 0, 0));
		Acctnum.addMouseListener(new MouseAdapter() {
			
			///
			public void mouseClicked(MouseEvent e) {
			}
		});
		Acctnum.setText("Account number:");
		Acctnum.setBounds(23, 77, 314, 20);
		frame.getContentPane().add(Acctnum);
		Acctnum.setColumns(10);
		
		AMT = new JTextField();
		AMT.setForeground(new Color(255, 0, 0));
		AMT.setText("Enter amount:");
		AMT.setColumns(10);
		AMT.setBounds(23, 108, 314, 20);
		frame.getContentPane().add(AMT);
		
		fname = new JTextField();
		fname.setText("First name:");
		fname.setColumns(10);
		fname.setBounds(23, 139, 314, 20);
		frame.getContentPane().add(fname);
		
		lname = new JTextField();
		lname.setText("Last name:");
		lname.setColumns(10);
		lname.setBounds(23, 170, 314, 20);
		frame.getContentPane().add(lname);
		
		Bgbalence = new JTextField();
		Bgbalence.setText("Beginning Balance:");
		Bgbalence.setColumns(10);
		Bgbalence.setBounds(23, 207, 314, 20);
		frame.getContentPane().add(Bgbalence);
		
		JLabel AcctInfo = new JLabel("New label");
		AcctInfo.setBounds(23, 238, 366, 61);
		frame.getContentPane().add(AcctInfo);
		
		JButton btnNewButton = new JButton("Process/transaction:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 299, 227, 47);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox Bank = new JComboBox();
		Bank.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			 
			if(Bank.getSelectedItem().equals("Deposit")) 
			{
			 Acctnum.setForeground(Color.red);	
			 AMT.setForeground(Color.red);	
			}
			else if(Bank.getSelectedItem().equals("Withdrawl")) 
			{	
				
			}
			}
		    });
		Bank.setModel(new DefaultComboBoxModel(new String[] {"Select and action", "Deposit", "Withdrawl", "Balance", "Add account", "Remove"}));
		Bank.setBounds(23, 23, 314, 40);
		frame.getContentPane().add(Bank);
		
		
		
		
	}
}
