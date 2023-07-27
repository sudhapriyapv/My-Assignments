package week2.day3;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		super.deposit();
		System.out.println("Has only fixed deposits");
	}
	
	public static void main(String[] args) {
		AxisBank bf=new AxisBank();
		System.out.println("Savings balance is "+bf.savings(25000));
		bf.fixed(100000.23);
		bf.deposit();
	}

}
