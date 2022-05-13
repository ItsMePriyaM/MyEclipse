package Week3.Day1.Assignments;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Deposit method -AxisBank");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank a = new AxisBank();
a.deposit();
BankInfo b = new AxisBank();
b.deposit();//Here I expected the bankinfo Deposit to be called
b.fixed();
	}

}
