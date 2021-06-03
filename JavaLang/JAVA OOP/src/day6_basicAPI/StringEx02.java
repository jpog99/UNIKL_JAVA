package day6_basicAPI;

import java.util.Scanner;

public class StringEx02 {
	public static void main(String[] args) {
		String s1 = "Have a nice weekend!";
		
		//Find the index num of last "a"
		int idx = s1.lastIndexOf("a");
		System.out.println(idx);
		
		//Change "weekend" to "holiday"
		String s2 = s1.replace("weekend","holiday");
		System.out.println(s2);
		
		//Changing your first letter of your input value to upper case
		System.out.print("Enter word: ");
		Scanner kb = new Scanner(System.in);
		String ipt = kb.nextLine();
		String ipt2 = ipt.toUpperCase();
		char ans = ipt2.charAt(0);
		System.out.println(ans);
		
	}

}
