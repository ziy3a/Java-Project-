package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Loginpage extends JFrame {

	private JFrame frmLoginPage;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = this;
		frmLoginPage.getContentPane().setBackground(new Color(48, 173, 173));
		frmLoginPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(827, 281, 106, 14);
		frmLoginPage.getContentPane().add(lblNewLabel);
		frmLoginPage.setSize(9020, 1080);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(827, 341, 88, 14);
		frmLoginPage.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(985, 280, 126, 20);
		frmLoginPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(985, 340, 126, 20);
		frmLoginPage.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
					Statement stmt=con.createStatement();
					//int item=0;
					String query="select * from admin where username='"+textField .getText()+"' and password='"+passwordField.getText()+"'";
					ResultSet rs=stmt.executeQuery(query);
					if(rs.next())
					{
						
						JOptionPane.showMessageDialog(null,"Login successfully ");
						new AdminPage().setVisible(true);
						setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Username/Password");
						setVisible(true);
					}
				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(918, 402, 75, 23);
		frmLoginPage.getContentPane().add(btnNewButton);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 634, 690);
		frmLoginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 55));
		lblNewLabel_2.setBounds(130, 335, 364, 107);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\WElcome3.jpg"));
		lblNewLabel_3.setBounds(47, 97, 542, 299);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("TO LOGIN");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Harlow Solid Italic", Font.BOLD, 34));
		lblNewLabel_4.setBounds(247, 407, 215, 47);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Forgot password");
		btnNewButton_1.setBounds(731, 481, 134, 23);
		frmLoginPage.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Help?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(1127, 481, 75, 23);
		frmLoginPage.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("LOGIN");
		lblNewLabel_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 55));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(876, 83, 239, 115);
		frmLoginPage.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainWindow().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(918, 612, 75, 23);
		getContentPane().add(btnNewButton_3);
        frmLoginPage.setVisible(true);
	}

}
