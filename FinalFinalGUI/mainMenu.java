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
import java.io.IOException;
import java.util.Scanner;
import project.location;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class mainMenu extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 509, 279);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton logOut = new JButton("Log-out?\r\n");
		logOut.setBackground(Color.WHITE);
		logOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogOut lg = new LogOut();
				lg.setVisible(true);
			}
		});
		logOut.setBounds(304, 99, 120, 32);
		contentPane.add(logOut);
		
		JButton eqB = new JButton("Check Equipment\r\n");
		eqB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Scanner input = new Scanner(System.in);
				String equipName;
				System.out.println("Please write in which location: ");
				equipName = input.nextLine();
				if(equipName.equals("Fremont")) {
					
				
				location fLoc = new location();
				File file = new File("FremontLocation.txt");
				String FremontAb = file.getAbsolutePath();
				fLoc.loadInformation(FremontAb);
				
				fLoc.getEquipment();
				String unSplit = fLoc.getEquipment();
				String[] arr = unSplit.split(",");
				for(int  i = 0; i < arr.length; i++) {
					String[] data = arr[i].split("_");
					System.out.println(data[0]);
					System.out.println(data[1]);
					System.out.println(data[2]);
				
				}
			}
				else if(equipName.equals("SF")){
				
				location sFLoc = new location();
				File sfFile = new File("sanFranLocation.txt");
				String SFAb = sfFile.getAbsolutePath();
				sFLoc.loadInformation(SFAb);
				sFLoc.getEquipment();
				String unSplit = sFLoc.getEquipment();
				String[] arr1= unSplit.split(",");
				for(int  i = 0; i < arr1.length; i++) {
					String[] data = arr1[i].split("_");
					System.out.println(data[0]);
					System.out.println(data[1]);
					System.out.println(data[2]);
				}
			
		}
				else if(equipName.equals("Oakland")) {
					
				
				location OakLoc = new location();
				File OakFile = new File("OaklandLocation.txt");
				String oakAb = OakFile.getAbsolutePath();
				OakLoc.loadInformation(oakAb);
			
				OakLoc.getEquipment();
			
				String unSplit2 = OakLoc.getEquipment();
				
				String[] arr2 = unSplit2.split(",");
				for(int  i = 0; i < arr2.length; i++) {
					String[] data = arr2[i].split("_");
					System.out.println(data[0]);
					System.out.println(data[1]);
					System.out.println(data[2]);
				}
				}
			}
	
			
		});
		eqB.setBackground(Color.GRAY);
		eqB.setBounds(26, 36, 145, 32);
		contentPane.add(eqB);
		
		JLabel lblNewLabel = new JLabel("Welcome Back User!");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(169, 11, 145, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add New Equipment");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Scanner input = new Scanner(System.in);
				String equipName;
				System.out.println("Please write in which location: ");
				equipName = input.nextLine();
				
				if(equipName.equals("Fremont")){
					location fremontLoc = new location();
					File file = new File("fremontLocation.txt");
					//File file = new File("FremontLocation.txt");
					String FremontAbsolute = file.getAbsolutePath();
					fremontLoc.loadInformation(FremontAbsolute);	
					String name;
					int code;
					String av;
					System.out.println("Please enter the equipment you wish to add ");
					name = input.nextLine();
					//input.nextLine();
					System.out.println("Code: ");
					code = input.nextInt(); 
					
					input.nextLine();
					
					System.out.println("Availbilty:");
					av = input.nextLine();
					
				
					System.out.println("Name: " + name);
					System.out.println("Code: " + code);
					System.out.println("Availbilty: " + av);
			
				
					fremontLoc.addEquipment(name, code, av);
					try {
						fremontLoc.saveinformation(FremontAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
					
					
				}
				else if(equipName.equals("SF")) {
					location sanFranLoc = new location();
					File sfFile = new File("sanFranLocation.txt");
					//File sfFile = new File("SanFranLocation.txt");
					String SFAbsolute = sfFile.getAbsolutePath();
					sanFranLoc.loadInformation(SFAbsolute);
					String name;
					int code;
					String av;
					System.out.println("Please enter the equipment you wish to add ");
					name = input.nextLine();
					//input.nextLine();
					System.out.println("Code: ");
					code = input.nextInt(); 
					
					input.nextLine();
					
					System.out.println("Availbilty:");
					av = input.nextLine();
					
				
					System.out.println("Name: " + name);
					System.out.println("Code: " + code);
					System.out.println("Availbilty: " + av);
			
				
					sanFranLoc.addEquipment(name, code, av);
					try {
						sanFranLoc.saveinformation(SFAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
					
					

					
				}
				else if(equipName.equals("Oakland")) {
					location OaklandLoc = new location();
					File OakFile = new File("OaklandLocation.txt");
					String oakAbsolute = OakFile.getAbsolutePath();
					OaklandLoc.loadInformation(oakAbsolute);
					String name;
					int code;
					String av;
					System.out.println("Please enter the equipment you wish to add ");
					name = input.nextLine();
					//input.nextLine();
					System.out.println("Code: ");
					code = input.nextInt(); 
					
					input.nextLine();
					
					System.out.println("Availbilty:");
					av = input.nextLine();
					
				
					System.out.println("Name: " + name);
					System.out.println("Code: " + code);
					System.out.println("Availbilty: " + av);
			
				
					OaklandLoc.addEquipment(name, code, av);
					try {
						OaklandLoc.saveinformation(oakAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
					
				}
			}
		});
	
		btnNewButton.setBounds(294, 36, 153, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Equipment");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Scanner input = new Scanner(System.in);
				String equipName;
				System.out.println("Please write in which location: ");
				equipName = input.nextLine();
				
				if(equipName.equals("Fremont")){
					location fremontLoc = new location();
					File file = new File("fremontLocation.txt");
					//File file = new File("FremontLocation.txt");
					String FremontAbsolute = file.getAbsolutePath();
					fremontLoc.loadInformation(FremontAbsolute);	
					System.out.println("Please enter the equipment you wish to remove ");
					String Name = input.nextLine();
					
				
					System.out.println("Name: " + Name);
				
			
				
					fremontLoc.removeEquipment(Name);
					try {
						fremontLoc.saveinformation(FremontAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
					
				}
				else if(equipName.equals("SF")) {
					location sanFranLoc = new location();
					File sfFile = new File("sanFranLocation.txt");
					//File sfFile = new File("SanFranLocation.txt");
					String SFAbsolute = sfFile.getAbsolutePath();
					sanFranLoc.loadInformation(SFAbsolute);
					System.out.println("Please enter the equipment you wish to remove ");
					String Name = input.nextLine();
					
				
					System.out.println("Name: " + Name);
				
			
				
					sanFranLoc.removeEquipment(Name);
					try {
						sanFranLoc.saveinformation(SFAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
				}
				else if(equipName.equals("Oakland")) {
					location OaklandLoc = new location();
					File OakFile = new File("OaklandLocation.txt");
					String oakAbsolute = OakFile.getAbsolutePath();
					OaklandLoc.loadInformation(oakAbsolute);
					System.out.println("Please enter the equipment you wish to remove ");
					String Name = input.nextLine();
					
				
					System.out.println("Name: " + Name);
				
			
				
					OaklandLoc.removeEquipment(Name);
					try {
						OaklandLoc.saveinformation(oakAbsolute);
					} catch (IOException e1) {
				
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_1.setBounds(26, 99, 145, 30);
		contentPane.add(btnNewButton_1);
	}		
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}

