package soalan11;

public class testunikl extends School {
	public void Unikl(String name,String alamat) {
		this.name=name;
		this.alamat=alamat;
		
	}
	
	public void displayinfo() {
		System.out.println(name+" "+alamat);
	}
	
	public static void main(String[] args) {
		testunikl tu = new testunikl();
		tu.displayinfo();
	}

}
