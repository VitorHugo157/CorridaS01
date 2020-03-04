package view;
import java.awt.EventQueue;
import controller.SapoController;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CorridaSapo extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorridaSapo frame = new CorridaSapo();
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
	public CorridaSapo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 78, 893, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 144, 893, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 209, 893, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 275, 893, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 347, 893, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 419, 893, 2);
		contentPane.add(separator_5);
		
		JLabel lblSapo1 = new JLabel("Sapo1");
		lblSapo1.setIcon(new ImageIcon("C:\\Users\\f-win\\Downloads\\Ferry1.png"));
		lblSapo1.setBounds(10, 85, 62, 48);
		contentPane.add(lblSapo1);
		validate();
		
		JLabel lblSapo2 = new JLabel("Sapo2");
		lblSapo2.setBounds(10, 172, 46, 14);
		contentPane.add(lblSapo2);
		
		JLabel lblSapo3 = new JLabel("Sapo3");
		lblSapo3.setBounds(10, 236, 46, 14);
		contentPane.add(lblSapo3);
		
		JLabel lblSapo4 = new JLabel("Sapo4");
		lblSapo4.setBounds(10, 303, 46, 14);
		contentPane.add(lblSapo4);
		
		JLabel lblSapo5 = new JLabel("Sapo5");
		lblSapo5.setBounds(10, 378, 46, 14);
		contentPane.add(lblSapo5);
		
		JButton btnStartRace = new JButton("StartRace");
		btnStartRace.setBounds(450, 477, 89, 23);
		contentPane.add(btnStartRace);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(902, 78, 19, 342);
		contentPane.add(separator_6);
		
		SapoController sapoController = new SapoController(lblSapo1, lblSapo2, lblSapo3, lblSapo4, lblSapo5, btnStartRace);
		btnStartRace.addActionListener(sapoController);
	}
}
