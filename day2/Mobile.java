package week1.day2;

public class Mobile {

	public void sendSms() {
		System.out.println("From Oppo");
	}
	
	public long makeCall(long phno) {
		
		return phno;
	}
	
	
	public static void main(String[] args) {
	
		Mobile MethodCall = new Mobile();
		
		MethodCall.sendSms();
		//MethodCall.makeCall(147258369);
		//long makeCall = MethodCall.makeCall(74125896);
		//System.out.println("Mobile number is " +makeCall);
		
	System.out.println(MethodCall.makeCall(145456656));

	}

}
