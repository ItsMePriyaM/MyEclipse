package week1.Day2;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	 
		// TODO Auto-generated method stub
		

			int a=0;
			int b=1;
			int Sum=0;// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			
			public  void fibonnaci()
			{

				
			for(int i=1;i<10;i++)// Iterate from 1 to the range
			{
				System.out.println("The Fibonacci series for 1-10 is : "+Sum);	// print sum

				
				a=b;// Step 1 a=1 , Step 2 a=0 ,Step3 a=1, Step4 a=1...// Assign second number to the first number
				
				b=Sum;//Step 1 b=0 ,Step 2 b=1, Step 3 b=1 ,Step4 b=2...// Assign sum to the second number
				
				Sum=a+b;//Step 1 = 1 ,Step 2 Sum=1 , Step 3 Sum=2 ,Step 4 Sum=3..// add first and second number assign to sum
				
			}
			}
			public static void main(String[] args)
			{
				FibonacciSeries f=new FibonacciSeries();
				f.fibonnaci();
			}

			
}