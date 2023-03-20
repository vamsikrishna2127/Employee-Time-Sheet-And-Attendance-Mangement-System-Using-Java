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

public class Main14 extends JFrame {
	
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
	
	JLabel label_4;
	
	JLabel label_5;
	
	ImageIcon image = new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\photo7.jpg");
	
	Main14()
	{
        frame = new JFrame();
        
		frame.setTitle("Welcome");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(100, 100, 650, 350);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		panel = new JPanel();
		
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		label_1 = new JLabel();
		 
		 label_2 = new JLabel();
		 
		 label_3 = new JLabel();
		 
		 label_4 = new JLabel();
		 
		 label_5 = new JLabel();
		
		 label_1.setText("Welcome");
	        
	     label_2.setText("Employee Time Sheet And Attendance Management");
	     
	     label_3.setText("Name");
	    
	     label_4.setText("Age");
	     
	     label_5.setText("*Please Enter The Above Details");
	        
	     label_1.setBounds(262, 11, 123, 32);
			
	     label_2.setBounds(23, 54, 590, 32);
	     
	     label_3.setBounds(161, 98, 69, 23);
	     
	     label_4.setBounds(161, 149, 46, 23);
	     
	     label_5.setBounds(61, 247, 385, 16);
	     
	     label_1.setForeground(Color.WHITE);
	     
	     label_2.setForeground(Color.WHITE);
	     
	     label_3.setForeground(Color.WHITE);
	     
	     label_4.setForeground(Color.WHITE);
	     
	     label_5.setForeground(Color.WHITE);
			
		 label_1.setFont(new Font("Snap ITC", Font.PLAIN, 20));
			
		 label_2.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		 
		 label_3.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		 
		 label_4.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		 
		 label_5.setFont(new Font("Snap ITC", Font.PLAIN, 20));
			
		 panel.add(label_1);
			
		 panel.add(label_2);
		
		 panel.add(label_3);
		 
		 panel.add(label_4);
		 
		 panel.add(label_5);
		 
		 JLabel label_6 = new JLabel("");
			
		 label_6.setIcon(image);
			
		 label_6.setVerticalTextPosition(JLabel.CENTER);
			
		 label_6.setVerticalAlignment(0);
			
		 label_6.setBounds(0, 0, 650, 350);
			
		 panel.add(label_6);
		
		 JTextField textField = new JTextField();
		 textField.setBounds(303, 101, 109, 20);
		 panel.add(textField);
		 textField.setColumns(10);
			
		 JTextField textField_1 = new JTextField();
		 textField_1.setBounds(305, 154, 107, 20);
		 panel.add(textField_1);
		 textField_1.setColumns(10);
		
		 String[] gender = {"male","female","others"};
		 JComboBox comboBox = new JComboBox(gender);
		 comboBox.setBounds(159, 198, 69, 23);
		 panel.add(comboBox);
			
		 JCheckBox chckbxNewCheckBox = new JCheckBox("I'm Not A Robot");
		 chckbxNewCheckBox.setBounds(274, 198, 137, 23);
		 panel.add(chckbxNewCheckBox);
			
		 JButton btnNewButton = new JButton("Continue");
	        
			btnNewButton.addActionListener(new ActionListener() {
		 		
				public void actionPerformed(ActionEvent evt) {
							 	
					String Name = textField.getText();
					
					String Age = textField_1.getText();
					
					String Gender = (String) comboBox.getSelectedItem();
					
					try
					{
						if(Name.isEmpty()!=true && Age.isEmpty()!=true && chckbxNewCheckBox.isSelected()==true)
						{
							if(comboBox.getSelectedItem().equals("male") || comboBox.getSelectedItem().equals("female") || comboBox.getSelectedItem().equals("others"))
							{
								try
								{
									String url = "jdbc:mysql://localhost:3306/vamsi";
		         					
		        		 			String user = "root";
		        		 	
		        		 			String password_1 = "8500095971@Vk";
		        		 					
		        		 			Class.forName("com.mysql.cj.jdbc.Driver");
		        		 					
		        		 			Connection conn = DriverManager.getConnection(url,user,password_1);
		        		 					
		        		 			Statement st = conn.createStatement();
		        		 				
		                            String query = "INSERT INTO Users values('" + Name + "','" + Age + "','" + Gender +"')";

		                            int x = st.executeUpdate(query);
		                        
		                            if (x == 0) 
		                            {
		                            	JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
		                            } 
		                            else 
		                            {
		                                JOptionPane.showMessageDialog(btnNewButton,
		                                		
		                                "Welcome, " + Name + " You Can Proceed Now");
		                                
		                                Main12 obj = new Main12();
										
										frame.dispose();
		                            }
		                            
		                            frame.dispose();
		                            
		                            conn.close();
	                				
	                			}
								
								catch(Exception e)
								{
                                    e.printStackTrace();
								}
							}
						}
						
						else if(chckbxNewCheckBox.isSelected()==false && (comboBox.getSelectedItem().equals("male") || comboBox.getSelectedItem().equals("female") || comboBox.getSelectedItem().equals("others")))
						{
							JOptionPane.showMessageDialog(btnNewButton, "Please Click The CheckBox And ComboBox");
						}
						
						else 
						{
							JOptionPane.showMessageDialog(btnNewButton, "Please Enter Name And Age");
						}
						
					}
					
					
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					}
									 
				});
			
			btnNewButton.setBounds(450, 128, 89, 23);
			btnNewButton.setFocusable(false);
			panel.add(btnNewButton);
	}

}
