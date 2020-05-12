package project;

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
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class mainMenu extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
		setBackground(Color.LIGHT_GRAY);
	
		setTitle("Employee Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 316);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JCheckBox fr = new JCheckBox("Sign-In");
		fr.setBounds(488, 46, 78, 13);
		contentPane.add(fr);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(fr, popupMenu);
		
		JMenuItem app = new JMenuItem("Appointment");
		app.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "Your appointment:\n Ana Kendrick\n Member\n 2:30PM- 3:14PM\n");
			}
		});
		popupMenu.add(app);
		
		JCheckBox sc = new JCheckBox("Sign-In");
		sc.setBounds(488, 62, 78, 13);
		contentPane.add(sc);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(sc, popupMenu_1);
		
		JMenuItem eq = new JMenuItem("Equipment");
		eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "Dumbell Set is under Maintainence! ");
			}
		});
		popupMenu_1.add(eq);
		
		JCheckBox tr = new JCheckBox("Sign-In");
		tr.setBounds(488, 78, 78, 13);
		contentPane.add(tr);
		
		JCheckBox frt = new JCheckBox("Sign-In");
		frt.setBounds(488, 94, 78, 14);
		contentPane.add(frt);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(fr, "Thank you for signing in! ");
			}
		});
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("You have been given the infomation, welcome back User! ", submitButton);
			}
		});
		submitButton.setBounds(26, 189, 145, 32);
		contentPane.add(submitButton);
		
		JButton logOut = new JButton("Log-out?\r\n");
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogOut lg = new LogOut();
				lg.setVisible(true);
			}
		});
		logOut.setBounds(36, 232, 120, 36);
		contentPane.add(logOut);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sign-In");
		chckbxNewCheckBox.setBounds(488, 28, 78, 14);
		contentPane.add(chckbxNewCheckBox);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Carlos", "Vera", "user123", "pass123", "Manager", "04-02-2020", "true"},
				{"Manuel", "Forbes", "we9874", "pass9874", "Trainer", "05-20-2019", "false"},
				{"Mabel", "Kelley", "df6543", "pass456", "Matainence", "01-02-2015", "false"},
				{"Richard", "Cake", "hg1245", "pass159", "front-desk", "04-20-2020", "false"},
				{"Jawad", "Burt", "ea8566", "pass147", "Sanitation", "02-06-2077", "false"},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		table.setBounds(10, 28, 472, 86);
		contentPane.add(table);
		
		JButton eqB = new JButton("Check Equipment\r\n");
		eqB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("You have selected the following location: " + eqB.getSelectedItem().toString());
				location fLoc = new location();
				File file = new File("FremontLocation.txt");
				String FremontAb = file.getAbsolutePath();
				fLoc.loadInformation(FremontAb);
				
				location sFLoc = new location();
				File sfFile = new File("sanFranLocation.txt");
				String SFAb = sfFile.getAbsolutePath();
				sFLoc.loadInformation(SFAb);
				
				location OakLoc = new location();
				File OakFile = new File("OaklandLocation.txt");
				String oakAb = OakFile.getAbsolutePath();
				OakLoc.loadInformation(oakAb);
				
				fLoc.getEquipment();
				sFLoc.getEquipment();
				OakLoc.getEquipment();
				
				String unSplit = fLoc.getEquipment();
				String unSplit1 = sFLoc.getEquipment();
				String unSplit2 = OakLoc.getEquipment();
				String[] arr = unSplit.split(",");
				String[] arr1= unSplit1.split(",");
				String[] arr2 = unSplit2.split(",");
				for(int  i = 0; i < arr.length; i++) {
					String[] data = arr[i].split("_");
					System.out.println(data[0]);
					System.out.println(data[1]);
					System.out.println(data[2]);
				}
				
			}
			
		});
		eqB.setBackground(Color.GRAY);
		eqB.setBounds(26, 146, 145, 32);
		contentPane.add(eqB);
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

