package day6_basicAPI;

public class StringBufferEx01 {
	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer(); 
	//useful when working with long text
	//use when working with text from copy or network
	//can be useful when working
	sb.append("A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified. At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls. ");
	sb.append("\nString buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the operations on any particular instance behave as if they occur in some serial order that is consistent with the order of the method calls made by each of the individual threads involved. ");
	sb.append("\nThe principal operations on a StringBuffer are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the characters of that string to the string buffer.");
	
	System.out.println(sb.toString());
	}
	

}
