package week3.Assignments;

import java.util.HashMap;
import java.util.Map;

public class StringCharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		String input="elementery";
		
		char[] charArray = input.toCharArray();
		HashMap<Character, 	Integer> hashmapcount=new HashMap<Character, Integer>();
		
		for(char e : charArray)
		{
			if(hashmapcount.containsKey(e))
			{
				hashmapcount.put(e, hashmapcount.get(e)+1);
			}
			else
			{
				hashmapcount.put(e, 1);
			}
		}
		 for (Map.Entry entry : hashmapcount.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
		
	}

}
