package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class SemesterAvg1 {

	DecimalFormat dc = new DecimalFormat();
	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg1 window = new SemesterAvg1();
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
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 471, 278);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Grade1prompt = new JLabel("Enter first grade:");
		Grade1prompt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grade1prompt.setBounds(30, 30, 136, 71);
		panel.add(Grade1prompt);
		
		grade1 = new JTextField();
		grade1.setBounds(238, 50, 116, 34);
		panel.add(grade1);
		grade1.setColumns(10);
		
		JLabel Grade2prompt = new JLabel("Enter second grade:");
		Grade2prompt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grade2prompt.setBounds(30, 83, 136, 71);
		panel.add(Grade2prompt);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(238, 103, 116, 34);
		panel.add(grade2);
	
		JLabel Grade3prompt = new JLabel("Enter third grade:");
		Grade3prompt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Grade3prompt.setBounds(30, 139, 136, 71);
		panel.add(Grade3prompt);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(238, 159, 116, 34);
		panel.add(grade3);
		
		JButton avgbutton = new JButton("Average");
		avgbutton.setBounds(30, 221, 89, 23);
		panel.add(avgbutton);
		
		JLabel Disp = new JLabel("New label");
		Disp.setBounds(260, 32, 104, 179);
		panel.add(Disp);
			
        avgbutton.addActionListener(new ActionListener() 
        {
			
			public void actionPerformed(ActionEvent e) 
			{
					
		
	
			double GrTx1 = Double.parseDouble(grade1.getText());
			double GrTx2 = Double.parseDouble(grade2.getText());
			double GrTx3 = Double.parseDouble(grade3.getText());
				
			double Average = (GrTx1 + GrTx2 + GrTx3)/3;
				
			Disp.setText(Double.toString(Average));
			Disp.setText(dc.format(Average));
				
			}
		     
        
	
        }
	}
	
}

			
}


