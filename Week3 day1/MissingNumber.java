package week3.day1;


import java.util.HashSet;

import java.util.Set;


public class MissingNumber {

	public static void main(String[] args) {

		int[] data= {1,4,5,6,1,7,5,1,3};
		Set<Integer> num = new HashSet<Integer>();
		for(int i: data)
			num.add(i);
		System.out.println(num);
		
		for (int i = 0; i < num.size(); i++) {
			if(!num.contains(i+1)) {
				System.out.println(i+1);
			}
		}
	}
}
