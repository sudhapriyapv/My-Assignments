package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] arr = {"Google","Microsoft","TestLeaf","Maverick","Aspire Systems","Wipro","HCL","CTS"};
		int count = arr.length;
		System.out.println("No of strings is " +count);
		Collections.sort(Arrays.asList(arr));
		System.out.println("Before Revesing ");
		System.out.println(Arrays.toString(arr));
		
		List<String> name=new ArrayList<String>();
		
		for( int i=arr.length-1;i>=0;i--) {
			name.add(arr[i]);
		}
		System.out.println("After Reversing ");
		System.out.println(name);
	}

}
