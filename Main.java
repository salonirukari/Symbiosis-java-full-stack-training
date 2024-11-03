package HomeWork;
//Remove All Adjacent Duplicates in Given String


public class Main 
{
	
	    public static String removeDuplicates(String str) 
	    {
	        StringBuilder result = new StringBuilder();
	        char prevChar = '\0';

	        for (char c : str.toCharArray()) 
	        {
	            if (c != prevChar) 
	            {
	                result.append(c);
	                prevChar = c;
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) 
	    {
	        String str = "TYBBACA";
	        System.out.println("The string after removing all adjacent duplicates is - " + removeDuplicates(str));
	    }
	
}
