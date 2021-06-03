package day07_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOEx03 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(new File("kor\\test2.txt"));
		//the constructor parameter MUST be File object
		System.out.println(sc.nextLine());
		
		System.out.println("done");
	}

}
	

