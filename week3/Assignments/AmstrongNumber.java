package week3.Assignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=153;

int sum=0;
int remainder;

while(input>0)
{
	remainder=input%10;
	input=input/10;
	sum=sum+(remainder*remainder*remainder);
}
System.out.println(sum);
	}

}
