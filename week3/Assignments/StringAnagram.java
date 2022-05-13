package week3.Assignments;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1= "stops";
String text2="posts";
char[] charArraytext1 = text1.toCharArray();
char[] charArraytest2 = text2.toCharArray();
Arrays.sort(charArraytext1);
Arrays.sort(charArraytest2);

//String stringText1 = charArraytext1.toString();
System.out.println(charArraytext1);
System.out.println(charArraytest2);
//System.out.println(stringText1);
//String stringText2= charArraytest2.toString();
//System.out.println(stringText2);
boolean equals = Arrays.equals(charArraytext1, charArraytest2);
if(equals)
{
	System.out.println("The String :"+text1+" and The String :"+text2+" is a anagram");
}


	}

}
