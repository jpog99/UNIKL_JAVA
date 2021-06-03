package day03_control_loop;

public class ForAlphabet {
	
	public static void main(String [] args) {
		
		int temp = 65, letter;
		
		for (int row = 0; row<3 ; row++) {
			
			
			for (int space = 0 - row ; space<0 ; space++)
			System.out.print(" ");
			
		    
			for(letter = temp; letter < temp + 5 - 2*row ; letter++) 
			System.out.print((char)letter);
			
			temp=letter;
		
		System.out.println();
    }
  }
}