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
				{"Lillian", "Anderson", "02wq", "1eisd", "Front Desk", "Berkeley"},
				{"Alex", "Johnes", "ow53", "0dqdj", "Manager", "Fremont"},
				{"Victoria", "Hernandez", "qw44", "dskt5", "Kids Club Staff", "Berkeley"},
				{"Patrick", "Star", "st33", "eddw9", "P.Trainer", "SF"},
			},
			new String[] {
				"First Name", "Last Name", "Username", "Password", "Job", "Location"
			}
		));
		EmTable.setBackground(SystemColor.inactiveCaption);
		EmTable.setColumnSelectionAllowed(true);
		EmTable.setCellSelectionEnabled(true);
		EmTable.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		EmTable.setBounds(15, 30, 536, 132);
		contentPane.add(EmTable);
		
		JCheckBox fr = new JCheckBox("Click");
		fr.setBounds(557, 45, 60, 14);
		contentPane.add(fr);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(fr, popupMenu);
		
		JCheckBox sc = new JCheckBox("Click\r\n");
		sc.setBounds(557, 62, 78, 14);
		contentPane.add(sc);
		
		JCheckBox tr = new JCheckBox("Click");
		tr.setBounds(557, 79, 53, 14);
		contentPane.add(tr);
		
		JCheckBox frt = new JCheckBox("Click");
		frt.setBounds(557, 96, 69, 14);
		contentPane.add(frt);
		
		JCheckBox fv = new JCheckBox("Click");
		fv.setBounds(557, 113, 78, 14);
		contentPane.add(fv);
		
		JCheckBox sx = new JCheckBox("Click");
		sx.setBounds(557, 130, 97, 14);
		contentPane.add(sx);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(sx, popupMenu_1);
		
		JTextPane txtpnPleaseLogIn = new JTextPane();
		txtpnPleaseLogIn.setText("Please log in and more infomation will be given to you. ");
		txtpnPleaseLogIn.setBounds(25, 173, 136, 63);
		contentPane.add(txtpnPleaseLogIn);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("You have been given the infomation, please start working", submitButton);
			}
		});
		submitButton.setBounds(504, 186, 89, 23);
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
