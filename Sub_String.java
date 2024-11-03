package HomeWork;

//Example: ("gaurav", "harshal")—2nd string starts with 'h', search it in the 1st string.


public class Sub_String 
{
	
	    public static void main(String[] args) {
	        String str1 = "gaurav";
	        String str2 = "harshal";

	        int start = str2.indexOf('h'); // Find the index of 'h' in str2
	        String substring = str2.substring(start); // Extract the substring starting from 'h'

	        if (str1.contains(substring)) { // Check if str1 contains the extracted substring
	            System.out.println("The substring 'harshal' starting with 'h' is found in the string 'gaurav'.");
	        } else {
	            System.out.println("The substring 'harshal' starting with 'h' is not found in the string 'gaurav'.");
	        }
	    }
	
}
	
