package vamsi;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main8 extends JFrame {
	
	static JFrame f = new JFrame();
	
	 JTable jt=new JTable();
	 
	 JScrollPane sp=new JScrollPane();
	
	 Main8()
	 {
			 String[][] data= new String[30][30];
			 
			 String column[]={"S.NO","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};   
			 
			 try
			    {
			    	String url = "jdbc:mysql://localhost:3306/reportoctober";
					
					String user = "root";
							
					String password = "8500095971@Vk";
							
					Class.forName("com.mysql.cj.jdbc.Driver");
							
					Connection conn = DriverManager.getConnection(url,user,password);
							
					Statement st = conn.createStatement();
							
					String sql = "Select * from employee";
					
					ResultSet rs = st.executeQuery(sql);
					
					int i = 0;
					
					while(rs.next())
					{
						
						String s_no =  rs.getString("S.NO");
			       		
						String vamsi = rs.getString("1");
						
						String adnan = rs.getString("2");
						
						String manoj = rs.getString("3");
						
						String sasi  = rs.getString("4");
						
						String sumanth = rs.getString("5");
						
						String karthik = rs.getString("6");
						
						String vijay = rs.getString("7");
						
						String kalyan = rs.getString("8");
						
						String saketh = rs.getString("9");
						
						String gopi = rs.getString("10");
						
						String aditya = rs.getString("11");
						
						String illayz = rs.getString("12");
						
						String prasad = rs.getString("13");
						
						String likith = rs.getString("14");
						
						String bharath = rs.getString("15");
						
						String eswar = rs.getString("16");
						
						String prudhivsh = rs.getString("17");
						
						String varun = rs.getString("18");
						
						String balachandra = rs.getString("19");
						
						String nikhil = rs.getString("20");
						
						
						data[i][0]=s_no;
						
						data[i][1]=vamsi;
						
						data[i][2]=adnan;
						
						data[i][3]=manoj;
						
						data[i][4]=sasi;
						
						data[i][5]=sumanth;
						
						data[i][6]=karthik;
						
						data[i][7]=vijay;
						
						data[i][8]=kalyan;
						
						data[i][9]=saketh;
						
						data[i][10]=gopi;
						
						data[i][11]=illayz;
						
						data[i][12]=aditya;
						
						data[i][13]=prasad;
						
						data[i][14]=likith;
						
						data[i][15]=bharath;
						
						data[i][16]=eswar;
						
						data[i][17]=prudhivsh;
						
						data[i][18]=varun;
						
						data[i][19]=balachandra;
						
						data[i][20]=nikhil;
						
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
			 
			 f.setSize(1300,700);  
			 
			 f.setVisible(true); 
			 
			 f.setTitle("Employee Salary Report");  
	 
		}
}
	