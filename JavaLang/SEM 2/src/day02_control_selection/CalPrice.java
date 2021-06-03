package day02_control_selection;

import java.util.Scanner;

public class CalPrice {
	
	public static void main(String[] args) {
		System.out.println("Enter a customer's name, a purchase "
				+ "amount and a tax code (with space):");
		Scanner input = new Scanner(System.in);
		String name=input.next();
		double amt=input.nextDouble();
		int code=input.nextInt();
		
		double tot=0.0, tax=0.0;
		
		switch(code) {
		case 0: tax=0.0;break;
		case 1: tax=0.03;break;
		case 2: tax=0.05;break;
		case 3: tax=0.07;
		}
		
		tot=amt+amt*tax;
		System.out.println(name+","+amt+","+tax+","+tot);
	}

}
