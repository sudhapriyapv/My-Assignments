package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] text=test.split(" ");
		
		for(int i=0; i<text.length;i++) {
			if(i%2 == 1) {
				char[] charArray = text[i].toCharArray();
				for (int j=charArray.length-1; j>=0;j--) {
				System.out.print(charArray[j]);
		}
	}else {
		System.out.print(" "+text[i]+" ");
	}
	}
}
}
