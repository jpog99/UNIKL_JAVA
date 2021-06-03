package day07_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteIOEx03 {

	public static void main(String[] args) {
		System.out.print("enter data: ");
		
		//write the input object that can input the data (in byte unit) through keyboard.,but the data is
		//input until there no input value.
		//Use loop statement.
		
		try (InputStream is = System.in ; OutputStream os = System.out) {      //can write like this after se7
			
			byte[] data = new byte[1024];
			is.read(data);
			os.write(data);
			
			
			System.out.println("\nexecution conplete");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
