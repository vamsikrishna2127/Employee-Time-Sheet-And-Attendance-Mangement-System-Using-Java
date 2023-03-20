package vamsi;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.*;

public class Main2 extends JFrame {
	
	JFrame frame;

	JPanel panel;
	
	JLabel label;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\ghost.png");
	
	Main2() 
	{
		frame = new JFrame();
		
		frame.setTitle("AD COVID - 19 SAFETY");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
        panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		panel.setBackground(Color.YELLOW);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Three Golden Rules");
		
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		
		lblNewLabel.setBounds(80, 24, 350, 37);
		
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1.  \"Always Wear Mask\"");
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNewLabel_1.setBounds(80, 82, 207, 27);
		
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2.  \"Wash Hands With Soap\"");
		
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNewLabel_2.setBounds(80, 120, 262, 26);
		
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3.  \"Maintain Social Distance\"");
		
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNewLabel_3.setBounds(80, 157, 234, 28);
		
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("** Be Socially Responsible **");
		
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNewLabel_4.setBounds(80, 196, 234, 30);
		
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel();
		
		lblNewLabel_5.setIcon(image);
		
		lblNewLabel_5.setVerticalTextPosition(JLabel.TOP);
		
		lblNewLabel_5.setVerticalAlignment(0);
		
		lblNewLabel_5.setBounds(348, 100, 76, 80);
		
		panel.add(lblNewLabel_5);
		
	}
}