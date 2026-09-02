package com.student;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Student_Oprations so = new Student_Oprations();
	
	int choise;
	
	
	do {
		System.out.println("\nSTUEDENT MANAGEMENT SYSTEM");
		System.out.println("1.Add Student");
		System.out.println("2.View All students");
		System.out.println("3.Search student by ID ");
		System.out.println("4.Update student");
		System.out.println("5.Delete student ");
		System.out.println("6.Find Topper");
		System.out.println("7.Calculate average marks");
		System.out.println("8.Sort student by marks");
		System.out.println("9.Search student by course ");
		System.out.println("10.Exit");
		
		System.out.println("Enter your Choise: ");
		
		try {
			choise = sc.nextInt();
			switch(choise) {
			case 1:
				so.addStudent();
				break;
			
			case 2:
				so.viewStudent();
				break;
			
			case 3:
				so.searchStudent();
				break;
				
			case 4:
				so.updateStudent();
				break;
				
			case 5:
				so.deleteStudent();
				break;
				
			case 6:
				so.findTopper();
				break;
				
			case 7:
				so.calcAvgMarks();
				break;
				
			case 8:
				so.sortStudentByMarks();
				break;
				
			case 9:
				so.searchByCourse();
				break;
				
			case 10:
				System.out.println("Thank you ! \nExiting Application...");
				break;
			
			default:
				System.out.println("Invalid choise  | try again !");
				
			}
		}catch(Exception e) {
			System.out.println("Invalid input | please Enter a number,");
			sc.nextLine();
			choise = 0;
		}
	}while(choise != 10);
	sc.close();
}
}