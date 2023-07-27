package week2.day3;

public class MyPhone {

	public static void main(String[] args) {
		
		Iphone ip=new Iphone();
		ip.startApp();
		ip.increaseVolume();
		ip.shutDown();
		ip.sendSms();
		ip.makeCall();
		
		System.out.println("*********************");
		
		iPad ip1 = new iPad();
		ip1.startApp();
		ip1.increaseVolume();
		ip1.shutDown();
		ip1.watchMovie();

	}

}
