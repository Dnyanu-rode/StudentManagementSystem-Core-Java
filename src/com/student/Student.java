package com.student;

public class Student extends Person {
	private int studentId;
	private String course;
	private double marks;
	
	public Student(int studentId,String name, int age, String course, double marks) {
		
		super(name,age);
		
		this.studentId=studentId;
		this.course=course;
		this.marks= marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String calculateGrade() {
		if(marks >= 90) {
			return"A+";
		}else if(marks >= 80) {
			return"A";
		}else if(marks >= 70) {
			return"B";
		}else if(marks >= 60) {
			return"C";
		}else if(marks >= 50) {
			return"D";
		}else if(marks >= 40) {
			return"E";
		}else {
			return"Fail!";
		}
	}
	
	public void displayDetails() {
		System.out.println("-----------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println("-----------------------------");
	}
	
}
