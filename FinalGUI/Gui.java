package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class Gui {

	private JFrame frmFitnessCenterPage;
	private JTextField txtt;
	private JPasswordField psww;
	private JTextField txt;
	private JPasswordField passwordField_1;

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
	public Gui() {
		initialize();
	}


	private void initialize() {
		frmFitnessCenterPage = new JFrame();
		frmFitnessCenterPage.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmFitnessCenterPage.setTitle("Fitness Center Page");
		frmFitnessCenterPage.setBounds(100, 100, 496, 353);
		frmFitnessCenterPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFitnessCenterPage.getContentPane().setLayout(null);
		
		JLabel usr = new JLabel("Username");
		usr.setBounds(34, 64, 60, 14);
		frmFitnessCenterPage.getContentPane().add(usr);
		
		txtt = new JTextField();
		txtt.setBounds(104, 61, 86, 20);
		frmFitnessCenterPage.getContentPane().add(txtt);
		txtt.setColumns(10);
		
		JLabel psw = new JLabel("Password");
		psw.setBounds(34, 107, 60, 14);
		frmFitnessCenterPage.getContentPane().add(psw);
		
		psww = new JPasswordField();
		psww.setBounds(104, 104, 115, 20);
		frmFitnessCenterPage.getContentPane().add(psww);
		
		JLabel usrr = new JLabel("Username");
		usrr.setBounds(258, 64, 60, 14);
		frmFitnessCenterPage.getContentPane().add(usrr);
		
		JLabel lbll = new JLabel("Password");
		lbll.setBounds(258, 107, 60, 14);
		frmFitnessCenterPage.getContentPane().add(lbll);
		
		txt = new JTextField();
		txt.setBounds(328, 61, 86, 20);
		frmFitnessCenterPage.getContentPane().add(txt);
		txt.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(328, 104, 112, 20);
		frmFitnessCenterPage.getContentPane().add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Member Section ");
		lblNewLabel_4.setBounds(55, 17, 131, 17);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Employee Section");
		lblNewLabel_5.setBounds(255, 14, 115, 23);
		frmFitnessCenterPage.getContentPane().add(lblNewLabel_5);
		
		JButton b1 = new JButton("Enter");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Member Log-In, welcome back!");
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = txtt.getText();
				String p = psww.getText();
				
				if(u.equals("qmso1") && p.equals("qqn14")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else if(u.equals("jkkq5") && p.equals("nfh34")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else if(u.equals("1wfwf") && p.equals("hwd78")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
			}
				else if(u.equals("18qead") && p.equals("kmq14")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					OtherMainMenu nxt = new OtherMainMenu();
					nxt.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," INCORRECT!  please try again!");
				}
			}
		});
		b1.setBounds(55, 145, 89, 23);
		frmFitnessCenterPage.getContentPane().add(b1);
		
		JButton b2 = new JButton("Enter");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Log-in correct, welcome back employer");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = txt.getText();
				String  p = passwordField_1.getText();
				
				if(u.equals("user123") && p.equals("pass123")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("we987") && p.equals("pass987")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back Member!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("df654") && p.equals("pass456")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
			}
				else if(u.equals("hg124") && p.equals("pass159")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else if(u.equals("ea856") && p.equals("pass147")) {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," Log-In correct, Welcome back User!");
					mainMenu em = new mainMenu();
					em.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(frmFitnessCenterPage," INCORRECT!  please try again!");
				}
				
			}
		});
		b2.setBounds(281, 145, 89, 23);
		frmFitnessCenterPage.getContentPane().add(b2);
		
		JButton b3 = new JButton("New Member? Click here!");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		b3.setBackground(SystemColor.inactiveCaption);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewMember mem = new NewMember();
				mem.setVisible(true);
			}
		});
		b3.setBounds(132, 273, 165, 23);
		frmFitnessCenterPage.getContentPane().add(b3);
	}
}
