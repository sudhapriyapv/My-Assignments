package week3.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String result = "";
		String text = "We learn java basics as part of java sessions in java week1";
		String[] string = text.split(" ");
		Set<String> word=new LinkedHashSet<String>(Arrays.asList(string));
		
		for (String s: word) {
			result = result + s +" ";
		}
		System.out.println("Sentence after removing duplicate words: " +result);
	}

}
