package myJavaFirstClass;

public class Student {

	String name="Priya";
	int rollNo=684167;
	
	public String College() {
		String CollegeName="MIT College";
		String state="TN";
		System.out.println("College Name is "+CollegeName);
		return state;
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Student name is "+s.name);
		System.out.println("Student roll no. is :"+s.rollNo);
		String collegeState=s.College();
		System.out.println("College State is "+collegeState);
	}
}
