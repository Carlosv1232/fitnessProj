package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import project.location;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemNext extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JComboBox EQBox;
	private ArrayList<location> locations;
	location local;
	final String loc_emp;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemNext frame = new MemNext();
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
	public MemNext() {
		this.loc_emp = "";
		setTitle("Member Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		EQBox = new JComboBox();
		EQBox.setBounds(25, 64, 282, 155);
		contentPane.add(EQBox);
		
		EQBox.addItem("Select the Equipment");
		EQBox.addItem("1. Stationary Bike");
		EQBox.addItem("2. Treadmill");
		EQBox.addItem("3. DumbBell Set");
		EQBox.addItem("4. BarBell Set");
		EQBox.addItem("5. Training Set");
		EQBox.addItem("6. KettleBox Set");
		EQBox.addItem("7. Pull-Up frame & Set");
		EQBox.addItem("8. Rowing Machine");
		EQBox.addItem("Fitness Ball.");
		
		JLabel EQ = new JLabel("Equipment Section");
		EQ.setBounds(47, 25, 180, 28);
		contentPane.add(EQ);
		
		JLabel lblNewLabel = new JLabel("Welcome Back Member");
		lblNewLabel.setBounds(494, 25, 154, 21);
		contentPane.add(lblNewLabel);
		
		JButton EQB = new JButton("Select Equipment");
		EQB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("You have selected the following equipment, It will be reserved until you arrive at the gym center,\n");
				System.out.println("thank you for using Fitness Center Page");
			}
		});
		EQB.setBounds(25, 265, 282, 23);
		contentPane.add(EQB);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(337, 75, 311, 213);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Equipment Availbilty");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				location locEq = new location();
				//Object[] AddEq;
				System.out.println("Searching Equipment");
				locEq.searchEquipment("Stationary Bike");
				
				System.out.println("Equipment" + locEq);
				System.out.println("Printing out the list of equipment ");
				locEq.getNumOfEquip();
				
				System.out.println("Adding list");
				locEq.addEquipment("Stationary Bike", 123, "Free");
				
				System.out.println("Equipment: " + locEq);
				//if else to elimate the list?
				System.out.println("eliminating an equip. once selected");
				locEq.removeEquipment("Stationary Bike");
				
				System.out.println("Equipment" + locEq);
				
				
				
				lblNewLabel_1.setText(EQBox.getSelectedItem().toString());
				
			}
		});
		btnNewButton.setBounds(25, 230, 282, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LogOut?");
		btnNewButton_1.setBounds(25, 319, 282, 23);
		contentPane.add(btnNewButton_1);
	}
}
