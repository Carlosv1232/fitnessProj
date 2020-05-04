//package project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Gui{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField pass;
	private JPasswordField pass2;
	private location Fremont;	//These are the locations that the data is going to be taken from
	private location SanFran;
	private location Oakland;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		//initialize the location information here
		
		
		
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	//this is the startup menu that will be presented
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("Fitness Center Page");
		JLabel lblNewLabel = new JLabel("Username\r\n");	//this code is for the user login
		lblNewLabel.setBounds(26, 62, 60, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(26, 128, 60, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 68, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usr = textField.getText();
				String pssw = pass.getText();
				//have else if's here i guess or have a text file that would get it 
				if(usr.equals("we12") && pssw.equals("hello1")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
					mainMenu second = new mainMenu();
					second.setVisible(true);
				}
				else if(usr.equals("jr09") && pssw.equals("9tyyh")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
					
				}
				else if(usr.equals("02wq") && pssw.equals("1eisd")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(usr.equals("ow6t") && pssw.equals("0dqdj")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(usr.equals("star") && pssw.equals("sbfb5")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Incorrect Log-In/Password, please re type it. ");
				}
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("Log-in and Password are correct, welcome back user!");
			}
		});
		btnNewButton.setBounds(77, 180, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Member Log-In");	//this code is for the employee log-in
		lblNewLabel_2.setBounds(303, 22, 86, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username\r\n");
		lblNewLabel_3.setBounds(264, 67, 70, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Employee Log-In");
		lblNewLabel_4.setBounds(48, 25, 99, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setBounds(264, 137, 70, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(326, 68, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usr2 = textField_2.getText();
				String pssw2 = pass2.getText();
				//have else if's here i guess or have a text file that would get it 
				if(usr2.equals("qwf2") && pssw2.equals("fvfg45")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
					OtherMainMenu other = new OtherMainMenu();
					other.setVisible(true);
				}
				else if(usr2.equals("jkkq5") && pssw2.equals("nfkf34")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
					
				}
				else if(usr2.equals("1wfwf") && pssw2.equals("hwwmd78")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(usr2.equals("18qead") && pssw2.equals("kmq149")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(usr2.equals("star") && pssw2.equals("sbfb5")) {
					JOptionPane.showMessageDialog(frame, "Log-In/Password succeed!, Welcome back User!");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Incorrect Log-In/Password, please re type it. ");
				}
				
			}
			
		});
		btnNewButton_1.setBounds(303, 180, 86, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		pass = new JPasswordField();
	
		pass.setBounds(96, 134, 86, 20);
		frame.getContentPane().add(pass);
		
		pass2 = new JPasswordField();
		pass2.setBounds(328, 134, 84, 20);
		frame.getContentPane().add(pass2);
		
		JButton newmMem = new JButton("New member? Click Here!");
		newmMem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						NewMember nwMem = new NewMember();
						nwMem.setVisible(true);
			}
		});
		newmMem.setForeground(SystemColor.textHighlight);
		newmMem.setFont(new Font("Tahoma", Font.PLAIN, 8));
		newmMem.setBounds(232, 227, 125, 23);
		frame.getContentPane().add(newmMem);
	}

	public void setVisible(boolean b) {
		
		
	}
}
