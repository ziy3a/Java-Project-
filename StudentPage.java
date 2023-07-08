package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StudentPage extends JFrame{

	private JFrame frame;
	String usrid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
	//		public void run() {
		//		try {
			//		StudentPage window = new StudentPage();
					//window.frame.setVisible(true);
				//} catch (Exception e) {
					//e.printStackTrace();
				//}
			//}
		//});
	//}

	/**
	 * Create the application.
	 */
	}
	public StudentPage(String in) {
		usrid=in;
		
		initialize();
		{
		
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = this;
		frame.getContentPane().setBackground(new Color(68, 183, 180));
		//frame.setBounds(100, 100, 1329, 716);
		frame.setSize(9020, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 659, 690);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 55));
		lblNewLabel_2.setBounds(130, 335, 364, 107);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\WElcome3.jpg"));
		lblNewLabel_3.setBounds(47, 97, 542, 299);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TO PROFILE");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Harlow Solid Italic", Font.BOLD, 34));
		lblNewLabel_4.setBounds(202, 420, 262, 47);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROFILE");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 55));
		lblNewLabel_5.setBounds(861, 29, 287, 115);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("NAME");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(812, 222, 67, 32);
		frame.getContentPane().add(lblNewLabel_5_1);
		//lblNewLabel_5_1.setVisible(false);
		
		
		JLabel lblNewLabel_5_2 = new JLabel("COURSE");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(812, 268, 120, 32);
		frame.getContentPane().add(lblNewLabel_5_2);
		//lblNewLabel_5_2.setVisible(false);
		
		JLabel lblNewLabel_5_3 = new JLabel("BRANCH");
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(812, 318, 120, 32);
		frame.getContentPane().add(lblNewLabel_5_3);
		//lblNewLabel_5_3.setVisible(false);
		
		JLabel lblNewLabel_5_4 = new JLabel("EMAIL");
		lblNewLabel_5_4.setForeground(Color.WHITE);
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4.setBounds(812, 372, 120, 32);
		frame.getContentPane().add(lblNewLabel_5_4);
		//lblNewLabel_5_4.setVisible(false);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("Ist SEM MARK");
		lblNewLabel_5_4_1.setForeground(Color.WHITE);
		lblNewLabel_5_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4_1.setBounds(812, 432, 120, 32);
		frame.getContentPane().add(lblNewLabel_5_4_1);
		//lblNewLabel_5_4_1.setVisible(false);
		
		JLabel lblNewLabel_5_4_1_1 = new JLabel("2st SEM MARK");
		lblNewLabel_5_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4_1_1.setBounds(812, 491, 120, 32);
		frame.getContentPane().add(lblNewLabel_5_4_1_1);
		//lblNewLabel_5_4_1_1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(1062, 275, 145, 21);
		frame.getContentPane().add(lblNewLabel_1);
		//lblNewLabel_1.setVisible(false);
		
		JLabel lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(1062, 229, 145, 21);
		frame.getContentPane().add(lblNewLabel_1_1);
		//lblNewLabel_1_1.setVisible(false);
		
		JLabel lblNewLabel_1_2 = new JLabel(":");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(1062, 325, 145, 21);
		frame.getContentPane().add(lblNewLabel_1_2);
		//lblNewLabel_1_2.setVisible(false);
		
		JLabel lblNewLabel_1_3 = new JLabel(":");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(1062, 379, 145, 21);
		frame.getContentPane().add(lblNewLabel_1_3);
		//lblNewLabel_1_3 .setVisible(false);
		
		JLabel lblNewLabel_1_4 = new JLabel(":");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_4.setBounds(1062, 439, 145, 21);
		frame.getContentPane().add(lblNewLabel_1_4);
		//lblNewLabel_1_4.setVisible(false);
		
		JLabel lblNewLabel_1_5 = new JLabel(" Not Published");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_5.setBounds(1062, 498, 145, 21);
		frame.getContentPane().add(lblNewLabel_1_5);
		//lblNewLabel_1_5.setVisible(false);
		
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentLogin().setVisible(true);
				//setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(1123, 592, 100, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
					Statement stmt=con.createStatement();
					String query="Select * from Mca where username='"+usrid+"'";
					ResultSet rs=stmt.executeQuery(query);
					if(rs.next())
					{
						lblNewLabel_1_1.setText(rs.getString("name"));
						lblNewLabel_1.setText(rs.getString("course"));
						lblNewLabel_1_2.setText(rs.getString("branch"));
						lblNewLabel_1_3.setText(rs.getString("email"));
						lblNewLabel_1_4.setText(rs.getString("Ese"));
						lblNewLabel_5_1.setVisible(true);
						lblNewLabel_5_2.setVisible(true);
						lblNewLabel_5_3.setVisible(true);
						lblNewLabel_5_4.setVisible(true);
						lblNewLabel_5_4_1.setVisible(true);
						lblNewLabel_5_4_1_1.setVisible(true);
						lblNewLabel_1_5.setVisible(true);
						lblNewLabel_1_5.setVisible(true);
						lblNewLabel_1_4.setVisible(true);
						lblNewLabel_1_3 .setVisible(true);
						lblNewLabel_1_2.setVisible(true);
						lblNewLabel_1_1.setVisible(true);
						lblNewLabel_1.setVisible(true);
						
						
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Wrong Password");
						setVisible(true);
					}
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}

	}
