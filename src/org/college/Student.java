package org.college;

public class Student extends Hostel {
	private void studentName() {
		// TODO Auto-generated method stub
		System.out.println("the name of the student is priyanka");

	}
	private void studentId() {
		// TODO Auto-generated method stub
System.out.println("the studentid is 85787");
	}
	private void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("the student department is ECE");

	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
		s.collegename();
		s.collegecode();
		s.collegerank();
		s.hostelName();
		s.deptname();
	}

}
