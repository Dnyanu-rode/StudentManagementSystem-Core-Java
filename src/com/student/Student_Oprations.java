package com.student;

import java.util.*;

public class Student_Oprations implements Student_Methods{

	ArrayList<Student> students = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
//add	
	public void addStudent() {
		try {
			System.out.println("Enter Student Id: ");
			int id=sc.nextInt();
			sc.nextLine();
			
			for(Student student : students) {
				if(student.getStudentId() == id) {
					System.out.println("Student Id Already Exists!");
					return;
				}
			}
			
			System.out.println("Enter Student Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter Course: ");
			String course= sc.next();
			
			System.out.println("Enter Marks: ");
			double marks=sc.nextDouble();
			
			if(marks < 0 || marks > 100) {
				System.out.println("Marks must be between 0 and 100.");
				return;
			}
			Student student = new Student(id, name, age, course, marks);
			
			students.add(student);
			System.out.println("Student added succesfully!");
			
		}catch(Exception e) {
			System.out.println("Invalid Input! please enter correct data.");
			sc.nextLine();
		}
	}
//view
	@Override
	public void viewStudent() {
		if(students.isEmpty()) 
		{
			System.out.println("No student record available!");
			return;
		}
		for(Student student: students) 
		{
			student.displayDetails();
		}	 
	}
//search
	@Override
	public void searchStudent() {
		System.out.println("Enter Student Id to search: ");
		int id=sc.nextInt();
		
		for(Student student: students) {
			if(student.getStudentId() == id) {
				System.out.println("Student Found! ");
				student.displayDetails();
				return;
			}
		}
		System.out.println("Student Not Found! ");
	}
	
//update
	@Override
	public void updateStudent() {
		System.out.println("Enter Student Id to Update: ");
		int id =sc.nextInt();
		sc.nextLine();
		
		for(Student student :students) {
			if(student.getStudentId()==id) {
				System.out.println("Enter new name: ");
				String name = sc.next();
				
				System.out.println("Enter new age: ");
				int age=sc.nextInt();
				
				System.out.println("Enter new Course: ");
				String course= sc.next();
				
				System.out.println("Enter new Marks: ");
				double marks=sc.nextDouble();
				
				student.setName(name);
				student.setAge(age);
				student.setCourse(course);
				student.setMarks(marks);
				
				System.out.println("Student updated succesfully!");
				return;
				
				}
			}
		System.out.println("Student Not Found! ");
		}
	
//delete
	@Override
	public void deleteStudent() {
		System.out.println("Enter Student Id to delete: ");
		int id= sc.nextInt();
		sc.nextLine();
		
		for(Student student:students) {
			if(student.getStudentId()==id) {
				students.remove(student);
			System.out.println("Student deleted successfully!");
			return;
			}
		}
		System.out.println("Student Not Found! ");	
	}
	
//find topper
	public void findTopper() {
		if(students.isEmpty()) {
			System.out.println("Student record not available!");
			return;
		}
		Student topper = students.get(0);
		
	for(Student student: students) {
		if(student.getMarks()>topper.getMarks()) {
			topper=student;
		}
	}
	System.out.println("\n********* Topper *********");
	topper.displayDetails();
	
	}
	
//calculate Average marks
	public void calcAvgMarks() {
		
		if(students.isEmpty()) {
			System.out.println("Student record not available!");
			return;
		}
		double total = 0;
		
		for(Student student:students) {
			total += student.getMarks();
		}
		
		double Average = total/students.size();
		
		System.out.println("Average Marks: "+Average);
		
	}
	
//student sort by marks

	public void sortStudentByMarks() {
		if(students.isEmpty()) {
			System.out.println("Student record not available!");
			return;
		}
		
		Collections.sort(students,new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
			return Double.compare(
					s2.getMarks(),
					s1.getMarks()
					);
			}
		});
		
		System.out.println("Student sorded by marks");
		viewStudent();
	}
	
//search by course
	public void searchByCourse() {
		sc.nextLine();
		
		System.out.println("Enter Course Name: ");
		String course=sc.nextLine();
		
		boolean found = false;
		
		for(Student student: students) {
			if(student.getCourse().equalsIgnoreCase(course)) {
			student.displayDetails();
			found=true;
			}
		}
		if(!found) {
			System.out.println("No student found in this course!");
		}
	}
}