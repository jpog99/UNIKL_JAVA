package day07_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteIOEx02 {

	public static void main(String[] args) {
		System.out.print("enter 1 byte: ");
		
		//write the input object that can input the data (in byte unit) through keyboard.
		InputStream is = System.in;
		try {
			
			int data = is.read();
		
			//write the output object that can output the data (in byte unit) to monitor.
			OutputStream os = System.out;
			os.write(data);
			
			System.out.println("\nexecution conplete");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
