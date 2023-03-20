package vamsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;  

public class Main7 extends JFrame {  
	
	 static JFrame f = new JFrame();
	
	 JTable jt=new JTable();
	 
	 JScrollPane sp=new JScrollPane();
	
	 Main7()
	 {
			 String[][] data= new String[30][10];
			 
			 String column[]={"FIRSTNAME","LASTNAME","EMAILID","QUALIFICATON","CGPA","MOBILENUMBER"};   
			 
			 try
			    {
			    	String url = "jdbc:mysql://localhost:3306/vamsi";
					
					String user = "root";
							
					String password = "8500095971@Vk";
							
					Class.forName("com.mysql.cj.jdbc.Driver");
							
					Connection conn = DriverManager.getConnection(url,user,password);
							
					Statement st = conn.createStatement();
							
					String sql = "Select * from register";
					
					ResultSet rs = st.executeQuery(sql);
					
					int i = 0;
					
					while(rs.next())
					{
						
						String fname = rs.getString("firstName");
						
						String lname = rs.getString("lastName");
						
						String emailid = rs.getString("emailId");
						
						String qualification = rs.getString("qualification");
						
						String cgpa = rs.getString("cgpa");
						
						String M_Number = rs.getString("mobileNumber");
						
						data[i][0]=fname;
						
						data[i][1]=lname;
						
						data[i][2]=emailid;
						
						data[i][3]=qualification;
						
						data[i][4]=cgpa;
						
						data[i][5]=M_Number;
						
						i++;
						
					}
					
			    }
			    
			    catch(Exception e)
			    {
			    	e.printStackTrace();
			    }
			 
			 DefaultTableModel model = new DefaultTableModel(data,column);
			 
			 jt=new JTable(model);  
			 
			 jt.setBounds(30,40,900,400);  
			 
			 sp=new JScrollPane(jt);  
			 
			 f.add(sp);
			 
			 f.setResizable(false);
			 
			 f.setSize(700,700);  
			 
			 f.setVisible(true); 
			 
			 f.setTitle("New Applications From Database");  
	 
		}
}