package day07_io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOEx01 {
	public static void main(String[] args) throws Exception {
		
		//output "hi,my name is wan" to the test2.txt file in kor folder.
		FileWriter fw = new FileWriter("kor\\test2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw,true);
		
		pw.println("hi,my name is wan");
		
		System.out.println("end");
		
		
	}

}
