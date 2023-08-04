package week2.day4;

public class Automation extends MultipleLangauge{
	

	public void Java() {
		System.out.println("I am Learning Java");		
	}

	public void Selenium() {
		System.out.println("I am learning Selenium and Java");
	}

	
	public void ruby() {
		System.out.println("I will learn Ruby later");
	}

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.Java();
		auto.Selenium();
		auto.ruby();
		auto.python();

	}

}
