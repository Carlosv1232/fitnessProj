//package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class LogOut extends JFrame {

	private JPanel contentPane;
	private JTextField textField;		//textfield
	private JTextField txt;				//textField_1
	private JPasswordField psws;		//textField_2
	private JPasswordField psww;		//textField_3


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOut frame = new LogOut();
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
	public LogOut() {
		setTitle("Fitness Center Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(107, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel usr = new JLabel("Username");
		usr.setBounds(20, 57, 65, 17);
		contentPane.add(usr);
		
		txt = new JTextField(); //textFeild_1
		txt.setBounds(329, 54, 86, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel usrr = new JLabel("Username");
		usrr.setBounds(259, 57, 60, 20);
		contentPane.add(usrr);
		
		JLabel psw = new JLabel("Password");
		psw.setBounds(20, 124, 65, 17);
		contentPane.add(psw);
		
		JLabel pswr = new JLabel("Password");
		pswr.setBounds(259, 124, 60, 17);
		contentPane.add(pswr);
		
		JButton smt = new JButton("Submit");
		smt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMenu mw = new mainMenu();
				mw.setVisible(true);
			}
			
		});
		smt.setBounds(95, 191, 89, 23);
		contentPane.add(smt);
		
		JButton smtt = new JButton("Submit");
		smtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		smtt.setBounds(326, 191, 89, 23);
		contentPane.add(smtt);
		
		psws = new JPasswordField();
		psws.setBounds(107, 122, 86, 20);
		contentPane.add(psws);
		
		psww = new JPasswordField();
		psww.setBounds(329, 122, 86, 20);
		contentPane.add(psww);
		
		JLabel lblNewLabel = new JLabel("Employee Section");
		lblNewLabel.setBounds(40, 28, 94, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Member Section");
		lblNewLabel_1.setBounds(315, 28, 89, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton nwmem = new JButton("New Member? Sign up here!");
		nwmem.setForeground(SystemColor.activeCaption);
		nwmem.setBounds(272, 255, 167, 23);
		contentPane.add(nwmem);
	}
}