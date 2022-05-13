package week1.Day2;



//Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="madam";
		String rev="";
		
for (int i=0;i<p.length();i++)
{
	char ch=p.charAt(i);
	rev=ch+rev;
}
System.out.println("The Reverse word is :"+rev);

if(rev.equalsIgnoreCase(p))
{
	System.out.println("The given string is a palindrome");
	
}
else
{
	System.out.println("The given string is not palindrome");
}
}
}

