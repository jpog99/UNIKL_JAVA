package day07_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOEx04 {
	public static void main(String[] args) throws FileNotFoundException {
		//read the data(name,id,age) from student.txt in kor folder.
		//create 2x3 array and store each data in it.
		
		Scanner sc = new Scanner(new File("kor\\student.txt"));
		String [][] student = new String [2][3];
		
		int idx = 0;
		while (sc.hasNextLine()) {
			String stud = sc.nextLine();
			student[idx]=stud.split(" ");
			idx++;
		}
		
		for (String[] stud: student) {
			for (String data : stud) 
			    System.out.println(data+" ");
			
		}
		Scanner ip = new Scanner (System.in);
		String ha=ip.next();
		
	}

}
