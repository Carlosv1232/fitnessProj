package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class OtherMainMenu extends JFrame {

	private JPanel contentPane;
	//private JFrame frame;

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
	@SuppressWarnings("unchecked")
	public OtherMainMenu() {
		setTitle("Member Page");
		setForeground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 378);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		//frame.setTitle("Member Page");
		contentPane.setBorder(new CompoundBorder(new EmptyBorder(4, 2, 2, 1), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"San Francisco \t\t\t\t\t\t\t\t\t\t\t\t\t\t20.0 MI", "Oakland\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t11.0 MI", "Fremont\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t22.9 MI"}));
		comboBox.setBounds(5, 41, 183, 93);
		contentPane.add(comboBox);
		
		JLabel Location = new JLabel("Location Section");
		Location.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Location.setBounds(5, 0, 125, 30);
		contentPane.add(Location);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memNext net = new memNext();
				net.setVisible(true);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("Selected a Location");
			}
		});
		btnNewButton_1.setBounds(419, 230, 81, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel User = new JLabel("Welcome Back User");
		User.setBounds(333, 0, 125, 14);
		contentPane.add(User);
		
		JButton nextPage = new JButton("Log-out?");
		nextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogOut nxt = new LogOut();
				nxt.setVisible(true);
			}
		});
		nextPage.setBounds(419, 291, 81, 23);
		contentPane.add(nextPage);
		
		JTextArea info = new JTextArea();
		info.setFont(new Font("Myanmar Text", Font.PLAIN, 8));
		info.setText("Welcome to the Member Page to the Fitness Center. \r\nSelect the following: \r\n-  location to the gym closest to you\r\n-  equipment you wish to use\r\nThen they will be reserved until you arrive at the gym. ");
		info.setBounds(268, 30, 232, 135);
		contentPane.add(info);
	}
}
