package day03_control_loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessProductRecords {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner (new File("pr001.txt"));
			String data = input.nextLine();
			Scanner input2 = new Scanner (data);
			int no = input2.nextInt();
			
			while(no != 999) {
				String name = input2.next();
				int quant2018 = input2.nextInt();
				int quant2017 = input2.nextInt();
				String msg = null;
				
				if(quant2018>quant2017)
					msg = "increase";
				else
					msg = "decrease";
				
				int diff = quant2018 - quant2017;
				diff = Math.abs(diff);
						
				System.out.println(no + ", " + name + ", " + msg + " " + diff);		
				data = input.nextLine();
				no = input2.nextInt();
						
			}
			System.out.println("데이터 처리 완료");
		} catch (Exception e) {}
	}

}
