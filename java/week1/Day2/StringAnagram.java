package week1.Day2;

import java.util.Arrays;

public class StringAnagram {
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potis";
		int l1=text1.length();
		int l2=text2.length();
		
		
		if(l1==l2)
		{
			char[] array1=text1.toCharArray();
			char[] array2=text2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			//System.out.println(array1[2]);
			//System.out.println(array2[0]);
			//if(array1.equals(array2))
			boolean ana=Arrays.equals(array1, array2);
			if(ana)
			{
				System.out.println("The given strings "+text1+" and "+text2+" is a anagram");
			}
			System.out.println("The given string is not a anagram");
		}
		else
		{
		System.out.println("The given string is not a anagram");
		}

	}

}
