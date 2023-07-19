package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int firstnumber = 0;
		int secondnumber = 1;
		
		System.out.println("Fibanacci series till "+range+" range is ");
		
		for (int i = 1; i <=range; i++) {
			System.out.print(firstnumber+",");
			int sum = firstnumber+secondnumber;
			firstnumber = secondnumber;
			secondnumber = sum;
			
		}

	}

}
