package day7_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class CharIOEx01 {
	
	public static void main(String[] args) {
		System.out.println("Enter data: ");
		
		//data example
		try(
		     //define input object that can get input (char unit) from keyboard.
		     Reader r = new InputStreamReader(System.in); 
		
             //define input gekche which have buffered ability
		     BufferedReader br = new BufferedReader(r);
				
		     Writer w = new OutputStreamWriter(System.in);
			 BufferedWriter bw = new BufferedWriter(w);
				
		     //define auto-flush ability to output (use PrintWriter)
			 PrintWriter pw = new PrintWriter(bw,true);
		   ) {
			
			String input = br.readLine();
			pw.println(input);
			
		} catch (IOException e) {
		
		}
	}
}
