package demo;
import java.util.*;

public class special_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter any caracter : ");
	        char ch = scanner.next().charAt(0);

	        // Using character class
	        if (Character.isAlphabetic(ch)) {

	            System.out.println(ch + " is A ALPHABET.");

	        } else if (Character.isDigit(ch)) {

	            System.out.println(ch + " is A DIGIT.");

	        } else {

	            System.out.println(ch + " is A SPECIAL CHARACTER.");

	        }

	    }
	}
		