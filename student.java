package pro;
import java.util.*;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String studentName;
		Scanner sc=new Scanner(System.in);
		
		student s1=new student();
		
		System.out.println("Enter student name:");
		studentName=sc.nextLine();
		
		System.out.println("Enter student age:");
		age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Student is able to vote");
		}
		else
		{
			System.out.println("Student is not able to vote");
		}
		}
}

		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	


	


