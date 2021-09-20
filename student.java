package org.college;

public class student extends Department{

	void StudentDept()
	{
		System.out.println("SoftwareEngineering");
		
	}
	
	void StudentName()
	{
		System.out.println("Shobi");
		
	}
	
	void StudentId()
	{
		System.out.println("455678");
	}
	
	public static void main(String[] args)
	{
		student std = new student();
		std.collegeName();
		std.collegeRank();
		std.collegeCode();
		std.deptName();
		std.StudentDept();
		std.StudentName();
		std.StudentId();
		
	}
}

	


