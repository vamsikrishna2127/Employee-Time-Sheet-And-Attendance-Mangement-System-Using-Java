package vamsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;  

public class Main9 extends JFrame {  
	
	 static JFrame f = new JFrame();
	
	 JTable jt=new JTable();
	 
	 JScrollPane sp=new JScrollPane();
	
	 Main9()
	 {
			 String[][] data= new String[30][25];
			 
			 String column[]={"EMP_ID","NAME","WORKED_HRS","PERCENTAGE","PRESENT","ABSENT"};   
			 
			 try
			    {
			    	String url = "jdbc:mysql://localhost:3306/reportoctober";
					
					String user = "root";
							
					String password = "8500095971@Vk";
							
					Class.forName("com.mysql.cj.jdbc.Driver");
							
					Connection conn = DriverManager.getConnection(url,user,password);
							
					Statement st = conn.createStatement();
							
					String sql = "Select * from time_sheet_database";
					
					ResultSet rs = st.executeQuery(sql);
					
					int i = 0;
					
					while(rs.next())
					{
						
						String Emp_id = rs.getString("EMP_ID");
						
						String Name = rs.getString("NAME");
						
						String Worked_hrs = rs.getString("Worked_HRS");
						
						String percentage = rs.getString("Percentage");
						
						String present = rs.getString("Present");
						
						String absent = rs.getString("Absent");
						
						data[i][0]=Emp_id;
						
						data[i][1]=Name;
						
						data[i][2]=Worked_hrs;
						
						data[i][3]=percentage;
						
						data[i][4]=present;
						
						data[i][5]=absent;
						
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
			 
			 f.setTitle("Time Sheet Of Employees");  
	 
		}
}