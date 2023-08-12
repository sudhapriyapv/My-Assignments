package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> unique=new LinkedHashSet<Integer>();
		Set<Integer> dupvalue=new LinkedHashSet<Integer>();
		
		for (int i=0;i<data.length;i++) {
			//unique.add(data[1]);
			if(!unique.add(data[i])) {
				dupvalue.add(data[i]);
			}
		}
		System.out.println(dupvalue);
	}

}
