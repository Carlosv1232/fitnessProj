package project;

import java.awt.EventQueue;
import project.location;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;
import project.Employee;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class OtherMainMenu extends JFrame {

	private JPanel contentPane;
	
	private JFrame frame;
	location Location;
	final String find;
	private JComboBox loc_1;
	private JButton btnNewButton;
	Employee[] loc_emp;
	int emplLimit = 5; 
	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtherMainMenu frame = new OtherMainMenu();
					frame.setVisible(true);
					location l = new location();
					JComboBox loc_1 = new JComboBox();
				
				} catch (Exception e) {
			    	e.printStackTrace();
				}
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public OtherMainMenu() {
		this.find = " ";
		setBackground(Color.LIGHT_GRAY);
	
		setTitle("Member Page");
		setForeground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 304);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(UIManager.getColor("Button.background"));
		//frame.setTitle("Member Page");
		contentPane.setBorder(new CompoundBorder(new EmptyBorder(4, 2, 2, 1), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		location l = new location();
		loc_1 = new JComboBox();

		loc_1.addItem("");
		loc_1.addItem("SF\n 20.0 MI");
		loc_1.addItem("Fremont\n 19.6 MI");
		loc_1.addItem("Oakland\n 10.0 MI");
		loc_1.setMaximumRowCount(4);
		loc_1.setEditable(true);
		
		loc_1.setBounds(10, 65, 212, 83);
		contentPane.add(loc_1);
		
			
		btnNewButton = new JButton("Location Traffic");
		btnNewButton.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Location Selected: " + loc_1.getSelectedItem().toString());	//prints out the location user types in 
			
		
				location fremontLoc = new location();
				fremontLoc.getLocation();
				location sanFranLoc = new location();
				sanFranLoc.getLocation();
				location OaklandLoc = new location();
				OaklandLoc.getLocation();
				
				fremontLoc.LocIsBusy();
				sanFranLoc.LocIsBusy();
				OaklandLoc.LocIsBusy();
				
				//System.out.println("Location: " + fremontLoc);
		
			}
			
		});
		
		
		btnNewButton.setBounds(38, 159, 131, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enter Location");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "You have selected a location, please select an equipment");
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					System.out.println("location selected" + loc_1.getSelectedItem().toString());
				
			}
		});
		btnNewButton_1.setBounds(38, 193, 131, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Location");
		lblNewLabel.setBounds(54, 22, 131, 23);
		contentPane.add(lblNewLabel);
	
	
		
		
		JButton btnNewButton_3 = new JButton("Submit Equipment");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "You have now selected an equipment, thank you for using The Fitness Center Page!");
			}
		});
		btnNewButton_3.setBounds(364, 193, 149, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Back Member!");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(184, 11, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox Box = new JComboBox();
		Box.setModel(new DefaultComboBoxModel(new String[] {"", "1. Stationary Bike", "2. Treadmill", "3. DumbBell Set", "4. BarbBell Set", "5. Training Set", "6. KettleBell Set", "7. Pull-Up Frame & set", "8. Rowing Machine", "9. Fitness Ball"}));
		Box.setBounds(339, 65, 200, 83);
		contentPane.add(Box);
		Box.addItem("1. Stationary Bike");
		Box.addItem("2. Treadmill");
		Box.addItem("3. DumbBell Set");
		Box.addItem("4. BarbBell Set");
		Box.addItem("5. Training Set");
		Box.addItem("6. KettleBell Set");
		Box.addItem("7. Pull-Up Frame & set");
		Box.addItem("8. Rowing Machine");
		Box.addItem("9. Fitness Ball");
		
	JButton btnNewButton_2 = new JButton("Check Equipment");
	btnNewButton_2.setBounds(364, 159, 149, 23);
	contentPane.add(btnNewButton_2);
	
	JButton btnNewButton_4 = new JButton("Log Out?");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LogOut lgg = new LogOut();
			lgg.setVisible(true);
		}
	});
	btnNewButton_4.setBounds(219, 219, 102, 23);
	contentPane.add(btnNewButton_4);
	btnNewButton_2.addMouseListener(new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			System.out.println("You have selected the following location: " + Box.getSelectedItem().toString());
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
	}
}
	

