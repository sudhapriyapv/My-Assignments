package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int[] num= {1,2,3,1,3,6,8,3,9};
		Set<Integer> unique=new LinkedHashSet<Integer>();
		Set<Integer> dupvalue=new LinkedHashSet<Integer>();
		
		for (int i=0;i<num.length;i++) {
			//unique.add(num[1]);
			if(!unique.add(num[i])) {
				dupvalue.add(num[i]);
			}
		}
		
		System.out.println(unique);
		
		System.out.println(dupvalue);
		
		
	}

}
