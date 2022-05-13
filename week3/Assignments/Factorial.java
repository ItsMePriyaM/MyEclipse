package week3.Assignments;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input =5;
int fact=1;
for(int i=1;i<=input;i++)
{
	fact=fact*i;
	System.out.println(i);
	//1*1  Fact =1
	//1*2  Fact=2
	//2*3 Fact=6
	//6*4 Fact=24
	//24*5 Fact=120
}
System.out.println(fact);
int i=1;
int f=1;
while(i<=input)
{
	f=f*i;
	i++;
}
System.out.println("while loop fact"+f);
	}
	

}
