package week3.Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=563;
int sum=0;

while(input>0)
{
	//Get the Last digit
	int rem=input%10;
	sum=rem+sum;
	input=input/10;
}
System.out.println(sum);
	}

}
