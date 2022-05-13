package week3.Assignments;

public class FindAll {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 1st Automation Interview $$ ";
		int specialChar=0;int character=0; int spaces=0; int num=0;
		
		//Change to array
		char[] charArray = test.toCharArray();
		
		for(char e : charArray)
		{
			if(Character.isLetter(e))
			{
				character++;
			}
			else if(Character.isDigit(e))
			{
				num++;
			}
			else if(Character.isWhitespace(e))
			{
				spaces++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("Letters : "+character);
		System.out.println("numbers :"+num);
		System.out.println("Spaces : "+spaces);
		System.out.println("Special Characters : "+specialChar);
		
		//Regular Expression 
		//To get the numbers alone
		String nums = test.replaceAll("[^0-9]","");
		System.out.println(nums);
		//To get alphabets
		String aplh = test.replaceAll("[^a-zA-Z]","");
		System.out.println(aplh);
		//To get the special chars
		String specialchars = test.replaceAll("[0-9a-zA-z  ]","");
		System.out.println(specialchars);
		
		
		
	}


}
