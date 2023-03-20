package vamsi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;

public class ProgressBar extends JFrame {

	private JPanel contentPane;

	static JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressBar frame = new ProgressBar();
					frame.setVisible(true);
					frame.fill();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProgressBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar(0,2000);
		progressBar.setBounds(52, 118, 353, 30);   
		progressBar.setValue(0);    
		progressBar.setStringPainted(true);    
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Loading Please Wait .......");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel.setBounds(52, 49, 245, 41);
		contentPane.add(lblNewLabel);
	}
	
	public void fill()
	{
		int i = 0;
		
		try
		{
			while(i<=100)
			{
				progressBar.setValue(i);
				
				Thread.sleep(1000);
				
				i = i + 20;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}