package week1.day2;

public class ConvertNegativeToPostive {

	public static void main(String[] args) {
		
		int num = -40;
		
		if (num<=0) {
			System.out.println("The number "+num+" is a Negative number");
		}else {
			System.out.println("The number "+num+" is a Positive number");
		}
		
	   num = num*(-1);
			System.out.println("The positive number is "+num);

	}

}
