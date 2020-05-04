//package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewMember extends JFrame {

	private JPanel contentPane;
	private JTextField em;
	private JTextField pn;
	private JTextField fn;
	private JTextField nl;
	private JTextField addr;
	private JTextField cty;
	private JTextField zip;
	private JTextField usrr;
	private JPasswordField retypsswrd;
	private JTextField retyusrr;
	private JPasswordField psswrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMember frame = new NewMember();
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
	public NewMember() {
		setFont(new Font("Dialog", Font.PLAIN, 8));
		setTitle("New Member Registration\r\n");
		setForeground(Color.BLACK);
		setAlwaysOnTop(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel firstName = new JLabel("First Name\r\n");
		firstName.setBounds(10, 11, 64, 14);
		contentPane.add(firstName);
		
		JLabel lastName = new JLabel("Last Name");
		lastName.setBounds(295, 11, 64, 14);
		contentPane.add(lastName);
		
		JLabel addrs = new JLabel("Address");
		addrs.setBounds(10, 59, 64, 14);
		contentPane.add(addrs);
		
		JLabel city = new JLabel("City");
		city.setBounds(284, 59, 30, 14);
		contentPane.add(city);
		
		JLabel zipCode = new JLabel("Zip-Code");
		zipCode.setBounds(464, 59, 56, 14);
		contentPane.add(zipCode);
		
		JLabel phoneNumbr = new JLabel("Phone Number");
		phoneNumbr.setBounds(10, 127, 88, 14);
		contentPane.add(phoneNumbr);
		
		JLabel email = new JLabel("Email");
		email.setBounds(270, 127, 57, 14);
		contentPane.add(email);
		
		JRadioButton gmail = new JRadioButton("@gmail.com");
		gmail.setBounds(236, 148, 100, 20);
		contentPane.add(gmail);
		
		JRadioButton yahoo = new JRadioButton("@yahoo.com");
		yahoo.setBounds(338, 148, 90, 20);
		contentPane.add(yahoo);
		
		JRadioButton outlook = new JRadioButton("@outlook.com");
		outlook.setBounds(430, 148, 108, 20);
		contentPane.add(outlook);
		
		em = new JTextField();
		em.setBounds(337, 124, 201, 20);
		contentPane.add(em);
		em.setColumns(10);
		
		pn = new JTextField();
		pn.setBounds(108, 124, 128, 20);
		contentPane.add(pn);
		pn.setColumns(10);
		
		fn = new JTextField();
		fn.setBounds(81, 8, 180, 20);
		contentPane.add(fn);
		fn.setColumns(10);
		
		nl = new JTextField();
		nl.setBounds(367, 8, 153, 20);
		contentPane.add(nl);
		nl.setColumns(10);
		
		addr = new JTextField();
		addr.setBounds(82, 56, 179, 20);
		contentPane.add(addr);
		addr.setColumns(10);
		
		cty = new JTextField();
		cty.setBounds(324, 56, 119, 20);
		contentPane.add(cty);
		cty.setColumns(10);
		
		zip = new JTextField();
		zip.setBounds(530, 56, 70, 20);
		contentPane.add(zip);
		zip.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 231, 597, -35);
		contentPane.add(horizontalStrut);
		
		JLabel username = new JLabel("Username");
		username.setBounds(10, 207, 64, 14);
		contentPane.add(username);
		
		JLabel retyusr = new JLabel("Re-type Username");
		retyusr.setBounds(257, 207, 115, 14);
		contentPane.add(retyusr);
		
		JLabel password = new JLabel("Password");
		password.setBounds(10, 248, 64, 14);
		contentPane.add(password);
		
		JLabel retypssw = new JLabel("Re-type Password");
		retypssw.setBounds(257, 248, 115, 14);
		contentPane.add(retypssw);
		
		usrr = new JTextField();
		usrr.setBounds(81, 200, 146, 20);
		contentPane.add(usrr);
		usrr.setColumns(10);
		
		retypsswrd = new JPasswordField();
		retypsswrd.setBounds(384, 245, 154, 20);
		contentPane.add(retypsswrd);
		
		retyusrr = new JTextField();
		retyusrr.setBounds(382, 207, 154, 20);
		contentPane.add(retyusrr);
		retyusrr.setColumns(10);
		
		psswrd = new JPasswordField();
		psswrd.setBounds(80, 245, 147, 20);
		contentPane.add(psswrd);
		
		JButton enter = new JButton("Submit");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtherMainMenu entr = new OtherMainMenu();
				entr.setVisible(true);
			}
		});
		enter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("info added", enter);
				System.out.print("your info has been added, welcome new Member!" );
			}
		});
		enter.setBounds(214, 276, 89, 23);
		contentPane.add(enter);
	}
}
