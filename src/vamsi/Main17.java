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
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Main17 extends JFrame {
	
	JFrame frame;
	
	JPanel contentPane;
	
	static JTextField textField;
	
	static JPasswordField passwordField;
	
	static JTextField textField_1;
	
	static JTextField textField_2;
	
	static JTextField textField_3;
	
	final static String Pin_Number = "9";
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\image7.jpg");
	
	Main17()
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
		
		JLabel lblNewLabel = new JLabel("Deleting Values From Database");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		lblNewLabel.setBounds(24, 22, 389, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.WHITE);
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
		passwordField.setBounds(559, 154, 98, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Pin Number");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(559, 95, 109, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Salary Report");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_4.setBounds(254, 92, 146, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Emp Id");
		//lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_5.setBounds(254, 150, 58, 25);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(361, 154, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("NA.Delete");
		btnNewButton.setFocusable(false);
        btnNewButton.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
 				
 				String NewApplications = textField.getText();
 				
 				String Number = passwordField.getText();
 	            
	 			try
	 			{
	 				if(Number.equals(Pin_Number)) 
	 				{
	 					if(NewApplications.isEmpty()!=true)
	 					{
	 						String url = "jdbc:mysql://localhost:3306/vamsi";
	     					
	    		 			String user = "root";
	    		 					
	    		 			String password1 = "8500095971@Vk";
	    		 					
	    		 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		 					
	    		 			Connection conn = DriverManager.getConnection(url,user,password1);
	    		 			
	    		 			Statement st = conn.createStatement();  
	    		 			
	    		 			String query1 = ("DELETE from register WHERE firstName = '" + NewApplications + "' ");
	    		 			          
	    		 			st.executeUpdate(query1);
	    		 	     
	    		 			JOptionPane.showMessageDialog(btnNewButton,"Record Is Deleted From The Table Successfully..............");
	    		 					
	    		 			st.close();
	    		 	        
	    		 			conn.close();  

	    		 			clear();
	 					}
            		}
	 				
	 				else if(NewApplications.isEmpty()==true)
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter The Name");
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
		btnNewButton.setBounds(24, 190, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SR.Delete");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			
	 		public void actionPerformed(ActionEvent e) {
 				
 				String SalaryReport = textField_1.getText();
 				
 				String number = passwordField.getText();
 	            
	 			try
	 			{
	 				if(number.equals(Pin_Number)) 
	 				{
	 					if(SalaryReport.isEmpty()!=true)
	 					{
	 						String url = "jdbc:mysql://localhost:3306/vamsi";
	     					
	    		 			String user = "root";
	    		 					
	    		 			String password1 = "8500095971@Vk";
	    		 					
	    		 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		 					
	    		 			Connection conn = DriverManager.getConnection(url,user,password1);
	    		 			
	    		 			Statement st = conn.createStatement();  
	    		 			
	    		 			String query1 = ("DELETE from register WHERE firstName = '" + SalaryReport + "' ");
	    		 			          
	    		 			st.executeUpdate(query1);
	    		 	     
	    		 			JOptionPane.showMessageDialog(btnNewButton,"Record Is Deleted From The Table Successfully");
	    		 					
	    		 			st.close();
	    		 	        
	    		 			conn.close();  

	    		 			clear();
	 					}
            		}
	 				
	 				else if(SalaryReport.isEmpty()==true)
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter The Name");
	 				}
	 				
	 				else
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter Pin Number Correctly");
	 				}
	 			}	 			
	 			catch(Exception e1)
	 			{
	 				e1.printStackTrace();
	 			}
	 			
	 		}
	 		
        });

		btnNewButton_1.setBounds(254, 190, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("*Please Enter The Pin Number Correctly");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(450, 194, 240, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Time Sheet");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_6.setBounds(24, 240, 124, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_9 = new JLabel("Employee Details");
		lblNewLabel_9.setForeground(Color.WHITE);
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
		
		JButton btnNewButton_2 = new JButton("TS.Delete");
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
 				
 				String TimeSheet = textField_3.getText();
 				
 				String number = passwordField.getText();
 	            
	 			try
	 			{
	 				if(number.equals(Pin_Number)) 
	 				{
	 					if(TimeSheet.isEmpty()!=true)
	 					{
	 						String url = "jdbc:mysql://localhost:3306/reportoctober";
	     					
	    		 			String user = "root";
	    		 					
	    		 			String password1 = "8500095971@Vk";
	    		 					
	    		 			Class.forName("com.mysql.cj.jdbc.Driver");
	    		 					
	    		 			Connection conn = DriverManager.getConnection(url,user,password1);
	    		 			
	    		 			Statement st = conn.createStatement();  
	    		 			
	    		 			String query2 = ("DELETE from time_sheet_database WHERE EMP_ID = '" + TimeSheet + "' ");
	    		 			          
	    		 			st.executeUpdate(query2);
	    		 	     
	    		 			JOptionPane.showMessageDialog(btnNewButton,"Record Is Deleted From The Table Successfully");
	    		 					
	    		 			st.close();
	    		 	        
	    		 			conn.close();  

	    		 			clear();
	 					}
            		}
	 				
	 				else if(TimeSheet.isEmpty()==true)
	 				{
	 					JOptionPane.showMessageDialog(btnNewButton,"Please Enter The EmpId ");
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
		btnNewButton_2.setBounds(24, 327, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ED.Delete");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(254, 327, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("Emp Id");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_10.setBounds(24, 287, 86, 23);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New Label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_11.setBounds(254, 287, 89, 23);
		contentPane.add(lblNewLabel_11);
		
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
 		
	    passwordField.setText("");
	}
	
}