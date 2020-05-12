package project;
//package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class memNext extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memNext frame = new memNext();
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
	public memNext() {
		setTitle("Member Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrPleaseSelectThe = new JTextArea();
		txtrPleaseSelectThe.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 8));
		txtrPleaseSelectThe.setText("Please select the equipment that you wish to use\r\nThen it will be reserved until you arrive. ");
		txtrPleaseSelectThe.setBounds(236, 33, 287, 44);
		contentPane.add(txtrPleaseSelectThe);
		
		JComboBox equipment = new JComboBox();
		equipment.setModel(new DefaultComboBoxModel(new String[] {"1. Stationary Bicycle,", "2. treadmill,", "3. Dumbbell Set,", "4. Barbell Set,", "5. Training Set,", "6. Kettlebell Set,", "7. Pull-Up Frame & Bar,", "8. Rowing Machine,", "9. Fitness Ball. "}));
		equipment.setBounds(10, 84, 183, 148);
		contentPane.add(equipment);
		
		JButton confirm = new JButton("Submit\r\n");
		confirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("You have now selected both your location and equipment, thank you for selecting it"); 
				
			}
		});
		confirm.setBounds(476, 271, 89, 29);
		contentPane.add(confirm);
		
		JLabel user = new JLabel("Welcome Back User");
		user.setBounds(410, 0, 175, 22);
		contentPane.add(user);
		
		JButton exit = new JButton("Log-out? ");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogOut lg = new LogOut();
				lg.setVisible(true);
			}
		});
		exit.setBounds(476, 314, 89, 23);
		contentPane.add(exit);
		
		JLabel equiSection = new JLabel("Equipment Section");
		equiSection.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		equiSection.setBounds(21, 25, 116, 29);
		contentPane.add(equiSection);
		
		JTextPane txtpnTheGeneratorPart = new JTextPane();
		txtpnTheGeneratorPart.setText("The generator part for the equipment that is in use or in mantinence here. ");
		txtpnTheGeneratorPart.setBounds(257, 120, 142, 122);
		contentPane.add(txtpnTheGeneratorPart);
	}
}