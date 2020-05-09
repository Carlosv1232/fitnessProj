//package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.ActiveEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;

public class Gui {

	private JFrame frmFitnessCenterPage;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private location Fremont;
	private location SanFran;
	private location Oakland;
	private JTextField textField_1;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmFitnessCenterPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	*/

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFitnessCenterPage = new JFrame();
		frmFitnessCenterPage.setTitle("Fitness Center Page");
		frmFitnessCenterPage.setBounds(100, 100, 574, 410);
		frmFitnessCenterPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFitnessCenterPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(72, 62, 72, 23);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(135, 65, 86, 20);
		frmFitnessCenterPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(72, 105, 72, 17);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 103, 154, 20);
		frmFitnessCenterPage.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("Log-In and password are correct, welcome back User!");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				String p = passwordField.getText();
				
				if(u.equals("we12") && p.equals("hello1")) {
				
						JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In succeed, welcome back User!");
						mainMenu second = new mainMenu();
						second.setVisible(true);
					
					}
				else if(u.equals("jr09") && p.equals("9tyyh")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In succeed, welcome back User!");
					mainMenu second = new mainMenu();
					second.setVisible(true);
				}
				else if(u.equals("02wq") && p.equals("1eisd")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In succeed, welcome back User!");
					mainMenu second = new mainMenu();
					second.setVisible(true);
				}
				else if(u.equals("ow6t") && p.equals("0dqdj")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
					mainMenu second = new mainMenu();
					second.setVisible(true);
				}
				else if(u.equals("star") && p.equals("sbfb5")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
					mainMenu second = new mainMenu();
					second.setVisible(true);
				}
			
			    else {
			    	JOptionPane.showMessageDialog(frmFitnessCenterPage, "Incorrect info, please re-enter!");
			    }
			}
		});
		
		btnNewButton.setBounds(132, 145, 89, 23);
		frmFitnessCenterPage.getContentPane().add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Member Log-In");
		lblNewLabel_2.setBounds(72, 11, 112, 20);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("New Member? Sign-up here!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewMember mem = new NewMember();
				mem.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(316, 309, 195, 23);
		frmFitnessCenterPage.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setBounds(316, 66, 66, 14);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(316, 106, 46, 14);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(376, 63, 100, 20);
		frmFitnessCenterPage.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(372, 103, 139, 20);
		frmFitnessCenterPage.getContentPane().add(passwordField_1);
		
		JButton btnNewButton_2 = new JButton("Enter");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = textField_1.getText();
				String p = passwordField_1.getText();
				
				if(u.equals("qwf2") && p.equals("fvfg45")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
					OtherMainMenu other = new OtherMainMenu();
					other.setVisible(true);
				}
				else if(u.equals("jkkq5") && p.equals("nfkf34")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");

				}
				else if(u.equals("1wfwf") && p.equals("hwwmd78")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(u.equals("18qead") && p.equals("kmq149")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
				}
				else if(u.equals("star") && p.equals("sbfb5")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Log-In/Password succeed!, Welcome back User!");
				}
				else {
					JOptionPane.showMessageDialog(frmFitnessCenterPage, "Incorrect Log-In/Password, please re type it. ");
				}

			}
		});
		btnNewButton_2.setBounds(351, 145, 89, 23);
		frmFitnessCenterPage.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Employee Log-In");
		lblNewLabel_5.setBounds(336, 14, 89, 14);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_5);
	}
}