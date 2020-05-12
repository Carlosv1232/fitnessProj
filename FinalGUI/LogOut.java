package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class LogOut extends JFrame {

	private JPanel contentPane;
	private JTextField textField;		//textfield
	private JTextField txt;				//textField_1
	private JPasswordField psws;		//textField_2
	private JPasswordField psww;		//textField_3
	private JFrame frame;

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
		setBounds(100, 100, 498, 344);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(107, 54, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel usr = new JLabel("Username");
		usr.setBounds(32, 56, 65, 17);
		contentPane.add(usr);
		
		txt = new JTextField(); //textFeild_1
		txt.setBounds(329, 54, 86, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel usrr = new JLabel("Username");
		usrr.setBounds(259, 54, 60, 20);
		contentPane.add(usrr);
		
		JLabel psw = new JLabel("Password");
		psw.setBounds(32, 124, 65, 17);
		contentPane.add(psw);
		
		JLabel pswr = new JLabel("Password");
		pswr.setBounds(259, 124, 60, 17);
		contentPane.add(pswr);
		
		JButton smt = new JButton("Submit");
		smt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = textField.getText();
				String p = psws.getText();
				
				if(u.equals("qmso1") && p.equals("qqn14")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else if(u.equals("jkkq5") && p.equals("nfh34")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else if(u.equals("1wfwf") && p.equals("hwd78")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
			}
				else if(u.equals("18qead") && p.equals("kmq14")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(frame," INCORRECT!  please try again!");
				}
			}
			
		});
		smt.setBounds(93, 153, 89, 23);
		contentPane.add(smt);
		
		JButton smtt = new JButton("Submit");
		smtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = txt.getText();
				String p = psww.getText();
				if(u.equals("we12") && p.equals("hello1")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("jr09") && p.equals("9tyyh")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Member!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("02wq") && p.equals("1eisd")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
			}
				else if(u.equals("ow53") && p.equals("0dqdj")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back Manager!");
					ManagerPage mg = new ManagerPage();
					mg.setVisible(true);
				}
				else if(u.equals("qw44") && p.equals("dskt5")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("st33") && p.equals("sbfb5")) {
					JOptionPane.showMessageDialog(frame," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(frame," INCORRECT!  please try again!");
				}
				
				
			}
		});
		smtt.setBounds(314, 152, 89, 23);
		contentPane.add(smtt);
		
		psws = new JPasswordField();
		psws.setBounds(107, 122, 86, 20);
		contentPane.add(psws);
		
		psww = new JPasswordField();
		psww.setBounds(329, 122, 86, 20);
		contentPane.add(psww);
		
		JLabel em1 = new JLabel("Employee Section");
		em1.setBounds(285, 23, 94, 15);
		contentPane.add(em1);
		
		JLabel mem1 = new JLabel("Member Section");
		mem1.setBounds(52, 23, 89, 15);
		contentPane.add(mem1);
		
		JButton nwmem = new JButton("New Member? Sign up here!");
		nwmem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nwmem.setForeground(SystemColor.activeCaption);
		nwmem.setBounds(147, 275, 167, 23);
		contentPane.add(nwmem);
	}
}
