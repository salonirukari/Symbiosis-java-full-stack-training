package HomeWork;

/*Given an Integer Array, Find the Value Zero and Move it to the End of the Array While Maintaining 
the Relative Order of Non-Zero Elements*/

public class Int_Array 
{
	
	    public static void moveZerosToEnd(int[] arr) 
	    {
	        int count = 0; // count of non-zero elements
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] != 0) {
	                arr[count++] = arr[i]; // non-zero element, move it to the front
	            }
	        }
	        // fill remaining positions with zeros
	        while (count < arr.length) 
	        {
	            arr[count++] = 0;
	        }
	    }

	    public static void main(String[] args) 
	    {
	        int[] arr = {3, 5, 0, 0, 4, 0, 1};
	        moveZerosToEnd(arr);
	        System.out.println("Array after moving zeros to the end:");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }
 }

