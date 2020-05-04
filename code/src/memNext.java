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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel topic = new JLabel("Member Page\r\n");
		topic.setBounds(0, 0, 92, 14);
		contentPane.add(topic);
		
		JTextArea txtrPleaseSelectThe = new JTextArea();
		txtrPleaseSelectThe.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 8));
		txtrPleaseSelectThe.setText("Please select the equipment that you wish to use\r\nThen it will be reserved until you arrive. ");
		txtrPleaseSelectThe.setBounds(203, 51, 205, 75);
		contentPane.add(txtrPleaseSelectThe);
		
		JComboBox equipment = new JComboBox();
		equipment.setModel(new DefaultComboBoxModel(new String[] {"1. Stationary Bicycle,", "2. treadmill,", "3. Dumbbell Set,", "4. Barbell Set,", "5. Training Set,", "6. Kettlebell Set,", "7. Pull-Up Frame & Bar,", "8. Rowing Machine,", "9. Fitness Ball. "}));
		equipment.setBounds(10, 58, 138, 68);
		contentPane.add(equipment);
		
		JButton confirm = new JButton("Submit\r\n");
		confirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("You have now selected both your location and equipment, thank you for selecting it"); 
				
			}
		});
		confirm.setBounds(37, 152, 89, 29);
		contentPane.add(confirm);
		
		JLabel user = new JLabel("Welcome Back User");
		user.setBounds(285, 0, 106, 14);
		contentPane.add(user);
		
		JButton exit = new JButton("Log-out? ");
		exit.setBounds(319, 213, 89, 23);
		contentPane.add(exit);
		
		JLabel equiSection = new JLabel("Equipment Section");
		equiSection.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		equiSection.setBounds(10, 25, 116, 29);
		contentPane.add(equiSection);
	}
}
