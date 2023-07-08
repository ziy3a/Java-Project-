package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = this;
		frame.getContentPane().setBackground(new Color(69, 173, 168));
		frame.setSize(9020, 1080);
		//frame.setBounds(100, 100, 1349, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 669, 700);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SIYAD\\Desktop\\DM casestudy\\Raj.jpg"));
		lblNewLabel.setBounds(0, 0, 636, 700);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(1090, 322, 108, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO RAJAGIRI COLLEGE ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 35));
		lblNewLabel_1.setBounds(720, 51, 563, 86);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("OF SOCIAL SCIENCE");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 35));
		lblNewLabel_2.setBounds(832, 109, 333, 67);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADMIN LOGIN");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(767, 316, 333, 48);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("STUDENT LOGIN");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(767, 387, 333, 48);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentLogin().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(1090, 393, 108, 38);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Loginpage().setVisible(true);
				frame.setVisible(false);
			}
		});
				
	}
}
