package question__2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loginID extends JFrame implements ActionListener {
	JTextField tf1;
	JPasswordField pass;
	public loginID() throws Exception {
		
		setTitle("test");
		setSize(400, 400);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("ID: ");
		p1.add(l1);
		tf1 = new JTextField(15);
		p1.add(tf1);
		 pass = new JPasswordField(15);
		p1.add(pass);
		JButton b1 = new JButton("Log In");
		
		p1.add(b1);
		b1.addActionListener(this);
		add(p1);
		
    }
	public void actionPerformed(ActionEvent event)
	   {
	    
	     File inputFile = new File("members.txt");
	   
	     String userNameInput = tf1.getText();
	     String passwordInput = pass.getText();
	     boolean login = false;
	     try {  
	            Scanner in = new Scanner(new File("members.txt"));
	            while (in.hasNext()) {
	              String s = in.nextLine();
	              String[] members = s.split("\n| ");
	               

	              if ((userNameInput.equals(members[0])) && (passwordInput.equals(members[1]))) {
	            	  login=true;break;
	              }
	              
	            
                }
	     }catch (FileNotFoundException e) {}
	      
	     
	     if (login) {
	            	  JOptionPane.showMessageDialog(this,
	                          "Login Successful", "Success",
	                          JOptionPane.INFORMATION_MESSAGE);
	            	  tf1.setText("");
	            	  pass.setText("");
	              }else {
	            	  JOptionPane.showMessageDialog(this,
	                          "Invalid Username / Password Combo", "Error",
	                          JOptionPane.ERROR_MESSAGE);
	              }
	
      }
	
	public static void main(String[] args) throws Exception {
		new loginID();
	}
}
