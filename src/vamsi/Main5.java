package vamsi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Main5 extends JFrame{
	
	JFrame frame;
	
	JLabel label;
	
	JPanel panel;
	
	private JTextField textField;
	
	private JTextField textField_1;
	
	private JTextField textField_2;
	
	private JTextField textField_3;
	
	private JTextField textField_4;
	
	private JTextField textField_5;
	
	//ImageIcon image = new ImageIcon("C://Users//VOOHA//Documents//Ds-programs//NewLoginSystem//ghost.png");
	
	ImageIcon image1 = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\photo8.jpg");

	Main5()
	{
        frame = new JFrame();
        
		frame.setTitle("Registration Page");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 450, 300);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FirstName");
		
		lblNewLabel.setForeground(Color.WHITE);
		
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel.setBounds(27, 70, 101, 25);
		
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LastName");
		
		lblNewLabel_1.setForeground(Color.WHITE);
		
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel_1.setBounds(27, 118, 78, 25);
		
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		
		lblNewLabel_2.setForeground(Color.WHITE);
		
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel_2.setBounds(27, 169, 56, 25);
		
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New Application Form");
		
		lblNewLabel_3.setForeground(Color.WHITE);
		
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		
		lblNewLabel_3.setBounds(115, 11, 270, 25);
		
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Qualification");
		
		lblNewLabel_4.setForeground(Color.WHITE);
		
		lblNewLabel_4.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel_4.setBounds(226, 72, 99, 16);
		
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CGPA");
		
		lblNewLabel_5.setForeground(Color.WHITE);
		
		lblNewLabel_5.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel_5.setBounds(225, 122, 79, 14);
		
        panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("MoblieNo");
		
		lblNewLabel_6.setForeground(Color.WHITE);
		
		lblNewLabel_6.setFont(new Font("Stencil", Font.PLAIN, 15));
		
		lblNewLabel_6.setBounds(226, 173, 78, 14);
		
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		
		textField.setBounds(130, 71, 86, 20);
		
		panel.add(textField);
		
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(129, 119, 86, 20);
		
		panel.add(textField_1);
		
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		
		textField_2.setBounds(130, 170, 86, 20);
		
		panel.add(textField_2);
		
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		
		textField_3.setBounds(314, 69, 86, 20);
		
		panel.add(textField_3);
		
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		
		textField_4.setBounds(314, 119, 86, 20);
		
		panel.add(textField_4);
		
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		
		textField_5.setBounds(314, 170, 86, 20);
		
		panel.add(textField_5);
		
		textField_5.setColumns(10);
		
		JButton button = new JButton("AD");
			
		button.setFocusable(false);
		
        button.addActionListener(new ActionListener() {
	 		
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		Main4 obj_5 = new Main4();
		 		
		 	}
		 	
		 	});
        
        button.setBounds(125, 216, 89, 23);
		
		panel.add(button);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(31, 216, 70, 23);
		panel.add(btnNewButton_4);
    	
      		
        JButton btnNewButton = new JButton("Register");
		
		btnNewButton.setFocusable(false);
		
		//btnNewButton.setEnabled(false);
		
		btnNewButton.addActionListener(new ActionListener() {
	 		
		 	public void actionPerformed(ActionEvent e) {
           
		 		String firstName = textField.getText();
            
		 		String lastName = textField_1.getText();
           
		 		String emailId = textField_2.getText();
            
		 		String qualification = textField_3.getText();
            
		 		String cgpa = textField_4.getText();
		 		
		 		String mobileNumber = textField_5.getText();
		 		
		 		int length = mobileNumber.length();

            
		 		String msg = "" + firstName;
            
		 		msg += "\n";

                try
                {
                	if(firstName.isEmpty()!=true && lastName.isEmpty()!=true && emailId.isEmpty()!=true && qualification.isEmpty()!=true && cgpa.isEmpty()!=true && mobileNumber.isEmpty()!=true)
                	{
                		if(length!=10)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Please Enter 10 Digit Number");
                		}
                		
                		if(length>=10)
                		{
                			
                			String url = "jdbc:mysql://localhost:3306/vamsi";
         					
        		 			String user = "root";
        		 					
        		 			String password_1 = "8500095971@Vk";
        		 					
        		 			Class.forName("com.mysql.cj.jdbc.Driver");
        		 					
        		 			Connection conn = DriverManager.getConnection(url,user,password_1);
        		 					
        		 			Statement st = conn.createStatement();
        		 				
                            String query = "INSERT INTO register values('" + firstName + "','" + lastName + "','" + emailId + "','" +
                            
                            		qualification + "','" + cgpa + "','" + mobileNumber + "')";

                            int x = st.executeUpdate(query);
                        
                            if (x == 0) 
                            {
                            	JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    
                            } 
                            else 
                            {
                                JOptionPane.showMessageDialog(btnNewButton,
                                		
                                "Welcome, " + msg + "Your Response is sucessfully Submitted");
                            }
                            
                            JOptionPane.showMessageDialog(btnNewButton,"Thanks For Filling This Form We Will Get Back To You");
                            
                            conn.close();
                            
                            frame.dispose();
                          
                		}
                	}
                	     
                	else
                	{
                		if(firstName.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter firstName In TextField");
                		}
                		
                		else if(lastName.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter lastName In TextField");
                		}
                		
                		else if(emailId.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter emailId In TextField");
                		}
                		
                		else if(qualification.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter Qualification In TextField");
                		}
                		
                		else if(cgpa.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter cgpa In TextField");
                		}
                		
                		else if(mobileNumber.isEmpty()==true)
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Enter mobileNumber In TextField");
                		}
                		else
                		{
                			JOptionPane.showMessageDialog(btnNewButton,"Fill All The Data In TextFields");
                		}
                	}
                } 
                catch (Exception ei)
                {
                      ei.printStackTrace();
                }
           }
    });
	
	btnNewButton.setBounds(311, 216, 89, 23);
	
	panel.add(btnNewButton);
	
	JLabel label_6 = new JLabel("");
	
	label_6.setIcon(image1);
		
	label_6.setVerticalTextPosition(JLabel.CENTER);
		
	label_6.setVerticalAlignment(0);
		
	label_6.setBounds(0, 0, 450, 300);
		
	panel.add(label_6);
	}
}

