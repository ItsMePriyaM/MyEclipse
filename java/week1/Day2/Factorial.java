package week1.Day2;
/*
 * Goal: Find the Factorial of a given number
 * 
 * input: 5
 * output: 5*4*3*2*1 = 120
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
 *   
 * What are my learnings from this code?
 * 1)
 * 2)
 * 3) 
 * 
 */	

public class Factorial {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
int fact=1;
for(int i=1;i<=num;i++)
{
	fact=fact*i;
}
System.out.println(fact);
	}

}
