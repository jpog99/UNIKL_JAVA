 package day6_basicAPI;

public class StringEx01 {
	public static void main(String[] args) {
		//Extract particular char in String class's char value.
		String s1=" Demonstrate the understanding of object-oriented programming principles ";
		
		//1.Get the length of sentence using String class's method.
		System.out.println("Length of s1 is: "+s1.length());
		
		//2.Use String class's method to delete the space front and back of s1.
		//     ->trim method function is to delete any black space front n back.
		System.out.println("Length of s1 with no space front back:"+s1.trim().length());
		
		//3.Use String class's method to leave output only word "object"
		//    ->indexOf used to find the position num of character
		int idx=s1.indexOf("object");
		System.out.println(idx);
		//    ->substring used to remove everything except the character between the range
		String a= s1.substring(idx, idx+6);
		System.out.println(a);
		//also can:
		System.out.println(s1.substring(34, 40));
		
		//4.Output word one by one each in new line
		//   ->Split each words and store in array:
		String[] word=null;
		String s2 = s1.trim();
		word = s2.split(" ");
		//   ->output all word in array one by one
		//     Use extend for loop -> for (DataType Variable : Array var)
		for (String words : word)
			System.out.println(words);
		
		
	}
	

}
