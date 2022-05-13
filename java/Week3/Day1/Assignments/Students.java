package Week3.Day1.Assignments;

public class Students {

	public static void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public static void getStudentInfo(int id,String name)
	{
		System.out.println(id+","+name);
	}
	public static void getStudentInfo(String email,long ph)
	{
		System.out.println(email+","+ph);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Students.getStudentInfo(1003);
       Students.getStudentInfo(1003, "Priya");
       Students.getStudentInfo("lakshmi.priyam92@gmail.com", 212321313221L);
	}

}
