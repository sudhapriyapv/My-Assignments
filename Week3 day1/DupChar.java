package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupChar {
	
	public static void main(String[] args) {
		
		String comname = "google";
		char[] charArray = comname.toCharArray();
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> dup=new LinkedHashSet<Character>();
		
		
		for(int i=0;i<charArray.length;i++) {
			if(!unique.add(charArray[i])){
				dup.add(charArray[i]);
			}
			}
		System.out.println(unique);
		System.out.println(dup);
		
		
	}

}
