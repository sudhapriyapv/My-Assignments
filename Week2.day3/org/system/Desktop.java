package week2.day3.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("16 inch desktop");
	}
	
	public void computerModel() {		
		//super.computerModel();
		System.out.println("Lenovo model");
	}
	
	public static void main(String[] args) {
		Desktop comp=new Desktop();
		comp.computerModel();
		comp.desktopSize();
		
	}
	
}
