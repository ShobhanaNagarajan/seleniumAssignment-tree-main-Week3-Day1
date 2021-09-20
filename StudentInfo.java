package org.studentsinfo;
   public class StudentInfo{
	   
	   public void getStudentInfo(int id) {
		   System.out.println("Student Id is: "+id);
		   	   }
	   
	   public void getStudentInfo(int id, String name)
	   {
		   System.out.println("Student Id:"+id);
		   System.out.println("Student Name:"+name);
		   	   
	   }
	   
	   public void getStudentInfo(String email, long phoneNo) {
		   System.out.println("Student e-mail: "+email);
		   System.out.println("Student PhoneNo:"+phoneNo);
	   }
	   
	   public static void main(String[] args) {
		   StudentInfo student = new StudentInfo();
		   student.getStudentInfo(18);
		   student.getStudentInfo(18, "shobi");
		   student.getStudentInfo("shophiya18@gmail.com", 963258741);
   }
   }