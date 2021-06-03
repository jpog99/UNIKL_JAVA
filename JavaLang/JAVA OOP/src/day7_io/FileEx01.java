package day7_io;

import java.io.File;
import java.io.IOException;

public class FileEx01 {

	public static void main(String[] args) throws IOException {
		
		//use createNewFile method to create file (have IOexception)
		File f = new File("test.txt");
		f.createNewFile();
		
		//use mkdir method to create directory or folder
		File f2 = new File("char");
		f2.mkdir();
		
		//to create file in folder, use ('dir'//'file') as parameter
		File f3 = new File("char\\natsuki.dat");
		f3.createNewFile();
		File f4 = new File("char\\sayori.dat");
		f4.createNewFile();
		File f5 = new File("char\\yuri.dat");
		f5.createNewFile();
		File f6 = new File("char\\monika.dat");
		f6.createNewFile();
		
		//use listFile method to list filename
		File [] filenames = f2.listFiles();
		
		for (File fn : filenames){
			if(fn.isFile())
				System.out.println(fn.getName());
		}

	}

}
