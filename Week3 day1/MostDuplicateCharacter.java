package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MostDuplicateCharacter {

		public static void main(String[] args) {
			String a="abbaba";
			char[] str1=a.toCharArray();
			Set<Character> str=new HashSet<Character>();
			Set<Character> dup=new LinkedHashSet<Character>();
			for(int i=0;i<str1.length;i++)
			{	
				if(str.add(str1[i]))
					dup.add(str1[i]);
			}
			System.out.print("After removing duplicate characters:");
			for(Character c:str)
			{
				System.out.print(c);
			}

		}

	}