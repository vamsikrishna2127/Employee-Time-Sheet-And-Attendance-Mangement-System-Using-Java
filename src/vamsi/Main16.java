package vamsi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Main16 extends JFrame{
	
	JFrame frame;
	
	JPanel contentPane;
	
	JLabel lblNewLabel;
	
	JLabel lblNewLabel_1;
	
	JLabel lblNewLabel_2;
	
	JLabel lblNewLabel_3;
	
	JLabel lblNewLabel_4;
	
	JLabel lblNewLabel_5;
	
	JLabel lblNewLabel_6;
	
	JLabel lblNewLabel_7;
	
	JLabel lblNewLabel_8;
	
	JLabel lblNewLabel_9;
	
	JLabel lblNewLabel_10;
	
	static JTextField textField;
	
	static JTextField textField_1;
	
	static JTextField textField_2;
	
	static JTextField textField_3;
	
	static JTextField textField_4;
	
	static JPasswordField passwordField;
	
	private final static String Pin_Number = "9";
	
	String original_id;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\image7.jpg");
	
	Main16()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 750, 400);
		frame.setResizable(false);
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.add(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Updateing Values From Database");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		lblNewLabel.setBounds(24, 22, 389, 42);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 146, 75, 33);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Account ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_2.setBounds(24, 89, 92, 33);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_9 = new JLabel("Password");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_9.setBounds(24, 198, 75, 33);
		contentPane.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(125, 154, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 206, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(587, 154, 98, 20);
		contentPane.add(passwordField);
		
	    lblNewLabel_3 = new JLabel("Pin Number");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(587, 95, 109, 23);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Time Sheet");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_4.setBounds(338, 92, 105, 26);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Emp Id");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_5.setBounds(338, 150, 58, 25);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(419, 154, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_6.setBounds(338, 209, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(419, 206, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Original Id");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_10.setBounds(423, 29, 117, 30);
		contentPane.add(lblNewLabel_10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(548, 37, 98, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("A.Update");
		btnNewButton.setFocusable(false);
        btnNewButton.addActionListener(new ActionListener() {
	 		
        	public void actionPerformed(ActionEvent e) {
 				
 				String Username = textField.getText();
 	            
		 		String password = textField_1.getText();
		 		
		 		original_id = textField_4.getText();
		 		
				String Number = passwordField.getText();
	 			
	 			try
	 			{
	 				if(Number.equals(Pin_Number)) 
	 				{
	 					if(Username.isEmpty()!=true && password.isEmpty()!=true && original_id.isEmpty()!=true)
	 					{
	 						String url = "jdbc:mysql://localhost:3306/vamsi";
	     					
	    		 			String user = "root";
	    		 					
	    		 			String password1 = "8500095971@Vk";
	    		 					
	    		 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		 					
	    		 			Connection conn = DriverManager.getConnection(url,user,password1);
	    		 			
	    		 			Statement st = conn.createStatement();  
	    		 	      
	    		 			st.execute("UPDATE employeedetail SET UserName = '" + Username + "', Password='" + password + "' WHERE UserName = '" + original_id + "' ");  
	    		 	        
	    		 			JOptionPane.showMessageDialog(btnNewButton,"Entered Data Is Successfully Updated");
		    	 			
	    		 			st.close();  
	    		 	        
	    		 			conn.close();  

	    		 			clear();
            			
	 					}
            		}
	 				
	 				else if(Username.isEmpty()==true && password.isEmpty()==true && original_id.isEmpty()==true)
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter Username,password And Original_id Correctly");
	 				}
	 				
	 				else
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter Pin Number Correctly");
	 				}
	 				
	 			}	 			
	 			catch(Exception v)
	 			{
	 				v.printStackTrace();
	 			}
	 			
        	}
	    });
		btnNewButton.setBounds(24, 270, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("T.Update");
		btnNewButton_1.setFocusable(false);
        btnNewButton_1.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
 				
 				String emp_id = textField_2.getText();
 	            
		 		String Name = textField_3.getText();
		 		
		 		original_id = textField_4.getText();
		 		
				String number = passwordField.getText();
	 			
	 			try
	 			{
	 				if(number.equals(Pin_Number)) 
	 				{
	 					if(emp_id.isEmpty()!=true && Name.isEmpty()!=true && original_id.isEmpty()!=true)
	 					{
	 						String url = "jdbc:mysql://localhost:3306/reportoctober";
	     					
	    		 			String user = "root";
	    		 					
	    		 			String password1 = "8500095971@Vk";
	    		 					
	    		 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		 					
	    		 			Connection conn = DriverManager.getConnection(url,user,password1);
	    		 			
	    		 			Statement st = conn.createStatement();  
	    		 	      
	    		 			st.execute("UPDATE time_sheet_database SET EMP_ID = '" + emp_id + "', NAME ='" + Name + "' WHERE NAME = '" + original_id + "' ");  
	    		 	        
	    		 			JOptionPane.showMessageDialog(btnNewButton,"Entered Data Is Successfully Updated");
		    	 			
	    		 			st.close();
	    		 	        
	    		 			conn.close();  

	    		 			clear();
	 					}
            		}
	 				
	 				else if(emp_id.isEmpty()==true && Name.isEmpty()==true && original_id.isEmpty()==true)
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter Emp_Id,Name And Original_id Correctly");
	 				}
	 				
	 				else
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter Pin Number Correctly");
	 				}
	 			}	 			
	 			catch(Exception v)
	 			{
	 				v.printStackTrace();
	 			}
	 			
	 		}
	 		
        });
		btnNewButton_1.setBounds(338, 270, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_7 = new JLabel("*Please Enter The Pin Number Correctly  ");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(24, 323, 244, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel label_6 = new JLabel("");
		
		label_6.setIcon(image);
			
		label_6.setVerticalTextPosition(JLabel.CENTER);
			
		label_6.setVerticalAlignment(0);
			
		label_6.setBounds(0, 0, 745, 400);
			
		contentPane.add(label_6);
		
		JButton btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(656, 36, 68, 23);
		contentPane.add(btnNewButton_4);
	}
	
	public static void clear()
	{
		textField.setText("");
         
 		textField_1.setText("");
 		
 		textField_2.setText("");
 		
 		textField_3.setText("");
 		
 		textField_4.setText("");
 		
	    passwordField.setText("");
	}
	
}


