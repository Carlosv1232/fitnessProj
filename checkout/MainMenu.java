package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel EQ;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Employee Section");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 517);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Jessica", "Johnson", "P.trainer", "1:00PM", "2:10PM", "Sarah", "#12", "Fremont"},
				{"James ", "Rodrieguez", "M.Service Rep", "9:00AM", "5:30PM", "-", "-", ""},
				{"Alex", "Johnes", "Manager", "8:45AM", "6:00PM", "-", "-", "-"},
				{"Victoria", "Herandez", "Kid's Club Staff", "12:00PM", "5:30PM", "-", "#30", "-"},
				{"Lillian", "Anderson", "Front Desk", "9:00AM", "3:30PM", "-", "-", "-"},
				{"Patrick ", "Star", "P.Trainer", "10:00AM", "11:10AM", "Adam", "#3", "Oakland"},
				{"Will", "Berkeley", "Staff", "9:00AM", "4:00PM", "-", "-", "-"},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"First Name", "Last Name", "Ocupation", "Time Starts", "Time Ends", "Member", "Room", "Location"
			}
		));
		table.setBounds(10, 84, 506, 128);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EQ.setText(comboBox.getSelectedItem().toString());
			}
		});
		btnNewButton.setBounds(78, 420, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Log Out?");
		btnNewButton_1.setBounds(564, 446, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("1. ");
		lblNewLabel.setBounds(37, 18, 20, 14);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPleaseSelectThe = new JTextPane();
		txtpnPleaseSelectThe.setText("Please select the following data to show that you have arrived to the destination. \r\nP.TRAINERS: log in and the member that has reserved will be shown in the text box. ");
		txtpnPleaseSelectThe.setBounds(58, 18, 413, 55);
		contentPane.add(txtpnPleaseSelectThe);
		
		comboBox = new JComboBox();

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Francisco", "Fremont", "Oakland"}));
		comboBox.setBounds(10, 308, 171, 55);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("2.");
		lblNewLabel_1.setBounds(37, 231, 20, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnStaffOnlySelect = new JTextPane();
		txtpnStaffOnlySelect.setText("STAFF ONLY: select the following location that you are working at and the list for the equipment will be shown in the following menu.");
		txtpnStaffOnlySelect.setBounds(72, 231, 258, 66);
		contentPane.add(txtpnStaffOnlySelect);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sign-In");
		chckbxNewCheckBox.setBounds(522, 84, 89, 10);
		contentPane.add(chckbxNewCheckBox);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(chckbxNewCheckBox, popupMenu);
		
		JMenuItem App = new JMenuItem("Appointment");
		App.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(App, "Your Appointment\n Sarah Miller\n Member\n 2:30PM- 3:15PM\n RM #12\n");
			}
		});
		popupMenu.add(App);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_1.setBounds(522, 97, 89, 14);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_2.setBounds(522, 114, 89, 10);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_3.setBounds(522, 127, 89, 14);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_4.setBounds(522, 144, 89, 14);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_5.setBounds(522, 161, 89, 14);
		contentPane.add(chckbxNewCheckBox_5);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(chckbxNewCheckBox_5, popupMenu_1);
		
		JMenuItem App1 = new JMenuItem("Appointment");
		App1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(App1, "Your Appointment\n Will McWilliams\n New Member\n 11:00AM- 12:15PM\n RM #2\n");
			}
		});
		popupMenu_1.add(App1);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Sign-In");
		chckbxNewCheckBox_6.setBounds(522, 178, 89, 14);
		contentPane.add(chckbxNewCheckBox_6);
		
		EQ = new JLabel("");
		EQ.setBounds(366, 231, 266, 167);
		contentPane.add(EQ);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
