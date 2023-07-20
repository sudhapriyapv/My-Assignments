package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch=test.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(i%2==0) {
			ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(new String(ch));
	}

}
