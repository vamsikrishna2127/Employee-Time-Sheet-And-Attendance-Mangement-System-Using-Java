package vamsi;

import javax.swing.*;

import javax.swing.border.EmptyBorder;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

class Main0 extends JFrame {
	
    JFrame frame;
	
	JLabel label;
	
	JPanel panel;
	
	JLabel lblNewLabel;
	
	JLabel lblNewLabel_1;
	
	JButton btnNewButton;
	
	ImageIcon image;
	
	Main0()
	{
		image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\2dgraphics_2.jpg");
		
        frame = new JFrame();
        
		frame.setTitle("Welcome Page");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(500, 500, 550, 550);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
        panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(panel);
		
		panel.setLayout(null);
		
        lblNewLabel = new JLabel("WELCOME TO EMPLOYEE PORTAL");
		
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 28));
		
		lblNewLabel.setBounds(30, 25, 420, 40);
		
		panel.add(lblNewLabel);
		
        lblNewLabel_1 = new JLabel();
		
        lblNewLabel_1.setIcon(image);
		
		lblNewLabel_1.setVerticalTextPosition(JLabel.CENTER);
		
		lblNewLabel_1.setVerticalAlignment(0);
		
        lblNewLabel_1.setBounds(25,25,480,480);
		
		panel.add(lblNewLabel_1 );
		
        btnNewButton = new JButton("Registration Form");
		
		btnNewButton.setBounds(340, 450, 150, 23);
		
		btnNewButton.setFocusable(false);
		
		panel.add(btnNewButton);
		
        btnNewButton.addActionListener(new ActionListener() {
	 		
			public void actionPerformed(ActionEvent evt) {
						 	
				Main5 NewWindow_3 = new Main5();
				
				frame.dispose();
				
				}
								 
			});
	}
		
}