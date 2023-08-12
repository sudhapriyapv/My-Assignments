package week3.day1;

import java.util.HashSet;

import java.util.Set;


public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String str = "sudhapriya";
		char[] array = str.toCharArray();
		System.out.println(array);
		Set<Character> uni= new HashSet<Character>();
		Set<Character> dup= new HashSet<Character>();
		for (int i=0;i<array.length;i++) {
			if(!uni.add(array[i])) {
				uni.remove(array[i]);
				dup.add(array[i]);
			}
		}
		System.out.println(uni);
	}

}
