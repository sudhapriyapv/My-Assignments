package week2.day4;

import java.util.ArrayList;

import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		List<Integer> a1= new ArrayList<Integer>();
		List<Integer> b1= new ArrayList<Integer>();
		
		for (int i : a) {
		a1.add(i);	
		}
		System.out.println("First array is " +a1);
		
		for (int j : b) {
			b1.add(j);
		}
		System.out.println("Second array is " +b1);
		
		for (int x =0; x<a1.size();x++) {
			for ( int y=x; y<x+1; y++) {
				int a2=a1.get(x);
				int b2=b1.get(y);
				if(a2==b2) System.out.println("Both value " +a2+","+b2+ "are same");
				else System.out.println("Both value " +a2+","+b2+ "are different");
					
				}
			}
		}
}

