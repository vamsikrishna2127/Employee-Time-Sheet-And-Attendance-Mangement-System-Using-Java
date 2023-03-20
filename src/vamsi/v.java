package vamsi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v frame = new v();
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
	public v() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Deleting Values From Database");
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		lblNewLabel.setBounds(24, 95, 389, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 146, 75, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New Applications");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_2.setBounds(24, 89, 171, 33);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(125, 154, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(548, 154, 98, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Pin Number");
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(548, 95, 109, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Salary Report");
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_4.setBounds(254, 92, 146, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Emp Id");
		lblNewLabel_5.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_5.setBounds(254, 150, 58, 25);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(361, 154, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(24, 190, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(254, 190, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("*Please Enter The Pin Number Correctly  ");
		lblNewLabel_7.setBounds(450, 194, 219, 14);
		contentPane.add(lblNewLabel_7);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(567, 314, 146, 23);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_8 = new JLabel("Process Will Be Executed Here");
		lblNewLabel_8.setBounds(537, 240, 146, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("Time Sheet");
		lblNewLabel_6.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_6.setBounds(24, 240, 124, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("Employee Details");
		lblNewLabel_9.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_9.setBounds(254, 240, 193, 23);
		contentPane.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(361, 293, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 293, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(24, 327, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(254, 327, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_10.setBounds(24, 287, 86, 23);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_11.setBounds(254, 287, 89, 23);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Original Id");
		lblNewLabel_12.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_12.setBounds(423, 29, 117, 30);
		contentPane.add(lblNewLabel_12);
		
		textField_4 = new JTextField();
		textField_4.setBounds(548, 37, 98, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(405, 22, 68, 23);
		contentPane.add(btnNewButton_4);
	}
}
