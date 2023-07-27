package week2.day3;

public class Calculator {
	
	public int add(int x, int y) {
		int a = x+y;
		return a;
	}
	
	public void add(int x, int y, int z) {
		System.out.println("Second Add " +(x+y+z)); 
		
	}
	
	public float multiple( float a, float b) {
		float x = a*b;
		return x;
	}
	
	public void multiple(double a, double b ) {
		System.out.println("First mutiply " +(a*b));
	}

	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		System.out.println("First Add " +c.add(2, 3));
		c.add(5, 6, 2);
		c.multiple(12.8, 1.6);
		System.out.println("Second Multiply " +c.multiple(5.6f, 8.2f));
		

	}

}
