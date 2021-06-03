package day03_control_loop;

public class ForStar01 {

	public static void main(String[] args) {
		
		/*for(int row=0 ; row<4; row++) {   
			for(int star=1+2*row; star>0; star--)                       
			System.out.print("*");
			System.out.println();                                        
		*/
		for(int row=0 ; row<7; row++) {
			
			for(int star=6-2*row; star<7; star++)
				System.out.print("*");
			
			System.out.println();
	}
	}
}	