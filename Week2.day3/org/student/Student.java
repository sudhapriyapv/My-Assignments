package week2.day3.org.student;

import week2.day3.org.department.Department;

public class Student extends Department{
	public void studentName(String name) {
		System.out.println("Student name is " +name);
	}
	public void studentDept(String dept) {
		System.out.println("Student belongs to " +dept);;
	}
	public void studentId(int id) {
		System.out.println("Student ID is " + id);
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		
		st.deptName();
		st.studentName("Tharan");
		st.studentId(230015);
		st.studentDept("CSE");
		st.studentName("Lakshita");
		st.studentId(230078);
		st.studentDept("EEE");
		
	}
	

}
