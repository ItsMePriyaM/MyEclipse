package Week3.Day1.Assignments;

public class Desktop extends Computer {

	public static void desktopSize()
	{
		System.out.println("The size of the Desktop is : 10 inches");
	}
	
	public static void main(String[] args)
	{
		Desktop d=new Desktop();
		d.computerModel();
		Desktop.desktopSize();
	}
}
