package week1.day3;

public class StringReverse {
	public static void main(String[] args) {
		
		String s = "Sudha";
		
		char[] ch = s.toCharArray();
        
        for(int i=0;i<ch.length;i++) {
            System.out.print(ch[i]);
        }
        
        //String reverse
        System.out.println();
        
        for (int j=ch.length-1;j>=0;j--) {
        	System.out.print(ch[j]);
        }
	}

}
