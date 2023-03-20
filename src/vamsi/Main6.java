package vamsi;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder; 

public class Main6 extends JFrame {
	
    JFrame frame;
	
	JLabel label;
	
	JLabel label_1;

	JPanel panel;
	
	JPanel panel1;
	
	JLabel lblNewLabel;
	
	JLabel lblNewLabel_1;
	
	JLabel lblNewLabel_2;
	
	JLabel lblNewLabel_3;
	
	JLabel lblNewLabel_4;
	
	JButton btnNewButton;
	
	JButton btnNewButton_1;
	
	JButton btnNewButton_2;
	
	JButton btnNewButton_3;
	
	JButton btnNewButton_4;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\logo.jpg");
	
	ImageIcon image_1 = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\employee.png");
	
	Main6()
	{
		frame = new JFrame();
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.add(panel);
		panel.setLayout(null);
		
		panel1= new JPanel();
        label_1 = new JLabel();
        label_1.setIcon(image_1);
        label_1.setVerticalTextPosition(JLabel.TOP);
        label_1.setVerticalAlignment(0);
		panel1.setBounds(10, 11, 165, 239);
		panel1.add(label_1);
		panel.add(panel1);
		
		lblNewLabel = new JLabel("Employees Data");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel.setBounds(187, 11, 181, 40);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New Applications");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(187, 73, 139, 19);
		panel.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Click Me");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main7 obj_5 = new Main7();
			}
		});
		btnNewButton.setBounds(336, 73, 89, 23);
		panel.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Salary Report");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(187, 114, 123, 19);
		panel.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("Click Me");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main8 obj6 = new Main8();
				
			}
		});
		btnNewButton_1.setBounds(336, 114, 89, 23);
		panel.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("Time Sheet");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(187, 159, 123, 19);
		panel.add(lblNewLabel_3);
		
		btnNewButton_2 = new JButton("Click Me");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main9 obj7 = new Main9();
				
			}
		});
		btnNewButton_2.setBounds(336, 159, 89, 23);
		panel.add(btnNewButton_2);
	
		
		lblNewLabel_4 = new JLabel("Others");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(187, 208, 139, 19);
		panel.add(lblNewLabel_4);
		
		btnNewButton_3 = new JButton("Click Me");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main15 obj_7 = new Main15();
				
				frame.dispose();
				
			}
		});
		btnNewButton_3.setBounds(336, 208, 89, 23);
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(374, 19, 55, 23);
		panel.add(btnNewButton_4);
	}
	
}