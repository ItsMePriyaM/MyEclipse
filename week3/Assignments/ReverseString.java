package week3.Assignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="I am checking reverse string";
StringBuilder str=new StringBuilder(input);
System.out.println(str.reverse());

//using for loop
for(int i=input.length()-1;i>=0;i--)
{
	System.out.println(input.charAt(i));
}
	}

}
