package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class SemAvg {
	
	DecimalFormat dc = new DecimalFormat();
	private JFrame frame;
	private JTextField GrTx1;
	private JTextField GrTx3;
	private JTextField GrTx2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemAvg window = new SemAvg();
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
	public SemAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 590, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Disp = new JLabel("");
		Disp.setBounds(45, 190, 499, 63);
		panel.add(Disp);
		
		GrTx1 = new JTextField();
		GrTx1.setForeground(Color.BLACK);
		GrTx1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GrTx1.setText("First grade:");
		GrTx1.setBounds(45, 46, 148, 35);
		panel.add(GrTx1);
		GrTx1.setColumns(10);
		
		GrTx3 = new JTextField();
		GrTx3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GrTx3.setText("Third grade:");
		GrTx3.setColumns(10);
		GrTx3.setBounds(361, 46, 148, 35);
		panel.add(GrTx3);
		
		GrTx2 = new JTextField();
		GrTx2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GrTx2.setText("Second grade:");
		GrTx2.setColumns(10);
		GrTx2.setBounds(203, 46, 148, 35);
		panel.add(GrTx2);
		
		JButton avgbutton = new JButton("Get Average");
		avgbutton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		avgbutton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				double GrT = Double.parseDouble(GrTx1.getText());
				double GrTw = Double.parseDouble(GrTx2.getText());
				double GrTs = Double.parseDouble(GrTx3.getText());
					
				double Average = (GrTx1 + GrTx2 + GrTx3)/3;
					
				Disp.setText(Double.toString(Average));
				Disp.setText(dc.format(Average));	
				
			}
		});
		avgbutton.setBounds(177, 116, 187, 23);
		panel.add(avgbutton);
		
	}

}
