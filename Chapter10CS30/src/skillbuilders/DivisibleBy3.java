package skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField numInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 409, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 373, 158);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Prompt = new JLabel("Enter an integer:");
		Prompt.setFont(new Font("Tahoma", Font.BOLD, 15));
		Prompt.setBounds(10, 33, 146, 35);
		panel.add(Prompt);
		
		numInput = new JTextField();
		numInput.setBounds(164, 38, 199, 28);
		panel.add(numInput);
		numInput.setColumns(10);
		
		JButton CheckButton = new JButton("Check");
		CheckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
			int numInput.getText()
			
			
			}
		});
		CheckButton.setBounds(21, 86, 115, 45);
		panel.add(CheckButton);
		
		JLabel Divby3text = new JLabel("New label");
		Divby3text.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Divby3text.setBounds(199, 99, 91, 14);
		panel.add(Divby3text);
	}
}
