package week3.day1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {

		int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1,2};
		Map<Integer,Integer> mp=new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int key= arr[i];
			if(mp.containsKey(key)) {
				int count= mp.get(key);
				count++;
				mp.put(key,count);			
				}
			else
				mp.put(key, 1);
		}
		System.out.println("Element --> Frequency");
		for( Entry<Integer,Integer> n: mp.entrySet())
		{
			System.out.println(n.getKey()+"-->" +n.getValue());
		}
	}
}
			