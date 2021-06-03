package day07_io;

import java.io.Serializable;

//must inherit Serializable interface because it must have process
public class Student implements Serializable {
	
	//if use 'transient': to exclude the member value at object unit output 
	String name;
	transient int age;
	String id;
	
	public Student() {}
	//initialize member value by using constructor that have parameters.
	public Student(String name,int age,String id) {
		this.age=age;
		this.id=id;
		this.name=name;				
	}
}


