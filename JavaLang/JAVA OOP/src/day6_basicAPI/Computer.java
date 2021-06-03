package day6_basicAPI;

public class Computer implements Cloneable {
	String model;
	int price;
	//constructor is basic const which have no context and have parameters.
	//parameters is String model and int price and write is as member value.
	
	public Computer(){
		this ("ACER VX15",4399);
	}
	
	public Computer(String model,int price){
		this.model=model;
		this.price=price;
	}
	
	// override the toString method of Object (not Objectex1)class to output the content of member val
	//  by ctrl+space:
	public String toString() {
		return model+" -> "+price;
	}
	
	// override Object class's equal method to compare the member value's content,:
	public boolean equals(Object obj) {
		boolean result=false;
		//check if the obj value is not null and it's Computer class's object:
		if((obj!=null) && (obj instanceof Computer)){
			//must downcast again the ref value that upcasted through obj to access Computer member val.
			Computer com=(Computer)obj;
			if(model.equals(com.model) && (price==com.price))
				result=true;
		}
	return result;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Objectex1{
	public static void main(String[] args) {
		
		Computer com1=new Computer();
		
		//using Object class's toString method:
		System.out.println("toString method result: "+com1.toString());
		
		//use Object class's equal method
		//   ->compare object's address value
		Computer com2=new Computer();
		System.out.println("equals method result: "+com2.equals(com1));
		
		//use Object class's clone method
		//content that must make beforehand at Computer class:
		//   1.Must inherit Cloneable interface
		//   2.Must override clone method
		try{
			Computer com3 = (Computer) com2.clone();
			System.out.println("Copy of Computer object: "+com3);
		}catch(CloneNotSupportedException ce){
			ce.printStackTrace();
		}
		
	}
}

