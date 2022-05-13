package week1.Day2;

public class StringFindTypes {

	// Build the logic to find the count of each
	/* Pseudo Code:
		a) Convert the String to character array
		b) Traverse through each character (using loop)
		c) Find if the given character is what type using (if)
				i)  Character.isLetter
				ii) Character.isDigit
				iii)Character.isSpaceChar
				iv) else -> consider as special character
	*/

	// Print the count here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] testchar=test.toCharArray();
		
		for(int i=0;i<testchar.length;i++)
		{
			if(Character.isLetter(testchar[i]))
			{
				System.out.println("The given char "+testchar[i]+" is a letter");
				letter=letter+1;
			}
			else if(Character.isDigit(testchar[i]))
			{
				System.out.println("The given char "+testchar[i]+" is a digit");
				num=num+1;
			}
			else if(Character.isSpaceChar(testchar[i]))
			{
				System.out.println("The given char "+testchar[i]+" is a space");
				space=space+1;
			}
			
			else
			{
				System.out.println("The given char "+testchar[i]+" is a special Character");
				specialChar=specialChar+1;
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
