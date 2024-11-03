package HomeWork;
/*Define Two Strings as Value and Search Value, Return the Index of the First Character 
 * from the Search Value String in the Values String
 */
public class To_String 
{
	
	    public static void main(String[] args) 
	    {
	        String values = "Saloni Rukari"; // values string
	        String searchValue = "Rukari"; // search value string

	        int index = values.indexOf(searchValue.charAt(0)); 

	        if (index != -1) 
	        {
	            System.out.println("The first character of '" + searchValue + "' is found at index " + index + " in '" + values + "'");
	        } else 
	        {
	            System.out.println("'" + searchValue + "' not found in '" + values + "'");
	        }
	    }
	
}
