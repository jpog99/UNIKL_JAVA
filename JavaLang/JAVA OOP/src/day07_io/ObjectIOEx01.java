package day07_io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectIOEx01 {
	public static void main(String[] args) throws Exception {
		//Define the output object which can output the object unit at student.obj file.
		FileOutputStream fos = new FileOutputStream("Student.obj");
		//add buffer ability and write the output object
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//define output object that can output object unit
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Student s = new Student("wan",23,"231323");
		
		//output the object to Student.obj file
		oos.writeObject(s);
		
		System.out.println("done");
			
	
    }
}
