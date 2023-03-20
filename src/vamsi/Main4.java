package vamsi;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main4 {
	
	JFrame Frame_1 = new JFrame();
	
	JLabel label   = new JLabel();
	
	JLabel label_1 = new JLabel();
	
	JLabel label_2 = new JLabel();
	
	JLabel label_3 = new JLabel();
	
	JLabel label_4 = new JLabel();
	
	JLabel label_5 = new JLabel();
	
	JButton btnNewButton_4;
	
	//Image Icon
	
	ImageIcon image = new ImageIcon("C://Users//VOOHA//Documents//Ds-programs//NewLoginSystem//ghost.png");
	
	Main4()
	{
		// Label
		
		label_1.setIcon(image);
		
		label_1.setVerticalTextPosition(JLabel.TOP);
		
		label_1.setVerticalAlignment(0);
		
		label_1.setText("Three Golden Rules");
		
		label_2.setText("1. Always Wear Mask");
		
		label_3.setText("2. Wash Hands With Soap");
		
		label_4.setText("3. Maintain Social Distance");
		
		label_5.setText("* Be Socially Responsible *");
		
		label_1.setBounds(57, 66,  190, 35);
		
		label_2.setBounds(60, 111, 190, 35);
		
		label_3.setBounds(60, 148, 190, 35);
		
		label_4.setBounds(60, 186, 190, 35);
		
		label_5.setBounds(60, 240, 190, 35);
		
		label_1.setForeground(new Color(0xFFFFFF));
		
		label_1.setFont(new Font(null,Font.ITALIC,40));
		
		label_2.setForeground(new Color(0xFFFFFF));
		
		label_2.setFont(new Font(null,Font.ITALIC,25));
		
		label_3.setForeground(new Color(0xFFFFFF));
		
		label_3.setFont(new Font(null,Font.ITALIC,25));
		
		label_4.setForeground(new Color(0xFFFFFF));
		
		label_4.setFont(new Font(null,Font.ITALIC,25));
		
		label_5.setForeground(new Color(0xFFFFFF));
		
		label_5.setFont(new Font(null,Font.ITALIC,25));

		Frame_1 = new JFrame();
		
		Frame_1.setTitle("AD COVID - 19 SAFETY");
		
		Frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Frame_1.setResizable(false);
		
		Frame_1.setLayout(null);
					
		Frame_1.setSize(500,500);
					
		Frame_1.setVisible(true);
		
		Frame_1.setContentPane(new JLabel(new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\Nature.jpeg")));
		
		Frame_1.setLayout(new FlowLayout());
		
		label = new JLabel();
		
		Frame_1.add(label);
		
		Frame_1.setSize(500,500);
		
		Frame_1.add(label_1);
		
		Frame_1.add(label_2);
		
		Frame_1.add(label_3);
		
		Frame_1.add(label_4);
		
		Frame_1.add(label_5);
		
		btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame_1.dispose();
			}
		});
		btnNewButton_4.setBounds(470, 19, 55, 23);
		Frame_1.add(btnNewButton_4);
		
	}

}