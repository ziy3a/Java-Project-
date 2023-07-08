package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class McaDetails extends JFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					McaDetails window = new McaDetails();
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
	public McaDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = this;
		frame.getContentPane().setBackground(new Color(68, 183, 180));
		frame.getContentPane().setLayout(null);
		frame.setSize(9020, 1080);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 661, 679);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MCA DETAILS");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 55));
		lblNewLabel.setBounds(156, 73, 403, 99);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\MCA1.png"));
		lblNewLabel_1.setBounds(243, 215, 228, 198);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(201, 424, 273, 99);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL STUDENTS");
		lblNewLabel_2.setBounds(0, 0, 273, 51);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(255, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_3.setBounds(114, 48, 60, 40);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DETAILS");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 55));
		lblNewLabel_4.setBounds(854, 22, 323, 105);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SEARCH STUDENT");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(758, 160, 157, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ID  :");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(1110, 169, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(1156, 168, 57, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("NAME");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(699, 326, 68, 23);
		frame.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);
		
		JLabel lblNewLabel_7_1 = new JLabel("AGE");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_1.setBounds(699, 372, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_1);
		lblNewLabel_7_1.setVisible(false);
		
		JLabel lblNewLabel_7_2 = new JLabel("COURSE");
		lblNewLabel_7_2.setForeground(Color.WHITE);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_2.setBounds(699, 412, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_2);
		lblNewLabel_7_2 .setVisible(false);
		
		JLabel lblNewLabel_7_3 = new JLabel("BRANCH");
		lblNewLabel_7_3.setForeground(Color.WHITE);
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_3.setBounds(699, 452, 81, 23);
		frame.getContentPane().add(lblNewLabel_7_3);
		lblNewLabel_7_3.setVisible(false);
		
		JLabel lblNewLabel_7_4 = new JLabel("EMAIL");
		lblNewLabel_7_4.setForeground(Color.WHITE);
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_4.setBounds(699, 498, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_4);
		lblNewLabel_7_4.setVisible(false);
		
		JLabel lblNewLabel_7_5 = new JLabel("FATHERS NAME");
		lblNewLabel_7_5.setForeground(Color.WHITE);
		lblNewLabel_7_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_5.setBounds(699, 545, 105, 23);
		frame.getContentPane().add(lblNewLabel_7_5);
		lblNewLabel_7_5.setVisible(false);
		
		JLabel lblNewLabel_7_6 = new JLabel("MOTHERS NAME");
		lblNewLabel_7_6.setForeground(Color.WHITE);
		lblNewLabel_7_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_6.setBounds(699, 583, 124, 23);
		frame.getContentPane().add(lblNewLabel_7_6);
		lblNewLabel_7_6 .setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("BASIC");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(773, 276, 65, 32);
		frame.getContentPane().add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_8_1 = new JLabel("MARKS");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8_1.setBounds(1110, 276, 81, 32);
		frame.getContentPane().add(lblNewLabel_8_1);
		lblNewLabel_8_1 .setVisible(false);
		
		JLabel lblNewLabel_7_7 = new JLabel("CAE 1");
		lblNewLabel_7_7.setForeground(Color.WHITE);
		lblNewLabel_7_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_7.setBounds(1051, 326, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_7);
		lblNewLabel_7_7.setVisible(false);
		
		JLabel lblNewLabel_7_8 = new JLabel("CAE 2");
		lblNewLabel_7_8.setForeground(Color.WHITE);
		lblNewLabel_7_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_8.setBounds(1051, 376, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_8);
		lblNewLabel_7_8.setVisible(false);
		
		JLabel lblNewLabel_7_9 = new JLabel("ESE ");
		lblNewLabel_7_9.setForeground(Color.WHITE);
		lblNewLabel_7_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_9.setBounds(1051, 430, 68, 23);
		frame.getContentPane().add(lblNewLabel_7_9);
		lblNewLabel_7_9.setVisible(false);
		
		JLabel Nametxt = new JLabel("");
		Nametxt.setForeground(Color.WHITE);
		Nametxt.setFont(new Font("Tahoma", Font.BOLD, 13));
		Nametxt.setBounds(867, 327, 141, 20);
		getContentPane().add(Nametxt);
		
		JLabel lblNewLabel_7_11_1 = new JLabel("");
		lblNewLabel_7_11_1.setForeground(Color.WHITE);
		lblNewLabel_7_11_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1.setBounds(867, 373, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1);
		
		JLabel lblNewLabel_7_11_1_1 = new JLabel("");
		lblNewLabel_7_11_1_1.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_1.setBounds(867, 413, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1_1);
		
		JLabel lblNewLabel_7_11_1_2 = new JLabel("");
		lblNewLabel_7_11_1_2.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_2.setBounds(867, 453, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1_2);
		
		JLabel lblNewLabel_7_11_1_3 = new JLabel("");
		lblNewLabel_7_11_1_3.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_3.setBounds(867, 499, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1_3);
		
		JLabel lblNewLabel_7_11_1_4 = new JLabel("");
		lblNewLabel_7_11_1_4.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_4.setBounds(867, 542, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1_4);
		
		JLabel lblNewLabel_7_11_1_5 = new JLabel("");
		lblNewLabel_7_11_1_5.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_5.setBounds(867, 584, 141, 20);
		getContentPane().add(lblNewLabel_7_11_1_5);
		
		JLabel lblNewLabel_7_11_1_6 = new JLabel("");
		lblNewLabel_7_11_1_6.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_6.setBounds(1132, 326, 113, 20);
		getContentPane().add(lblNewLabel_7_11_1_6);
		
		JLabel lblNewLabel_7_11_1_6_1 = new JLabel("");
		lblNewLabel_7_11_1_6_1.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_6_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_6_1.setBounds(1129, 377, 113, 20);
		getContentPane().add(lblNewLabel_7_11_1_6_1);
		
		JLabel lblNewLabel_7_11_1_6_2 = new JLabel("");
		lblNewLabel_7_11_1_6_2.setForeground(Color.WHITE);
		lblNewLabel_7_11_1_6_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7_11_1_6_2.setBounds(1129, 431, 113, 20);
		getContentPane().add(lblNewLabel_7_11_1_6_2);
		
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("Select * from Mca where Id='"+textField.getText()+"'");
					System.out.println(textField.getText());
					
					if(rs.next())
					{
						System.out.println(rs.getString(1));
						Nametxt.setText(rs.getString("name"));
						lblNewLabel_7_11_1.setText(rs.getString("age"));
						lblNewLabel_7_11_1_1.setText(rs.getString("course"));
						lblNewLabel_7_11_1_2.setText(rs.getString("branch"));
						lblNewLabel_7_11_1_3.setText(rs.getString("email"));
						lblNewLabel_7_11_1_4.setText(rs.getString("fathername"));
						lblNewLabel_7_11_1_5.setText(rs.getString("mothername"));
						lblNewLabel_7_11_1_6.setText(rs.getString("Cae1"));
						lblNewLabel_7_11_1_6_1.setText(rs.getString("Cae2"));
						lblNewLabel_7_11_1_6_2.setText(rs.getString("Ese"));
						lblNewLabel_7_9.setVisible(true);
						lblNewLabel_7_8.setVisible(true);
						lblNewLabel_7_7.setVisible(true);
						lblNewLabel_8_1 .setVisible(true);
						lblNewLabel_8.setVisible(true);
						lblNewLabel_7_6 .setVisible(true);
						lblNewLabel_7_5.setVisible(true);
						lblNewLabel_7_4.setVisible(true);
						lblNewLabel_7_3.setVisible(true);
						lblNewLabel_7_2 .setVisible(true);
						lblNewLabel_7_1.setVisible(true);
						lblNewLabel_7.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No Student Found With This ID");
						setVisible(true);
					}
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select count(Id) from Mca");
			while(rs.next())
			{
				lblNewLabel_3.setText(rs.getString(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(952, 203, 89, 23);
		frame.getContentPane().add(btnNewButton);

		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminPage().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(1156, 610, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","msc");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("delete from Mca where Id='"+textField.getText()+"'");
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"DELETED");
						setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No Student Found With This ID");
					}
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(1041, 610, 89, 23);
		getContentPane().add(btnNewButton_2);
		//frame.setBounds(100, 100, 1329, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
