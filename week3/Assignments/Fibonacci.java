package week3.Assignments;

import org.apache.poi.util.SystemOutLogger;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int sum=0;

//for(int i=0;i<=6;i++)
//{
//	System.out.println(sum);
//
//	a=b;
//	b=sum;
//	sum=a+b;
//}

//using while loop
int num=0;
while(num<=6)
{
	System.out.println(sum);
	a=b;
	b=sum;
	sum=a+b;
	num++;
}
	}

}
