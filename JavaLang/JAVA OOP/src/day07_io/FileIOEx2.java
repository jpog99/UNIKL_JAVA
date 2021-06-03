package day07_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOEx2 {
	public static void main(String[] args) throws Exception {
		
		//read "hi,my name is wan" to the test2.txt file in kor folder to console.(also can
		//use scanner class->refer FileIOEx03)
		FileReader fr = new FileReader("kor\\test2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		System.out.println("end");
		
		
	}

}
