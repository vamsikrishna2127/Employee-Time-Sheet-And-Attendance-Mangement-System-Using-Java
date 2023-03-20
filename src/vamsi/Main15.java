package vamsi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class Main15 extends JFrame {

	private JPanel contentPane;
	
	JFrame frame;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\photo1.jfif");

	Main15() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 301);
		frame.setResizable(false);
		frame.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.add(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make Changes U Need In MySql Database");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 19));
		lblNewLabel.setBounds(45, 21, 368, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Updating Values From Database");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(45, 75, 231, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Deleting Values From Database");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(45, 117, 215, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Updating");
		btnNewButton.setFocusable(false);
        btnNewButton.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			Main16 obj = new Main16();
	 		}
	 		
        });
		btnNewButton.setBounds(335, 81, 99, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deletion");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			Main17 obj = new Main17();
	 		}
	 		
        });
		btnNewButton_1.setBounds(335, 115, 99, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("--->");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(279, 85, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("--->");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(279, 117, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Data Available In Database");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(45, 148, 199, 29);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Button- 1");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main7 obj1 = new Main7();	
			}
		});	
		btnNewButton_2.setBounds(45, 188, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Button- 2");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main8 obj2 = new Main8();
			}
		});
		btnNewButton_3.setBounds(45, 222, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Button- 3");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main9 obj3 = new Main9();
			}
		});
		btnNewButton_4.setBounds(157, 188, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Button- 4");
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main10 obj4 = new Main10();
			}
		});
		btnNewButton_5.setBounds(157, 222, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JTextPane txtpnButtonnewapplications = new JTextPane();
		txtpnButtonnewapplications.setText("Button- 1 (New Applications)  Button- 2 (Salary Report)    Button- 3 (Time Sheet)         Button- 4 (Employee Details)");
		txtpnButtonnewapplications.setBounds(279, 183, 168, 72);
		contentPane.add(txtpnButtonnewapplications);
		
		JButton btnNewButton_6 = new JButton("EXIT");
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_6.setBounds(412, 22, 62, 23);
		contentPane.add(btnNewButton_6);
		
        JLabel label_6 = new JLabel("");
		
		label_6.setIcon(image);
			
		label_6.setVerticalTextPosition(JLabel.CENTER);
			
		label_6.setVerticalAlignment(0);
			
		label_6.setBounds(0, 0, 500, 300);
			
		contentPane.add(label_6);
	}
}

