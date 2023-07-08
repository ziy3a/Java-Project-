package mainpackage;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class StudentLogin extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin window = new StudentLogin();
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
	public StudentLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =this;
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
		
		JLabel lblNewLabel_4 = new JLabel("TO LOGIN");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Harlow Solid Italic", Font.BOLD, 34));
		lblNewLabel_4.setBounds(247, 407, 215, 47);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("LOGIN");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 55));
		lblNewLabel_5.setBounds(881, 75, 239, 115);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(843, 281, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(985, 280, 126, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(843, 341, 88, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(985, 340, 126, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
					Statement stmt=con.createStatement();
					String query="select * from Mca where username='"+textField.getText()+"' and password='"+passwordField.getText()+"'";
					//String query1="select * from Msc where username='"+textField .getText()+"' and password='"+passwordField.getText()+"'";
					//String query2="select * from Msw where username='"+textField .getText()+"' and password='"+passwordField.getText()+"'";
					ResultSet rs=stmt.executeQuery(query);
					//ResultSet rs1=stmt.executeQuery(query1);
					//ResultSet rs2=stmt.executeQuery(query2);
					if(rs.next())
					{
						frame.setVisible(false);
						JOptionPane.showMessageDialog(null,"Login successfully ");
						new StudentPage(rs.getString("username")).setVisible(true);
						//StudentPage sg=new StudentPage(rs.getInt("Id"));
						//sg.setVisible(true);
						setVisible(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Username/password");
						setVisible(true);
					}
					
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(918, 402, 75, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Forgot password");
		btnNewButton_1.setBounds(733, 481, 135, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Help?");
		btnNewButton_2.setBounds(1096, 481, 75, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainWindow().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(918, 589, 75, 23);
		getContentPane().add(btnNewButton_3);
	}
}
