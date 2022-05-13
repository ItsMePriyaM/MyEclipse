package Week3.day2.Classroom;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
	public static void main(String[] args) {
		
//		Declare a String as PayPal India
	String s="PayPal India";
//	Convert it into a character array
	char[] ch=s.toCharArray();
//	Declare a Set as charSet for Character
	Set<Character> charset=new LinkedHashSet<Character>();
//	Declare a Set as dupCharSet for duplicate Character
	Set<Character> dupCharSet =new LinkedHashSet<Character>();
//	Iterate character array and add it into charSet
	for(char i=0;i<ch.length;i++)
	{
		if(!charset.add(ch[i]))
		//{
			//System.out.println(charset);
		//}
		//else
		{
//			if the character is already in the charSet then, add it to the dupCharSet
			dupCharSet.add(ch[i]);
			System.out.println("The Duplicates are "+dupCharSet);
		}
	}


//		Check the dupCharSet elements and remove those in the charSet

for(Character c :dupCharSet)
	{
		if(charset.contains(c))
		{
			charset.remove(c);
		}
	}

//		Iterate using charSet
	for(Character cc : charset)

//		Check the iterator variable isn't equals to an empty space
	{
		if(cc == ' ')
		{
			
		}
		else
		{
			System.out.println(cc);
		}
	}

//		print each character for charSet

	
}
}
