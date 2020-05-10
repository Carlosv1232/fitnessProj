//package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class mainMenu extends JFrame {

	private JPanel contentPane;
	private JTable EmTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu frame = new mainMenu();
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
	public mainMenu() {
		setTitle("Employee Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		EmTable = new JTable();
		EmTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"First Name", "Last Name", "Username", "Password", "Job", "Location"},
				{"Jessica", "Johnson", "we12", "hello1", "P.Trainer", "Oakland"},
				{"James", "Rodriguez", "jr09", "9tyyh", "M.Service Rep", "SF"},
				{"Lillian", "Anderson", "02wq", "1eisd", "Front Desk", "Fremont"},
				{"Alex", "Johnes", "ow53", "0dqdj", "Manager", "Fremont"},
				{"Victoria", "Hernandez", "qw44", "dskt5", "Kids Club Staff", "Oakland"},
				{"Patrick", "Star", "st33", "eddw9", "P.Trainer", "SF"},
				{"Sarah ", "Miller", "qe00", "kfjk7", "Staff", "SF"},
			},
			new String[] {
				"First Name", "Last Name", "Username", "Password", "Job", "Location"
			}
		));
		EmTable.setBackground(SystemColor.inactiveCaption);
		EmTable.setColumnSelectionAllowed(true);
		EmTable.setCellSelectionEnabled(true);
		EmTable.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		EmTable.setBounds(10, 45, 536, 128);
		contentPane.add(EmTable);
		
		JCheckBox fr = new JCheckBox("Sign-In");
		fr.setBounds(552, 60, 78, 13);
		contentPane.add(fr);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(fr, popupMenu);
		
		JCheckBox sc = new JCheckBox("Sign-In");
		sc.setBounds(552, 93, 78, 13);
		contentPane.add(sc);
		
		JCheckBox tr = new JCheckBox("Sign-In");
		tr.setBounds(552, 109, 78, 13);
		contentPane.add(tr);
		
		JCheckBox frt = new JCheckBox("Sign-In");
		frt.setBounds(552, 125, 78, 14);
		contentPane.add(frt);
		
		JCheckBox fv = new JCheckBox("Sign-In");
		fv.setBounds(552, 142, 78, 14);
		contentPane.add(fv);
		
		JCheckBox sx = new JCheckBox("Sign-In");
		sx.setBounds(552, 159, 97, 14);
		contentPane.add(sx);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(sx, popupMenu_1);
		
		JTextPane txtpnPleaseLogIn = new JTextPane();
		txtpnPleaseLogIn.setText("STAFF ONLY: please enter the location you are currently at to be given more infomation. ");
		txtpnPleaseLogIn.setBounds(72, 195, 174, 52);
		contentPane.add(txtpnPleaseLogIn);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("You have been given the infomation, please start working", submitButton);
			}
		});
		submitButton.setBounds(101, 316, 89, 23);
		contentPane.add(submitButton);
		
		JButton logOut = new JButton("Log-out?\r\n");
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogOut lg = new LogOut();
				lg.setVisible(true);
			}
		});
		logOut.setBounds(504, 316, 89, 23);
		contentPane.add(logOut);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sign-In");
		chckbxNewCheckBox.setBounds(552, 76, 78, 14);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SF", "Fremont", "Oakland"}));
		comboBox.setBounds(10, 269, 111, 36);
		contentPane.add(comboBox);
		
		JTextPane txtpnPleaseSigninPtrainers = new JTextPane();
		txtpnPleaseSigninPtrainers.setText("Please sign-in\r\nP.TRAINERS ONLY: sign-in and you will be given infomation about your appointment. ");
		txtpnPleaseSigninPtrainers.setBounds(72, 11, 416, 36);
		contentPane.add(txtpnPleaseSigninPtrainers);
		
		JLabel lblNewLabel = new JLabel("2.");
		lblNewLabel.setBounds(46, 194, 16, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.");
		lblNewLabel_1.setBounds(46, 11, 16, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnThisWillGenerate = new JTextPane();
		txtpnThisWillGenerate.setText("This will generate the equipment that are reseverved or in need of mateninace");
		txtpnThisWillGenerate.setBounds(362, 195, 126, 110);
		contentPane.add(txtpnThisWillGenerate);
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
