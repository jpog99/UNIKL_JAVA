package Projex;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class LoginWindow extends JFrame{
	
  private static final int FRAME_WIDTH = 250;
  private static final int FRAME_HEIGHT = 200;
  private File userData;
  static JTextField userNameField;
  static JPasswordField passwordField;
  JPanel panel = new JPanel();
 
  public LoginWindow() throws FileNotFoundException {
  createComponents();
  setSize(FRAME_WIDTH, FRAME_HEIGHT);
  }

  public void createComponents() throws FileNotFoundException{
    userNameField = new JTextField(10);
    passwordField = new JPasswordField(10);
    
    JLabel userNameLabel = new JLabel("User Name");
    JLabel passwordLabel = new JLabel("Password");
    
    JButton loginButton = new JButton("Login");
    JButton exitButton = new JButton("Exit");
    JButton reset = new JButton("Reset");
    JButton hint = new JButton("Hint");
    
    JPanel panel = new JPanel();
    panel.add(userNameLabel);
    panel.add(userNameField);
    panel.add(passwordLabel);
    panel.add(passwordField);
    panel.add(loginButton);
    panel.add(reset);
    panel.add(exitButton);
    add(panel);

 ActionListener exitListener = new ClickListener1();
 ActionListener loginListener = new ClickListener2();
 ActionListener resetlistener = new ClickListener3();
 exitButton.addActionListener(exitListener);
 loginButton.addActionListener(loginListener);
 reset.addActionListener(resetlistener);

 }
 
 
 public class ClickListener1 implements ActionListener {

   public void actionPerformed(ActionEvent event){
     System.exit(0);
   }
  }
 
 public class ClickListener3 implements ActionListener {

	   public void actionPerformed(ActionEvent event){
	     userNameField.setText("");
	     passwordField.setText("");
	   }
	  }
 
  public class ClickListener2 implements ActionListener {

   public void actionPerformed(ActionEvent event){
     File inputFile = new File("members.txt");
     
     String userNameInput = userNameField.getText();
     String passwordInput = passwordField.getText();
     
     try {
            Scanner in = new Scanner(new File("members.txt"));
            while (in.hasNext())
            {
              String s = in.nextLine();
              String[] members = s.split(",");
              boolean login = false;
              for(String member : members) {
            	  
	              String[] sArray = member.split("#");
	              
	              
	              if ((userNameInput.equals(sArray[0])) && (passwordInput.equals(sArray[1]))) {
	            	  login=true;break;
	              }
              }//end of for
              
              if (login)
              {
                JOptionPane.showMessageDialog(null,
                    "Login Successful", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
                try {
					MainWindow launch = new MainWindow();
				} catch (Exception e) {}
                
              }
              else
              {
            	  
                JOptionPane.showMessageDialog(null,
                    "Invalid Username / Password Combo", "Error",
                    JOptionPane.ERROR_MESSAGE);
              }//end of if
            }
            
            
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "User Database Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    
   }
  }

   public static void main(String[] args) throws FileNotFoundException
   {
   JFrame frame = new LoginWindow();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
   }
  }



