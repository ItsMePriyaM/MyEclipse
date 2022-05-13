package week1.Day2;



public class ArmstrongNumber {
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int calculated=0;
int remainder;
int original;


original=num;

while(num>0)
{
	remainder=num%10;
			
	num=num/10;
	        //System.out.println("The number  in this step is "+num);
	calculated=calculated+(remainder*remainder*remainder);
	        //System.out.println("The calculated sum in this step is "+calculated);
}
	if(calculated==original)
	{
		System.out.println("The Number :"+calculated+" is a armstrong number");
	}
	else
		System.out.println("The Number is not armstrong number");
}
	}


