package mainpackage;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage extends JFrame{

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = this;
		frame.getContentPane().setBackground(new Color(68, 183, 180));
		//frame.setBounds(100, 100, 1329, 716);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 661, 679);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.setSize(9020, 1080);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 55));
		lblNewLabel.setBounds(143, 349, 368, 76);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\WElcome3.jpg"));
		lblNewLabel_1.setBounds(67, 98, 505, 286);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADMIN");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 34));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(271, 412, 192, 51);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADMIN");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 55));
		lblNewLabel_3.setBounds(886, 65, 260, 81);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\Course Icon2.jpg"));
		lblNewLabel_4.setBounds(727, 260, 220, 197);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SELECT COURSE");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(1005, 260, 209, 43);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Log out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Loginpage().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(946, 568, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("MCA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new McaDetails().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(68, 183, 180));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 26));
		btnNewButton.setBounds(969, 353, 89, 51);
		getContentPane().add(btnNewButton);
		
		JButton btnMsc = new JButton("MSC");
		btnMsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MscDetails().setVisible(true);
				setVisible(false);
			}
		});
		btnMsc.setBackground(new Color(68, 183, 180));
		btnMsc.setForeground(new Color(255, 255, 255));
		btnMsc.setFont(new Font("Cambria", Font.BOLD, 26));
		btnMsc.setBounds(1068, 353, 89, 51);
		getContentPane().add(btnMsc);
		
		JButton btnMsw = new JButton("MSW");
		btnMsw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MswDetails().setVisible(true);
				setVisible(false);
			}
		});
		btnMsw.setBackground(new Color(68, 183, 180));
		btnMsw.setForeground(new Color(255, 255, 255));
		btnMsw.setFont(new Font("Cambria", Font.BOLD, 26));
		btnMsw.setBounds(1167, 353, 106, 51);
		getContentPane().add(btnMsw);
	}
}
