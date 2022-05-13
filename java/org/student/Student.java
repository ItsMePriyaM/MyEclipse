package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public  static void studentName()
	{
		System.out.println("The Student name is LP");
	}
	
	public static void studentId()
	{
		System.out.println("The Student id is 1005");
	}
	
	public static void studentDept()
	{
		System.out.println("The Student Department is ECE");
	}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.collegeName();
		College.collegeCode();
		s.collegeRank();
		Department.deptName();
		Student.studentName();
		Student.studentName();
		Student.studentDept();
	}
}
