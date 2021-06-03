package day07_io;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ObjectIOEx02 {
	public static void main(String[] args) throws Exception {
		//Define the input object which can input the object unit at student.obj file.
		FileInputStream fis = new FileInputStream("Student.obj");
		//add buffer ability and write the output object
		BufferedInputStream bis = new BufferedInputStream(fis);
		//define output object that can output object unit
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		//input Student object(downcasting)
		Student s = (Student)ois.readObject();
		
		System.out.println("name: "+s.name+"/nage: "+s.age+"/nid: "+s.age);
		
		System.out.println("done");
			
	
    }
}
