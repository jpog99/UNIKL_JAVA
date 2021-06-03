package day08_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIEx01 extends JFrame implements ActionListener{
	JTextField tf1,tf2;
	public GUIEx01() {
		
		
		
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
		b1.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
		new GUIEx01();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//use JOptionPane class and Dialog class to show message dialog after click
		String name = tf1.getText();
		String id = tf2.getText();
		tf1.setText("");
		tf2.setText("");
		JOptionPane.showMessageDialog(this,"no");
		
	}

}

