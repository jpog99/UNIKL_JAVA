package day7_io;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataIOEx01 {

	public static void main(String[] args) throws IOException {
		//create test.dat file in kor//data
		//and output char 'A', double '3.14', and boolean 'true'
		
		File f = new File ("char\\test.dat");
		f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos); 
		
		
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeDouble(3.14);
		
		//to input:
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis); 
		
		
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
	}

}
