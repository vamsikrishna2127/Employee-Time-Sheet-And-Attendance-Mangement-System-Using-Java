package vamsi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main12 {
	
    JFrame frame;
	
	JLabel label;
	
	JPanel panel;
	
	ImageIcon Image;
	
	private JTextField textField;
	
	private JTextField textField_1;
	
	private JTextField textField_2;
	
	ImageIcon image1 = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\photo4.jpeg");

	Main12()
	{
        frame = new JFrame();
        
		frame.setTitle("Main Menu");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel.setBounds(52, 63, 188, 44);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Window");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel_1.setBounds(52, 118, 172, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Want To See Any Thing");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_2.setBounds(52, 25, 247, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ADVERTISEMENT");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel_3.setBounds(52, 156, 188, 27);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Click Here");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main11 NewWindow_5 = new Main11();
			}
		});
		btnNewButton.setBounds(280, 76, 94, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Click Here");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main3 NewWindow_5 = new Main3();
				
			}
		});
		btnNewButton_1.setBounds(280, 118, 94, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Click Here");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main2 obj_3 = new Main2();
			}
		});
		btnNewButton_2.setBounds(280, 156, 94, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Apply For Job");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel_4.setBounds(52, 194, 164, 25);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("Click Here");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main0 NewWindow_2 = new Main0();
			}
		});
		btnNewButton_3.setBounds(280, 190, 93, 23);
	    panel.add(btnNewButton_3);
	    
	    JLabel label_6 = new JLabel("");
		
		label_6.setIcon(image1);
			
		label_6.setVerticalTextPosition(JLabel.CENTER);
			
		label_6.setVerticalAlignment(0);
			
		label_6.setBounds(0, 0, 450, 300);
			
		panel.add(label_6);

	}

}
