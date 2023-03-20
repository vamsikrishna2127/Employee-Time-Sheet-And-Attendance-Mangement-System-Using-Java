package vamsi;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main10 {
	
	JFrame f ;
	
	DefaultTableModel model;
	
	JTable table;
	 
	JScrollPane sp;
	
	Main10()
	{
	
	    String data[][] = {{"1","Vamsi","20","9949739596"},{"2","Adnan","19","9381702216"},
	    		
	    		           {"3","Manohar","20","9154106522"},{"4","Sasi","18","6301052190"},
	    		
	    		           {"5","Sumanth","19","8106998914"},{"6","Karthik","20","8639184596"},
	    		           
	    		           {"7","Vijay","20","9515643851"},{"8","Kalyan","19","9652527049"},
	    		           
	    		           {"9","Saketh","18","8500634978"},{"10","Gopi","19","6309479380"},
	    		           
	    		           {"11","Illayz","20","6281014683"},{"12","Aditya","21","8500515762"},
	    		           
	    		           {"13","Prasad","19","7815807198"},{"14","Likith","21","7760680277"},
	    		           
	    		           {"15","Bharath","19","6309751956"},{"16","Eswar","19","9676499515"},
	    		           
	    		           {"17","Prudhivsh","18","7995878726"},{"18","Varun","19","6302160625"},
	    		           
	    		           {"19","Bala_chandra","19","7569816698"},{"20","Nikhil","19","9441275014"}};
		
		String column[] = {"S.NO","Name","Age","Mobile_No"};
		
		model = new DefaultTableModel(data,column);
		 
		table=new JTable(model);  
		
		table.setBounds(30,40,900,400);  
		
		sp=new JScrollPane(table);  
		
		f = new JFrame();
		 
		f.add(sp);
		 
		f.setResizable(false);
		 
		f.setSize(700,700);  
		 
		f.setVisible(true); 
		 
		f.setTitle("Employee Details");  

	}
}
