package week3.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input= "madam"; 
String rev="";

for(int i=0;i<input.length();i++)
{
	char ch = input.charAt(i);
	rev=ch+rev;
}
System.out.println(rev);
if(rev.equalsIgnoreCase(input))
{
	System.out.println("The "+input+" is a palindrome");
}
else
{
	System.out.println("The "+input+" is not a palindrome");
}
	}

}
