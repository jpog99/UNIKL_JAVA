package soalan13;

import java.io.File;
import java.util.Scanner;

public class testfile {
	
	public static void checkFile (String path) {
		path = "C:\\Users\\ACER\\Desktop\\NARUTO SHIPPUDEN Ultimate Ninja STORM 4";
		
		
		
		File dir = new File(path);
		File [] files = dir.listFiles();
		
		System.out.println("file are: \n");
		for (File file : files) {
			
			if (file.isFile()) {
				System.out.println(file.getName());
				
			}
		}
		System.out.println("dir are: \n");
        for (File file : files) {
			
			if (file.isDirectory()) {
				System.out.println(file.getName());
			}
			}
		
	}
	
	public static void main(String[] args) {
		testfile ts = new testfile();
	
		ts.checkFile(null);
	}

}
