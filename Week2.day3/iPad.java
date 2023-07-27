package week2.day3;

public class iPad extends Ios {
	
	public void watchMovie() {
		System.out.println("Use movie app to watch movie");
	}
	
	public void increaseVolume() {
		//System.out.println("Press volume button to increase oe drcrease volume");
		super.increaseVolume();
		System.out.println("Sound System is different");
	}

}
