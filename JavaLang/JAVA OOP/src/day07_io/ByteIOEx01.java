package day07_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteIOEx01 {

	public static void main(String[] args) {
		System.out.print("enter 1 byte: ");
		
		//write the input object that can input the data (in byte unit) through keyboard.,but the data is
		//input until there no input value.
		//Use loop statement.
		InputStream is = System.in;
		OutputStream os = System.out;
		try {
			
			int data = 0;
			while ((data = is.read())!=-1)
		
			//write the output object that can output the data (in byte unit) to monitor.
			
			os.write(data);
			
			System.out.println("\nexecution conplete");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(is!=null)
				try{
					os.close();
				}catch
				(IOException e){}
		}
	}

}
