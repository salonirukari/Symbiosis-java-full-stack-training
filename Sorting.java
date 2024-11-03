package HomeWork;

// Example: Input: (1,0,2,0,3), Output: 1,2,3,0,0

public class Sorting 
{
	
	    public static void main(String[] args) 
	    {
	        int[] input = {1, 0, 2, 0, 3};
	        for (int i = 0; i < input.length; i++) 
	        {
	            System.out.print(input[i]);
	            if (i < input.length - 1) 
	            {
	                System.out.print(","); // separate elements with commas
	            }
	        }
	        System.out.println(); // print a newline at the end
	    }
	
}
