package soalan10;

public class test {
	public void checkProd(computer p) {
		if  (p instanceof laptop) {
			laptop lp = (laptop) p;
			lp.displayLT();
		}else if  (p instanceof tablet) {
			tablet tb = (tablet) p;
			tb.displayTb();
		} else {
			desktop dt = (desktop) p;
			dt.displayDT();
		}
	}
	public static void main(String[] args) {
		test t = new test();
		t.checkProd(null);
		
				
		
		              
	}

}
