package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lb_1;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerPage frame = new ManagerPage();
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
	public ManagerPage() {
		setBackground(new Color(240, 248, 255));
		setTitle("Manager Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Back Manager\r\n");
		lblNewLabel.setBounds(434, 0, 192, 35);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SF", "Fremont", "Oakland"}));
		comboBox.setBounds(10, 213, 191, 56);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_1.setText(comboBox.getSelectedItem().toString());
			}
		});
		btnNewButton.setBounds(10, 291, 191, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"First Name", "Last Name", "Ocupation", "Days Working", "Price", "Any Problems"},
				{"Jessica", "Johnson", "P.Trainer", "M/TH", "50.00", "0"},
				{"James", "Rodriguez", "M.Service Rep.", "T/TH", "45.00", "0"},
				{"Victoria", "Hernandez", "Kid's Club Staff", "M/W", "45.00", "1"},
				{"Patrick", "Star", "P.Trainer", "T/W/FRI", "50.00", "1"},
			},
			new String[] {
				"First Name", "Last Name", "Ocupation", "Days Working", "Price", "Any Problems"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(83);
		table.getColumnModel().getColumn(4).setMinWidth(27);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.setBackground(new Color(51, 102, 153));
		table.setBounds(10, 49, 437, 113);
		contentPane.add(table);
		
		JButton btnNewButton_2 = new JButton("Log-Out?");
		btnNewButton_2.setBounds(10, 331, 191, 23);
		contentPane.add(btnNewButton_2);
		
		
		lb_1 = new JLabel("");
		lb_1.setBounds(237, 242, 362, 153);
		contentPane.add(lb_1);
		
		JTextPane txtpnHereIsThe = new JTextPane();
		txtpnHereIsThe.setText("Here is the infomation for the emplyees, please select the location to see the equipment status currently. ");
		txtpnHereIsThe.setBounds(237, 173, 424, 35);
		contentPane.add(txtpnHereIsThe);
	}
}

