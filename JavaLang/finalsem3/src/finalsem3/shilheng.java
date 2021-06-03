package finalsem3;

public class shilheng {
	
	public static void checkStuff (Portable Stuff) {
		Stuff.carry();
		System.out.println(Stuff instanceof Bag);
	}
	
	public static void main(String[] args) {
		
	Bag b = new Bag();
    checkStuff(b);
	}
}