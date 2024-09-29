package web;

import java.util.Hashtable;
import java.util.Scanner;
class Student{

public class retirement {
	 private String name;
	private String dateOfBirth;
	private String course;

	public void Student(String dateOfBirth, String name, String course) {
	        this.dateOfBirth = dateOfBirth;
	        this.name = name;
	        this.course = course;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Date of Birth: " + dateOfBirth + ", Course: " + course;
	    }
	}
	public class hashtable {
	    public static void main(String[] args) {
	        Hashtable<Integer, Student> students = new Hashtable<>();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int numberOfStudents = sc.nextInt();
	        sc.nextLine();

	        for (int i = 0; i < numberOfStudents; i++) {
	            System.out.print("Enter roll number: ");
	            int rollNo = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter date of birth (YYYY-MM-DD):");
	            String dateOfBirth = sc.nextLine();

	            System.out.print("Enter name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter course enrolled: ");
	            String course = sc.nextLine();

	            students.put(rollNo, new Student());
	        }
	        System.out.println("\nStudent Data in Hashtable:");
	        for (Integer rollNo : students.keySet()) {
	            System.out.println("Roll No: " + rollNo + ", " + students.get(rollNo));
	        }
	           sc.close();
	    }
	}

}
