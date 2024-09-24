package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Demo3 {

	private JFrame frame;
	private JTextField FNT;
	private JTextField L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 window = new Demo3();
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
	public Demo3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon cres = new ImageIcon("../Chapter10CS30/src/IMG/CH school.png");
		ImageIcon Pear = new ImageIcon("../Chapter10CS30/src/IMG/Pearson.jpg");
		ImageIcon Wes = new ImageIcon("../Chapter10CS30/src/IMG/Western school.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		FNT = new JTextField();
		
		
		
		JPanel LNT = new JPanel();
		LNT.setBounds(10, 11, 601, 397);
		frame.getContentPane().add(LNT);
		LNT.setLayout(null);
		LNT.add(FNT);
		
		//First name 
		
		FNT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			FNT.setText("");	
				
			}
		});
		FNT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FNT.setText("First name:");
		FNT.setBounds(35, 40, 145, 20);
		LNT.add(FNT);
		FNT.setColumns(10);
		
		
		//Last name
		
		L = new JTextField();
		L.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				L.setText("");
		}
		});
		L.setFont(new Font("Tahoma", Font.PLAIN, 16));
		L.setText("Last name:");
		L.setHorizontalAlignment(SwingConstants.LEFT);
		L.setColumns(10);
		L.setBounds(200, 40, 153, 20);
		LNT.add(L);
		
		
		JComboBox Grades = new JComboBox();
		Grades.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grades.setModel(new DefaultComboBoxModel(new String[] {"Select grade", "10", "11", "12"}));
		Grades.setBounds(35, 73, 145, 45);
		LNT.add(Grades);
		
		JComboBox Schools = new JComboBox();
		Schools.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Schools.setModel(new DefaultComboBoxModel(new String[] {"Select school", "Crescent ", "Pearson", "Western"}));
		Schools.setBounds(192, 71, 161, 48);
		LNT.add(Schools);
		
		JTextArea Disp = new JTextArea();
		Disp.setBounds(35, 127, 318, 66);
		LNT.add(Disp);
		
		JLabel IMG = new JLabel("");
		IMG.setBounds(33, 204, 320, 129);
		LNT.add(IMG);
		
		//////
		JButton Done = new JButton("DONE");
		Done.setForeground(new Color(255, 128, 192));
		Done.setFont(new Font("Tahoma", Font.PLAIN, 21));
		Done.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) 
			{
			
				
				String Grades1 = "";
				String school1 = "";
				String FN = FNT.getText();
				String LN = L.getText();
				
				//Grades
				if(Grades.getSelectedItem().equals("10"))
				{
				}
		        else if(Grades.getSelectedItem().equals("11"))	
				{
				Grades1 = "11";
				}
				else
				{
				Grades1 = "12";
				}
				
				//Schools
				if(Schools.getSelectedItem().equals("Crescent"))
				{
				school1 = "Crescent";
				IMG.setIcon(cres);
				}
		        else if(Schools.getSelectedItem().equals("Pearson"))	
				{
				school1 = "Pearson";
				IMG.setIcon(Pear);
				}
				else
				{
				school1 = "Western";
				IMG.setIcon(Wes);
				}
				
				Disp.setText(FNT + " " +
				L + " is in grade: "+
				Grades1 + " "+ "and goes to "+ school1
				);
				
		}
		});
		Done.setForeground(Color.BLUE);
		Done.setFont(new Font("Tahoma", Font.BOLD, 16));
		Done.setBounds(409, 34, 123, 200);
		LNT.add(Done);
		
		
		
			
	}
		
		
	}

