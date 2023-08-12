package week3.day1;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {55,57,32,78,98,65};
		Set<Integer> num = new TreeSet<Integer>();
		
		for(int i: data)
			num.add(i);
		System.out.println("Sorted order " +num);
		
		List<Integer> list= new ArrayList<Integer>();
		list.addAll(num);
		System.out.println("Second Largest number " +list.get(list.size()-2));
	}

}
