package finalsem3;

import java.awt.event.ActionListener;

public interface testsangsokint {
	public default void carry() {
		System.out.println("carrysing...");
		
	}
	
	public default void checkStuff(testsangsokint stuff) {
		stuff.carry();
	}
}

class test{
	public static void main(String[] args) {
		Bag b = new Bag();
		
	}
}
