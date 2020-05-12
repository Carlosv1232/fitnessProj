package fitnessProject;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Gui<ToggleGroup> {

	private JFrame frame;

	//starts the gui here 
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

	// show the gui 
	public Gui() {
		initialize();
	}

	//will show all the parts for the gui onto here 
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		frame.getContentPane().setForeground(new Color(128, 0, 0));
		
		JButton LogOut = new JButton("LogOut");
		LogOut.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Logged-Out!");
			}
		});
		LogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.setTitle("Fitness Center Page");
JMenu Employee = new JMenu("Employee Section");
		JMenuBar menu = new JMenuBar();
		JMenuItem Log = new JMenuItem("Sign-In");
		JMenuItem ID = new JMenuItem("ID");
		JMenuItem clockIn = new JMenuItem("clock-In/Clock-Out");
		
		Employee.add(Log);
		Employee.add(ID);
		Employee.add(clockIn);
		Employee.setSize(50,50);
		
		JMenu Member = new JMenu("Member Section");
		
		JMenuItem Log2 = new JMenuItem("Sign-In");
		JMenuItem ID2 = new JMenuItem("ID");
		JMenuItem status = new JMenuItem("Status");
		Member.add(Log2);
		Member.add(ID2);
		Member.add(status);
		
		JMenu Manager = new JMenu("Manager Section");
		
		JMenuItem Log3 = new JMenuItem("Sign-In");
		JMenuItem ID3 = new JMenuItem("ID");
		JMenuItem clockIn2 = new JMenuItem("clock-In/Clock-Out");
		Manager.add(Log3);
		Manager.add(ID3);
		Manager.add(clockIn2);
		
		JMenu Equipment = new JMenu("Equipment Section");
		
		JMenuItem product = new JMenuItem("Product type #");
		JMenuItem status2 = new JMenuItem("Status");
		Equipment.add(product);
		Equipment.add(status2);
		frame.getContentPane().add(LogOut, BorderLayout.SOUTH);
		
		JList<?> list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Employee", "Member"};
			String in = values.toString();
			public int getSize() {
				
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setForeground(new Color(105, 105, 105));
		list.setBorder(UIManager.getBorder("MenuItem.border"));
		frame.getContentPane().add(list, BorderLayout.EAST);
		
		JLabel top = new JLabel("Welcome To The Fitness Center Page");
		top.setLabelFor(frame);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("Tahoma", Font.PLAIN, 15));
		top.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(top, BorderLayout.NORTH);
		
	
		JLabel sel = new JLabel("Select the following selection for equipment");
		JToggleButton p = new JToggleButton("Product #");
		JToggleButton s = new JToggleButton("Status");
		JToggleButton pC = new JToggleButton("Product Code");
		
		frame.getContentPane().add(p, BorderLayout.CENTER);
		frame.getContentPane().add(s, BorderLayout.CENTER);
		frame.getContentPane().add(pC, BorderLayout.CENTER);
		
		JToolBar toolBar = new JToolBar("Manager Log-In/Password");
		JFrame ma = new JFrame("Manager Section");
		String[] mn = {"Log-In", "Password"};
		JLabel lg = new JLabel("Log-In accepted");
		JLabel ps = new JLabel("Password accepted");
		
		frame.getContentPane().add(toolBar, BorderLayout.WEST);
		frame.getContentPane().add(toolBar, BorderLayout.WEST);
		
		sel.show();
		frame.setSize(30,30);
		//frame.setVisible(true);
		//s.setToolTipText("Equipment ");
		
		pC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("You selected the following: " + ToggleButton());
				System.out.print("Thank-you and please come again!");
			}
		});

		
		//final ToggleGroup g = new ToggleGroup();
		
		//((Object) frame).setSpacing(20);
		frame.setSize(20,20);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	protected String ToggleButton() {
		
		return null;
	}

	public void  Panel() {
		frame.getContentPane().setForeground(new Color(250, 235, 215));
	}

	/*private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger)) {
					showMenu(e);*/
				
			
			;
	}
