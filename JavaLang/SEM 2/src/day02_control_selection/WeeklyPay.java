package day02_control_selection;

import java.util.Scanner;

public class WeeklyPay {
	
	public static void main(String[] args) {
		//입력값: noEmp, rate, hours
		//출력값: noEmp, rate, hours, weeklyPay, msg
		
		System.out.println("Enter employee's number, pay rate and number"
		+ " of hours worked in a week(with a space):");
		Scanner input = new Scanner (System.in);
		
		int noEmp=input.nextInt();
		double rate=input.nextDouble();
		int hours=input.nextInt();
		String msg=null;
		double weeklyPay=0.0;
		
		if(hours>60 || rate>25.0) {
			msg="Hours worked in a week can not exceed 60 hours "
					+ "and pay rate $25.00 per hour";
			
		}else {
			if (hours>35) {
				weeklyPay = 35*rate + (hours-35)*rate*1.5;
				
			}else {
				weeklyPay = hours*rate;
			}
		}
		
		System.out.println(noEmp+", "+rate+", "+hours+","+weeklyPay+","+msg);
		
	}

}
