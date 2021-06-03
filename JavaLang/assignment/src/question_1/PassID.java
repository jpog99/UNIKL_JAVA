package question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PassID {
	
	public static boolean verifyMember() throws FileNotFoundException  {
		
		boolean success = false;
		Scanner in = new Scanner(System.in);
		System.out.println("enter info la cb \nid: ");
		String namein = in.nextLine();
		System.out.println("pass lak:");
		String passin = in.nextLine();
		
		
			Scanner sc = new Scanner(new File("members.txt"));
			while (sc.hasNext()) {
				String member = sc.nextLine();
				String[] data = member.split("\n| ");
				
				if ((namein.equals(data[0])) && (passin.equals(data[1]))){
					success = true;break;
				}
			}
		
            
			return success;
			

	}
	
	public static void main(String[] args) throws FileNotFoundException  {
		
		boolean value = verifyMember();
		if(value) {
			System.out.println("lawo");
		}else {
			System.out.println("xleh");
		}
			
		
	}
}

