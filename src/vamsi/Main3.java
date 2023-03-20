package vamsi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Main3 extends JFrame{
	
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\photo.jpeg");
	
	Main3() 
	{
		frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		
		panel = new JPanel();
		//panel.setBackground(Color.CYAN);
		label = new JLabel();
		label.setIcon(image);
		panel.add(label);
		frame.add(panel);
		panel.setLayout(null);
		
		//JLabel lblNewLabel = new JLabel("UserName");
		//lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		//lblNewLabel.setBounds(52, 50, 110, 44);
		//panel.add(lblNewLabel);
		
		//JLabel lblNewLabel_1 = new JLabel("Password");
		//lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 20));
		//lblNewLabel_1.setBounds(52, 136, 110, 27);
		//panel.add(lblNewLabel_1);
		
		 label_1 = new JLabel();
		 
		 label_2 = new JLabel();
		
		 label_1.setText("UserName");
	        
	     label_2.setText("Password");
	        
	     label_1.setBounds(52, 50, 110, 44);
			
	     label_2.setBounds(52, 136, 110, 27);
	     
	     label_1.setForeground(Color.WHITE);
	     
	     label_2.setForeground(Color.WHITE);
			
		 label_1.setFont(new Font("Stencil", Font.BOLD, 20));
			
		 label_2.setFont(new Font("Stencil", Font.BOLD, 20));
			
		 panel.add(label_1);
			
		 panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(217, 63, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 140, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
        JLabel label_3 = new JLabel("");
		
        label_3.setIcon(image);
		
        label_3.setVerticalTextPosition(JLabel.CENTER);
		
        label_3.setVerticalAlignment(0);
		
        label_3.setBounds(0, 0, 434, 261);
		
		panel.add(label_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(359, 26, 60, 23);
		panel.add(btnNewButton_4);
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
	 			      
		 			String url = "jdbc:mysql://localhost:3306/vamsi";
		 					
		 			String user = "root";
		 					
		 			String password = "8500095971@Vk";
		 					
		 			Class.forName("com.mysql.cj.jdbc.Driver");
		 					
		 			Connection conn = DriverManager.getConnection(url,user,password);
		 					
		 			Statement st = conn.createStatement();
		 					
		 			String sql = "Select * from EmployeeDetail where UserName = '"+textField.getText()+"' and Password = '"+textField_1.getText()+"'";
		 			
		 			ResultSet rs = st.executeQuery(sql);
		 					
		 			if(rs.next())
		 			{  
		 				Main6 obj_5 = new Main6();
		 				
		 				frame.dispose();
		 			}
		 			
		 			else
		 			{
		 				JOptionPane.showMessageDialog(null, "Incorrect Username or Password...", "Error",JOptionPane.WARNING_MESSAGE);
		 			}
		 			
		 			conn.close();
		 		 }
		 		 catch(Exception s)
		 		 {
		 			s.getStackTrace();
		 		 }
				
			}
		});
		btnNewButton.setBounds(217, 215, 89, 23);
		panel.add(btnNewButton);
	
	}
}