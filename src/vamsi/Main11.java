package vamsi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main11 extends JFrame {
	
    JFrame frame;
	
	JLabel label;
	
	JPanel panel;
	
	private JTextField textField;
	
	private JTextField textField_1;
	
	private JTextField textField_2;
	
	JCheckBox chckbxNewCheckBox;
	
	JLabel label_1;
	
	JLabel label_2;
	
	JLabel label_3;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\god5.jpg");
	
	String val;
	
	Main11()
	{
        frame = new JFrame();
        
		frame.setTitle("Create a Account");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		//JLabel lblNewLabel = new JLabel("UserName");
		//lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		//lblNewLabel.setBounds(52, 76, 110, 44);
		//panel.add(lblNewLabel);
		
		//JLabel lblNewLabel_1 = new JLabel("Password");
		//lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 20));
		//lblNewLabel_1.setBounds(52, 136, 110, 27);
		//panel.add(lblNewLabel_1);
  
		 label_1 = new JLabel();
		 
		 label_2 = new JLabel();
		 
		 label_3 = new JLabel();
		
		 label_1.setText("UserName");
	        
	     label_2.setText("Password");
	     
	     label_3.setText("UniqueCode");
	        
	     label_1.setBounds(52, 76, 110, 44);
			
	     label_2.setBounds(52, 136, 110, 27);
	     
	     label_3.setBounds(52, 28, 143, 26);
	     
	     label_1.setForeground(Color.WHITE);
	     
	     label_2.setForeground(Color.WHITE);
	     
	     label_3.setForeground(Color.WHITE);
			
		 label_1.setFont(new Font("Stencil", Font.BOLD, 20));
			
		 label_2.setFont(new Font("Stencil", Font.BOLD, 20));
		 
		 label_3.setFont(new Font("Stencil", Font.BOLD, 20));
			
		 panel.add(label_1);
			
		 panel.add(label_2);
		
		 panel.add(label_3);
		 
		 JLabel label_4 = new JLabel("");
			
		 label_4.setIcon(image);
			
		 label_4.setVerticalTextPosition(JLabel.CENTER);
			
		 label_4.setVerticalAlignment(0);
			
		 label_4.setBounds(0, 0, 434, 261);
			
		 panel.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(217, 89, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(217, 140, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("I'm Not A Robot");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(52, 215, 110, 23);
		chckbxNewCheckBox.setFocusable(false);
		panel.add(chckbxNewCheckBox);
		
		//JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		//rdbtnNewRadioButton.setBounds(126, 178, 50, 23);
		//panel.add(rdbtnNewRadioButton);
		
		//JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		//rdbtnNewRadioButton_1.setBounds(188, 178, 62, 23);
		//panel.add(rdbtnNewRadioButton_1);
		
		String[] gender = {"male","female","others"};
		
		JComboBox comboBox = new JComboBox(gender);
		comboBox.setBounds(124, 180, 55, 22);
	    panel.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(52, 180, 60, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UniqueCode = textField_2.getText();
	            
		 		String Name = textField.getText();
           
		 		String password = textField_1.getText();
		 		
		 		 try
	                {
	                	if(UniqueCode.isEmpty()!=true && Name.isEmpty()!=true && password.isEmpty()!=true )
	                	{
	                		if(!UniqueCode.equals("CompanyOwner123") || !UniqueCode.equals("CompanyOwner456") || !UniqueCode.equals("CompanyOwner789"))
	                		{
	                			JOptionPane.showMessageDialog(btnNewButton,"Please Enter Unique Code Correctly");
	                		}
	                		
	                		if(UniqueCode.equals("CompanyOwner123") && comboBox.getSelectedItem().equals("male") || UniqueCode.equals("CompanyOwner456") && comboBox.getSelectedItem().equals("female") || UniqueCode.equals("CompanyOwner789") && comboBox.getSelectedItem().equals("others"))
	                		{
	                			if(chckbxNewCheckBox.isSelected()==true)
	                			{
	                				String url = "jdbc:mysql://localhost:3306/vamsi";
		         					
		        		 			String user = "root";
		        		 					
		        		 			String password_1 = "8500095971@Vk";
		        		 					
		        		 			Class.forName("com.mysql.cj.jdbc.Driver");
		        		 					
		        		 			Connection conn = DriverManager.getConnection(url,user,password_1);
		        		 					
		        		 			Statement st = conn.createStatement();
		        		 				
		                            String query = "INSERT INTO employeedetail values('" + Name + "','" + password + "')";

		                            int x = st.executeUpdate(query);
		                        
		                            if (x == 0) 
		                            {
		                            	JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
		                            } 
		                            else 
		                            {
		                                JOptionPane.showMessageDialog(btnNewButton,
		                                		
		                                "Welcome, " + Name + " Your Account is sucessfully Created");
		                            }
		                            
		                            JOptionPane.showMessageDialog(btnNewButton,"Thanks For Filling This Form You Can Login Now");
		                            
		                            frame.dispose();
		                            
		                            conn.close();
	                				
	                			}
	                            
	                		}
	                	}
	                	
	                	else
	                	{
	                		if(UniqueCode.isEmpty()==true)
	                		{
	                			JOptionPane.showMessageDialog(btnNewButton,"Enter UniqueCode In TextField");
	                		}
	                		
	                		else if(Name.isEmpty()==true)
	                		{
	                			JOptionPane.showMessageDialog(btnNewButton,"Enter Name In TextField");
	                		}
	                		
	                		else if(password.isEmpty()==true)
	                		{
	                			JOptionPane.showMessageDialog(btnNewButton,"Enter password In TextField");
	                		}
	                		
	                		else if(chckbxNewCheckBox.isSelected()==false)
	                		{
	                			JOptionPane.showMessageDialog(btnNewButton,"Please Click The Check Box");
	                		}
	                	}
	                }
	                	
	                	catch (Exception ei)
	                    {
	                          ei.printStackTrace();
	                    }
	               }
	        });
	    
		btnNewButton.setBounds(217, 215, 89, 23);
		panel.add(btnNewButton);
		
		//JLabel lblNewLabel_2 = new JLabel("UniqueCode");
		//lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 20));
		//lblNewLabel_2.setBounds(52, 28, 143, 26);
		//panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 32, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
	
	
	}

}
