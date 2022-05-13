	package week1.Day2;

public class StringCharOccurance {
	// Check number of occurrences of a char (eg 'e') in a String
	

				// declare and initialize a variable count to store the number of occurrences
				
				// convert the string into char array
					
				//get the length of the array
					
				// traverse from 0 till the array length 
					
					// Check the char array has the particular char in it 
				
					// if is has increment the count
						 
					
					// print the count out of the loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char[] strChar=str.toCharArray();
		int length = strChar.length;
		for(int i=0;i<length;i++)
		{
			if(strChar[i]=='e')
			{
				count=count+1;
			}
		}
		System.out.println("The number of occurence of e in "+str+" is:"+count);
		
		
	}

}
