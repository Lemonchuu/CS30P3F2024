package skillbuilders;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class LatinPlantname {
	private JFrame frmLatinPlantNames;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantname window = new LatinPlantname();
					window.frmLatinPlantNames.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public LatinPlantname() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLatinPlantNames = new JFrame();
		frmLatinPlantNames.setTitle("Latin plant names");
		frmLatinPlantNames.setBounds(100, 100, 514, 331);
		frmLatinPlantNames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLatinPlantNames.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 476, 269);
		frmLatinPlantNames.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Plantnameprompt = new JLabel("Select a plant name:");
		Plantnameprompt.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Plantnameprompt.setBounds(137, 11, 223, 25);
		panel.add(Plantnameprompt);
		
		
	    JComboBox plantsnames = new JComboBox();
	    plantsnames.setFont(new Font("Tahoma", Font.PLAIN, 14));
		plantsnames.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "sage"}));
		plantsnames.setBounds(159, 47, 129, 22);
		panel.add(plantsnames);
		
		JLabel LPN = new JLabel();
		LPN.setText("\"Ocimum\" \"Lavamdula spica\" \"Apium\" \"Slavia\"");
		LPN.setBounds(96, 95, 338, 74);
		panel.add(LPN);
	}
}