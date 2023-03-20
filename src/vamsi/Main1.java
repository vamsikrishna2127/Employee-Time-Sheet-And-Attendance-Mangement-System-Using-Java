package vamsi;

import java.awt.*;

import java.awt.event.*;

import java.io.*;

import java.sql.*;

import java.util.Scanner;

import javax.swing.*;

class Main1 extends JFrame {
	
	ImageIcon image;
	
	JFrame frame;
	
	static JFrame Frame_1;
	
	JButton button;
	
	JLabel label;
	
	JLabel label_1;
	
	JLabel lblNewLabel;

	JLabel lblNewLabel_1;
	
	JLabel lblNewLabel_2;
	
	ImageIcon image1;
	
	private JPanel panel;
	
	private JTextField User;
	
	private JTextField Password;
	
	Main1()
	{
		// Frame
		
		frame = new JFrame();
				
		frame.setTitle("Login Page");
		
		frame.setSize(750,750);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//frame.getContentPane().setBackground(Color.yellow);
					
		frame.setResizable(false);
				
		frame.setLayout(new BorderLayout());
					
		frame.setVisible(true);
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\VOOHA\\Pictures\\Screenshots\\Saved Pictures\\Instagram\\Nature3.jpeg")));
		
		frame.setLayout(new FlowLayout());
		
		label = new JLabel();
		
		frame.add(label);
		
		frame.setSize(730,730);
	
		// Panel :- Sub Frame
				
		panel = new JPanel();
		
		panel.setBackground(Color.WHITE);
		
		panel.setBounds(150,150,400,400);
		
		frame.add(panel);
		
        // Label :- Login Page
		
		lblNewLabel = new JLabel("LOGIN !");
						
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
						
		lblNewLabel.setBounds(100, 39, 250, 65);
				
		panel.add(lblNewLabel);
		
		// Label :- UserName
		
		lblNewLabel_1 = new JLabel("UserName");
				
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				
		lblNewLabel_1.setBounds(100, 113, 115, 25);
				
		panel.add(lblNewLabel_1);
				
		// Label :- Password
				
		lblNewLabel_2 = new JLabel("Password");
						
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
						
		lblNewLabel_2.setBounds(100, 162, 115, 32);
						
		panel.add(lblNewLabel_2);
			    
	    // TextField :- User (Entry)
		
		User = new JTextField();
			 	
		User.setForeground(Color.white);
			 	
		User.setBackground(Color.black);
			 		
	    User.setBounds(249, 113, 115, 26);
			 		
		panel.add(User);
			 		
		User.setColumns(10);
			 		
		// TextField :- Password (Entry)
		
		Password = new JTextField();
			 	
		Password.setForeground(Color.white);
			 	
		Password.setBackground(Color.black);
			 		
		Password.setBounds(249, 167, 115, 25);
			 		
		panel.add(Password);
		
		Password.setColumns(10);
		
		// Button :- Main
		
	    JButton Main = new JButton("Main");
					
	    Main.setBounds(263, 250, 89, 23);
	    
	    Main.setFocusable(false);
	    
	    //Main.setEnabled(false);
					
		panel.add(Main);
					
		Main.addActionListener(new ActionListener() {
				 		
		public void actionPerformed(ActionEvent evt) {
					 	
			Main14 NewWindow = new Main14();
			
			frame.dispose();
			
			}
							 
		});
		
		
		// Button :- Login
		
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
			 					
			 			String sql = "Select * from EmployeeDetail where UserName = '"+User.getText()+"' and Password = '"+Password.getText()+"'";
			 			
			 			ResultSet rs = st.executeQuery(sql);
			 			
			 			if(rs.next())
			 			{  
				 			
			 				JOptionPane.showMessageDialog(null, "Login Successfully");
			 				
			 				frame.dispose();
			 							 				
			 				run();
			 				
			 				Scanner s = new Scanner(System.in);
			 				
			 				System.out.println();
			 				
			 				System.out.println("####################### ^^^^^ $$$ New Appplications Of Employees From Database $$$ ^^^^^ ###################");
			 			
			 				System.out.println();
			 				
			 				System.out.print("Want To See Employee Data From MySql Database If Yes Type 'Y' : ");
			 				
                            char owner_2;
			 			    
			 			    owner_2 = s.next().charAt(0);
			 			    
			 			    System.out.println();
			 			    
			 			    if(owner_2== 'Y')
			 			    {
			 			    	NewApplications();
			 			    }
			 				
			 			    System.out.println();
			 			    
			 				System.out.println("####################### ^^^^^ $$$ Employee Details From Database $$$ ^^^^^ ###################");
			 			
			 				System.out.println();
			 				
			 				System.out.print("Want To See Employee Data From MySql Database If Yes Type 'Y' : ");
			 				
                            char owner_3;
			 			    
			 			    owner_3 = s.next().charAt(0);
			 			    
			 			    System.out.println();
			 			    
			 			    if(owner_3== 'Y')
			 			    {
			 			    	Database();
			 			    	
			 			    	System.out.println();
			 			    	
			 			    	System.out.println("Employee Time Sheet");
			 			    	
			 			    	System.out.println();
			 			    	
			 			    	Time_Sheet_Database();
			 			    }
			 				
			 				System.out.println("####################### ^^^^^ $$$ Employee Time Sheet $$$ ^^^^^ #######################");
			 				
			 				System.out.println();
			 				
			 				System.out.print("Want To See Employee Time Sheet If Yes Type 'Y' : ");

			 			    char owner_1;
			 			    
			 			    owner_1 = s.next().charAt(0);
			 			    
			 			    System.out.println();
			 			    
			 			    if(owner_1== 'Y')
			 			    {
			 			    	TimeSheet();
			 			    }
			 			    
			 			    else
			 			    {
			 			    	System.out.println("Bye Have A Good Day");
			 			    	
			 			    	System.out.println();
			 			    	
			 			    	System.out.println("Stay Home Stay Safe");
			 			    }
					    
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
			 		
			btnNewButton.setBounds(263, 216, 89, 23);
			 		
			panel.add(btnNewButton);
			
	 }
	
	public static void run() throws FileNotFoundException,ArrayIndexOutOfBoundsException
	
	{
		    Scanner s = new Scanner(System.in);
		    
		    String file = null;
			
			char owner_0;
			
			System.out.println("\n"+"####################### ^^^^^ $$$ Employee Details $$$ ^^^^^ #######################"+"\n");
		
			System.out.print("Do U Want To Know The Employee Id Press 'Y' :");
			
			owner_0 = s.next().charAt(0);
			
			System.out.println();
			
			if(owner_0=='Y')
			{
				EmployeeDetails();
				
				System.out.println("^^^^^^^ $$$$$ Opening Employee Interface $$$$$ ^^^^^^^");
			}
			
			else
			{
				System.out.println("^^^^^^^ $$$$$ Opening Employee Interface $$$$$ ^^^^^^^");
			}
			
		    do
		    {
			    System.out.print("\n"+"Enter The Employee Id : ");
			
			    int choice = s.nextInt();
			    
			    System.out.println();
			    
			    int r1 = 0;
			    
			    int r2 = 0;
			    
			    switch(choice)
			    {
			    
			    case 0:
		    	
		             file = "C:\\Users\\VOOHA\\Desktop\\Attendance.csv";
		         
		             break;
			    
			    case 1:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 1;
			         
			         break;
			        
			    case 2:
			    	
                     r1 = 0;
			    	 
			    	 r2 = 2;
			       
			         break;
			         
			    case 3:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 3;
			         
			    	 break;
			         
			    case 4:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 4;
			         
			         break;
			         
			    case 5:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 5;
			         
			         break;
			         
			    case 6:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 6;
			         
			         break;
			         
			    case 7:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 7;
			         
			         break;
			         
			    case 8:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 8;
			    	
			         break;
			         
			    case 9:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 9;
			         
			         break;
			         
			    case 10:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 10;
			         
			         break;
			         
			    case 11:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 11;
			         
			         break;
			         
			    case 12:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 12;
			        
			         break;
			         
			    case 13:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 13;
			         
			         break;
			         
			    case 14:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 14;
			         
			    	 break;
			         
			    case 15:
			    	
                     r1 = 0;
			    	 
			    	 r2 = 15;
			        
			         break;
			         
			    case 16:
			    	
                     r1 = 0;
			    	 
			    	 r2 = 16;
			        
			         break;
			         
			    case 17:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 17;
			        
			         break;
			         
			    case 18:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 18;
			         
			    	 break;
			         
			    case 19:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 19;
			         
			    	 break;
			         
			    case 20:
			    	
			    	 r1 = 0;
			    	 
			    	 r2 = 20;
			         
			         break;
			         
			    default :
			    	
			    	  System.out.println("Enter The Number Between 0 to 20 ");
			    }
			    
			  
			    file = "";
			    
			    FileReader  Freader = new FileReader("C:\\Users\\VOOHA\\Desktop\\Attendance.csv");
				
			    BufferedReader Breader = null;
				
				String line = "";
				
				if(choice==0)
				{
					try
					{
						Breader = new BufferedReader(Freader);
						
						while((line=Breader.readLine()) !=null)
						{
							String[] row = line.split(",");
							
							for(String index : row)
							{
								System.out.printf("%-15s",index);
							}
							
							System.out.println();
						}
					}
					
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					finally
					{
						try
						{
							Breader.close();
							
							Freader.close();
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
					}

				}
				
				else
				{
					try
					{
						Breader = new BufferedReader(Freader);
						
						while((line=Breader.readLine()) !=null)
						{
							 String[] values = line.split(",");

							 System.out.println(values[r1]+"\t\t\t"+values[r2]);
					
						}
						
						
					}
				    
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					finally
					{
						try
						{
							Breader.close();
							
							Freader.close();
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
					}
				    

				}
				
				System.out.println();
				
				System.out.println("\n"+"$$$$$ Another Employee Details $$$$$");
			
			    System.out.print("\n"+"Do You Want To See Another Employee Details Enter 'Y' - ");
			
			    owner_0 = s.next().charAt(0);
		     }
		
		     while(owner_0 == 'Y');
		}
	
	
	public static void Database()
	{
		try
		    {
		    	String url = "jdbc:mysql://localhost:3306/reportoctober";
				
				String user = "root";
						
				String password = "8500095971@Vk";
						
				Class.forName("com.mysql.cj.jdbc.Driver");
						
				Connection conn = DriverManager.getConnection(url,user,password);
						
				Statement st = conn.createStatement();
						
				String sql = "Select * from Employee";
				
				ResultSet rs = st.executeQuery(sql);
				
				Scanner b = new Scanner(System.in);
				
				System.out.println("Attendance And Salary Report");
				
				System.out.println();
			
		       	while(rs.next())
				{
		       		String line = ",";
		       		
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
						
					System.out.println(s_no+"\t"+vamsi+"\t"+adnan+"\t"
							
							+manoj+"\t"+sasi+"\t"+sumanth+"\t"+karthik+"\t"
							
                            +vijay+"\t"+kalyan+"\t"+saketh+"\t"+gopi+"\t"
                            
                            +aditya+"\t"+illayz+"\t"+prasad+"\t"+likith+"\t"
                            
                            +bharath+"\t"+eswar+"\t"+prudhivsh+"\t"+varun+"\t"
                            
                            +balachandra+"\t"+nikhil+"\t");
				}
		       	
				System.out.println();
				
				System.out.println("Database Connection Success");
				
				System.out.println();
		    }
		    
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
	
	public static void Time_Sheet_Database()
	{
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
				
				Scanner b = new Scanner(System.in);
				
				System.out.println("Attendance And Salary Report");
				
				System.out.println();
				
				System.out.println("SNO"+"\t"+"NAME"+"\t\t\t"+"W_HRS"+"\t"+"%"+"\t"+"PRESENT"+"\t"+"ABSENT");
				
			
		       	while(rs.next())
				{
		       		String line = ",";
		       		
		       		String Empid =  rs.getString("EMP_ID");
		       		
					String Name = rs.getString("NAME");
					
					String Worked_hrs = rs.getString("Worked_HRS");
					
					String percentage = rs.getString("Percentage");
					
					String present  = rs.getString("Present");
					
					String absent = rs.getString("Absent");
			
					System.out.println(Empid+"\t"+Name+"\t\t\t"+Worked_hrs+"\t"+percentage+"\t"+present+"\t"+absent);
				
				    System.out.println();
				}
		    }
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
		
	public static void TimeSheet() throws FileNotFoundException
	{

		String Time_Sheet_File = "C:\\Users\\VOOHA\\Desktop\\time sheet (1).csv";
	    
		FileReader  Freader = new FileReader(Time_Sheet_File);
		
		BufferedReader Breader = null;
		
		String line = "";
		
		try
		{
			Breader = new BufferedReader(Freader);
			
			while((line=Breader.readLine()) !=null)
			{
				String[] row = line.split(",");
				
				for(String index : row)
				{
					System.out.printf("%-15s",index);
				}
				
				System.out.println();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				Breader.close();
				
				Freader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("\n"+"Stay Home Stay Safe"+"\n");
	}
	
	public static void NewApplications()
	{
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
				
				while(rs.next())
				{
					Integer i = 1;
					
					String fname = rs.getString("firstName");
					
					String lname = rs.getString("lastName");
					
					String emailid = rs.getString("emailId");
					
					String qualification = rs.getString("qualification");
					
					String cgpa = rs.getString("cgpa");
					
					String M_Number = rs.getString("mobileNumber");
					
					System.out.println("Candidate   ^^^"+fname+"^^^");
					
					System.out.println("First Name    :"+fname+"\t");
					
					System.out.println("Last Name     :"+lname+"\t");
					
					System.out.println("EmailId       :"+emailid+"\t");
					
					System.out.println("Qualification :"+qualification+"\t");
					
					System.out.println("CGPA          :"+cgpa+"\t");
					
					System.out.println("MobileNumber  :"+M_Number+"\t");
					
					System.out.println("------------------------------------");
				
				}
				
				System.out.println("\n"+"Database Connection Success");
				
				System.out.println();
				
				System.out.println();
		    }
		    
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
	
		
	public static void EmployeeDetails()
	{
		System.out.println(    "ENTER - 0  - EMPLOYEE DETAILS "+" ^|^ \n"+ 
				
					           "ENTER - 1  - VAMSI            "+" ^|^ \n"+
 				
					           "ENTER - 2  - ADNAN            "+" ^|^ \n"+
					           
					           "ENTER - 3  - MANOJ            "+" ^|^ \n"+
					           
                               "ENTER - 4  - SASI             "+" ^|^ \n"+
                           
                               "ENTER - 5  - SUMANTH          "+" ^|^ \n"+
                           
                               "ENTER - 6  - KARTHIK          "+" ^|^ \n"+
                           
                               "ENTER - 7  - VIJAY            "+" ^|^ \n"+
                           
                               "ENTER - 8  - KALYAN           "+" ^|^ \n"+
                           
                               "ENTER - 9  - SAKETH           "+" ^|^ \n"+
                           
                               "ENTER - 10 - GOPI             "+" ^|^ \n"+
                           
                               "ENTER - 11 - ILLAYZ           "+" ^|^ \n"+
                           
                               "ENTER - 12 - MANOJ            "+" ^|^ \n"+
                           
                               "ENTER - 13 - PRASAD           "+" ^|^ \n"+
                           
                               "ENTER - 14 - LIKITH           "+" ^|^ \n"+
                           
                               "ENTER - 15 - BHARATH          "+" ^|^ \n"+
                           
                               "ENTER - 16 - ESWAR            "+" ^|^ \n"+
                           
                               "ENTER - 17 - PRUDHIVISH       "+" ^|^ \n"+
                           
                               "ENTER - 18 - VARUN            "+" ^|^ \n"+
                           
                               "ENTER - 19 - BALACHANDRA      "+" ^|^ \n"+
                           
                               "ENTER - 20 - NIKHIL           "+" ^|^ \n");
	}
}
