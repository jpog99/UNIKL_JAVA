package day08_GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class GUIEx03 extends JFrame{
	
	JTextField tf1,tf2;
	public GUIEx03() {
			
		setTitle("test");
		setSize(400, 400);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));
		
		JPanel p1 = new JPanel();
		JLabel l1 = new JLabel("name");
		p1.add(l1);
		tf1 = new JTextField(10);
		p1.add(tf1);
		add(p1);
		
		
		JPanel p2 = new JPanel();
		JLabel l2 = new JLabel("id");
		p2.add(l2);
		tf2 = new JTextField(10);
		p2.add(tf2);
		add(p2);
		
		JPanel p3 = new JPanel();
		JButton b1 = new JButton("check");
		p3.add(b1);
		add(p3);
		b1.addActionListener(new EventHandler());
		
		
	}
	public static void main(String[] args) {
		new GUIEx03();
}	
	
	
	class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = tf1.getText();
		String id = tf2.getText();
		tf1.setText("");
		tf2.setText("");
		
		//after input the info in textbox and click 'check', the data will be stored into 'student.txt file	
		try(
		FileWriter fw = new FileWriter("kor\\student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		) {
			pw.println("name: "+name+", id: "+id);
			JOptionPane.showMessageDialog(GUIEx03.this, "Data is stored in student.txt!");
		} catch (IOException e1) {}		
}
}	
}
 
