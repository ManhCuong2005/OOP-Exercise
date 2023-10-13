package Exercise_3;

import java.util.Scanner;

public class Student extends Person {
	private String studentId;
	private String nameSchool;
	
	
	public Student() {
		super();
		this.studentId = "";
		this.nameSchool = "";
	}
	
	public Student(String studentId, String nameSchool) {
		super();
		this.studentId = studentId;
		this.nameSchool = nameSchool;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", nameSchool=" + nameSchool + "]";
	}
	
	public void input () {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap vao MaSV: ");
		studentId = sc.nextLine();
		System.out.println("nhap vao ten truong: ");
		nameSchool = sc.nextLine();
	}
	
	public boolean checkStudentId() {
		return studentId == "23IT";
	}
	
	
}
