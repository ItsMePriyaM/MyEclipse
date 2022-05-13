package week1.Day2;


/*
 * Goal: Find the sum of digits of a given number
 * 
 * input: 123
 * output: 1+2+3 = 6
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
 *   
 * What are my learnings from this code?
 * 1)
 * 2)
 * 3) 
 * 
 */




public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =123;
int sum=0
;

while(num>0)
{
	System.out.println("The number in this step is="+num);
	int rem=num%10;
	System.out.println("Reminder in this step is "+num+"%10="+rem);
	sum=rem+sum;
	System.out.println("The sum in this step is="+sum);
	num=num/10;
	
}
System.out.println("Sum Of digits is = "+sum);
	}

}
