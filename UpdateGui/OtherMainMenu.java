package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import project.location;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import project.MemNext;
import java.awt.Color;

public class OtherMainMenu extends JFrame {

	private JPanel contentPane;
	private JLabel locShow;
	private JComboBox locBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtherMainMenu frame = new OtherMainMenu();
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
	public OtherMainMenu() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Member Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 481);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		locShow = new JLabel("");
		locShow.setBounds(308, 190, 323, 222);
		contentPane.add(locShow);
		
		locBox = new JComboBox();
		locBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// randomly generate the three locations, and show their 
				
			}
		});
		locBox.setBounds(31, 40, 235, 182);
		contentPane.add(locBox);
		locBox.addItem("Select the location");
		locBox.addItem("SF\n 20.0 MI");
		locBox.addItem("Fremont\n  15.9 MI");
		locBox.addItem("Oakland\n  11.0 MI");
		Object it = locBox.getSelectedItem();
		System.out.println(locBox);
		
		JButton locButton = new JButton("Location Availabilty");
		locButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				locShow.setText(locBox.getSelectedItem().toString());
			}
		});
		locButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		locButton.setBounds(31, 233, 235, 37);
		contentPane.add(locButton);
		
		JButton nextB = new JButton("Next Section");
		nextB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemNext mn = new MemNext();
				mn.setVisible(true);
				
			}
		});
		nextB.setBounds(31, 291, 235, 23);
		contentPane.add(nextB);
		contentPane.setVisible(true);
		
		
	}
}
